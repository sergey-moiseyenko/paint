package com.smoiseyenko.gui;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.command.CommandHistory;
import com.smoiseyenko.gui.serialization.ShapesFileSerializer;
import com.smoiseyenko.model.repository.ShapeRepository;
import com.smoiseyenko.gui.listener.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Igor on 7/23/16.
 */
public class PaintFrame extends JFrame {

    private JMenuItem aboutPaintItem;
    private JMenuItem quitItem;
    private JMenuItem newItem;
    private JMenuItem openItem;
    private JMenuItem saveItem;
    private JMenuItem saveAsItem;
    private JMenuItem saveAsTemplate;
    private JMenuItem lineItem;
    private JMenuItem ellipseItem;
    private JMenuItem rectangleItem;
    private JPanel panel = new JPanel();
    private JMenuItem colorChooser;
    private JMenu insertMenu;
    private Context context;
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;

    public PaintFrame(Context context) {

        super("Paint");
        this.context = context;
        setUpUI();
        setUpListeners(context);
    }

    private void setUpUI() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar menu = new JMenuBar();

        JMenu paintMenu = new JMenu("Paint");
        aboutPaintItem = new JMenuItem("About Paint");
        quitItem = new JMenuItem("Quit");
        paintMenu.add(aboutPaintItem);
        paintMenu.addSeparator();
        paintMenu.add(quitItem);

        JMenu fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        saveAsItem = new JMenuItem("Save As");
        saveAsTemplate = new JMenuItem("Save As template");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.add(saveAsTemplate);

        JMenu editMenu = new JMenu("Edit");
        undoMenuItem = new JMenuItem("Undo");
        undoMenuItem.setMnemonic('Z');
        undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        redoMenuItem = new JMenuItem("Redo");
        redoMenuItem.setMnemonic('X');
        redoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);

        insertMenu = new JMenu("Insert");
        lineItem = new JMenuItem(ShapeRepository.LINE_NAME);
        ellipseItem = new JMenuItem(ShapeRepository.ELLIPSE_NAME);
        rectangleItem = new JMenuItem(ShapeRepository.RECTANGLE_NAME);
        insertMenu.add(lineItem);
        insertMenu.add(ellipseItem);
        insertMenu.add(rectangleItem);

        JMenu colors = new JMenu("Colors");
        colorChooser = new JMenuItem("Choose Color");
        colors.add(colorChooser);

        menu.add(paintMenu);
        menu.add(fileMenu);
        menu.add(editMenu);
        menu.add(insertMenu);
        menu.add(colors);
        setJMenuBar(menu);
        setContentPane(panel);
        context.setPanelSize(600, 400);
        setSize(600, 400);
        setVisible(true);
    }

    private void setUpListeners(Context context) {

        InsertMenuItemListener insertListener = new InsertMenuItemListener(context);
        ShapesFileSerializer serializableToFile = ShapesFileSerializer.getInstance();

        aboutPaintItem.addActionListener(new AboutItemListener(this));
        quitItem.addActionListener(new QuitItemListener(this));
        openItem.addActionListener(new OpenItemListener(serializableToFile, context));
        saveItem.addActionListener(new SaveItemListener(serializableToFile, context));
        saveAsItem.addActionListener(new com.smoiseyenko.gui.listener.SaveAsItemListener(ShapesFileSerializer.getInstance(), context));
        saveAsTemplate.addActionListener(new SaveAsTemplateListener(context, insertMenu));

        lineItem.addActionListener(insertListener);
        ellipseItem.addActionListener(insertListener);
        rectangleItem.addActionListener(insertListener);

        Graphics graphics = panel.getGraphics();
        context.setGraphics(graphics);
        CommandHistory commandHistory = CommandHistory.getCommandHistory();
        graphics.setClip(0, 0, panel.getWidth(), panel.getHeight());
        MouseListener mouseListener = new MouseListener(graphics, context, commandHistory);
        MouseMotionListener mouseMotionListener = new MouseMotionListener(graphics, context);
        panel.addMouseListener(mouseListener);
        panel.addMouseMotionListener(mouseMotionListener);
        newItem.addActionListener(new NewItemListener(graphics, context, this));

        UndoMenuItemListener undoMenuItemListener = new UndoMenuItemListener(commandHistory);
        RedoMenuItemListener redoMenuItemListener = new RedoMenuItemListener(commandHistory);
        undoMenuItem.addActionListener(undoMenuItemListener);
        redoMenuItem.addActionListener(redoMenuItemListener);

        colorChooser.addActionListener(new ChooseColorListener(panel, context));
    }
}


