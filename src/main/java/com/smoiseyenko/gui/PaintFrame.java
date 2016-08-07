package com.smoiseyenko.gui;

import com.smoiseyenko.gui.listener.*;
import com.smoiseyenko.gui.listener.MouseListener;
import com.smoiseyenko.gui.listener.MouseMotionListener;
import com.smoiseyenko.model.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

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
    private ArrayList<Shape> shapes;
    private JPanel panel = new JPanel();
    private MouseListener mouseListener;
    private MouseMotionListener mouseMotionListener;

    public PaintFrame() {

        super("Paint");
        mouseListener = new MouseListener(this);
        mouseMotionListener = new MouseMotionListener(this);
        setUpUI();
    }

    private void setUpUI() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.setSize(600, 400);
        panel.setBackground(Color.white);
        shapes = new ArrayList<Shape>();
        panel.addMouseListener(mouseListener);
        panel.addMouseMotionListener(mouseMotionListener);
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
        pencilItem = new JMenuItem("Line");
        pencilItem.addActionListener(new LineItemListener(this));
        ellipseItem = new JMenuItem("Ellipse");
        ellipseItem.addActionListener(new EllipseItemListener(this));
        rectangleItem = new JMenuItem("Rectangle");
        rectangleItem.addActionListener(new RectangleItemListener(this));
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

    public void shapeWasCreated(Shape shape) {

        shapes.add(shape);
    }

    public void repaintPanel() {

        panel.getGraphics().clearRect(0, 0, panel.getWidth(), panel.getHeight());

        Iterator<Shape> iterator = shapes.iterator();
        while (iterator.hasNext()) {

            iterator.next().draw(panel.getGraphics());
        }
    }

    public Graphics getGraphicsContext() {

        return panel.getGraphics();
    }

    public MouseMotionListener getMouseMotionListener() {

        return mouseMotionListener;
    }

    public MouseListener getMouseListener() {

        return mouseListener;
    }

    public void setName(String name) {

        mouseListener.setNameOfShape(name);
        mouseMotionListener.setNameOfShape(name);
    }
}
