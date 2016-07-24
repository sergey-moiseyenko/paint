package com.smoiseyenko.gui;

import com.smoiseyenko.gui.listener.*;

import javax.swing.*;

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
    private JMenuItem pencilItem;
    private JMenuItem ellipseItem;
    private JMenuItem rectangleItem;

    public PaintFrame() {

        super("Paint");
        setUpUI();
    }

    private void setUpUI() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JMenuBar menu = new JMenuBar();

        JMenu paintMenu = new JMenu("Paint");
        aboutPaintItem = new JMenuItem("About Paint");
        aboutPaintItem.addActionListener(new AboutItemListener(this));
        quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(new QuitItemListener(this));
        paintMenu.add(aboutPaintItem);
        paintMenu.add(quitItem);

        JMenu fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        newItem.addActionListener(new NewItemListener(this));
        openItem = new JMenuItem("Open");
        openItem.addActionListener(new OpenItemListener());
        saveItem = new JMenuItem("Save");
        saveItem.addActionListener(new SaveItemListener());
        saveAsItem = new JMenuItem("Save As");
        saveAsItem.addActionListener(new SaveAsItemListener());
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);

        JMenu insertMenu = new JMenu("Insert");
        pencilItem = new JMenuItem("Pencil");
        pencilItem.addActionListener(new PencilItemListener());
        ellipseItem = new JMenuItem("Ellipse");
        ellipseItem.addActionListener(new EllipseItemListenser());
        rectangleItem = new JMenuItem("Rectangle");
        rectangleItem.addActionListener(new RectangleItemListener());
        insertMenu.add(pencilItem);
        insertMenu.add(ellipseItem);
        insertMenu.add(rectangleItem);

        menu.add(paintMenu);
        menu.add(fileMenu);
        menu.add(insertMenu);
        setJMenuBar(menu);
        setContentPane(panel);
        setSize(600, 400);
        setVisible(true);
    }
}
