package com.smoiseyenko.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/23/16.
 */
public class PaintMenu extends JFrame {

    JMenuItem aboutPaintItem;
    JMenuItem quitItem;
    JMenuItem newItem;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem saveAsItem;
    JMenuItem pencilItem;
    JMenuItem ellipseItem;
    JMenuItem rectangleItem;
    private PressListener listener = new PressListener();
    private JFrame frame;

    public PaintMenu() {

        super("Paint");
        frame = this;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JMenuBar menu = new JMenuBar();

        JMenu paintMenu = new JMenu("Paint");
        aboutPaintItem = new JMenuItem("About Paint");
        aboutPaintItem.addActionListener(listener);
        quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(listener);
        paintMenu.add(aboutPaintItem);
        paintMenu.add(quitItem);

        JMenu fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        newItem.addActionListener(listener);
        openItem = new JMenuItem("Open");
        openItem.addActionListener(listener);
        saveItem = new JMenuItem("Save");
        saveItem.addActionListener(listener);
        saveAsItem = new JMenuItem("Save As");
        saveAsItem.addActionListener(listener);
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);

        JMenu insertMenu = new JMenu("Insert");
        pencilItem = new JMenuItem("Pencil");
        pencilItem.addActionListener(listener);
        ellipseItem = new JMenuItem("Ellipse");
        ellipseItem.addActionListener(listener);
        rectangleItem = new JMenuItem("Rectangle");
        rectangleItem.addActionListener(listener);
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

    class PressListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == aboutPaintItem) clickedAboutPaintItem();
            if (e.getSource() == quitItem)  clickedQuitItem();
            if (e.getSource() == newItem) clickedNewItem();
            if (e.getSource() == openItem) clickedOpenItem();
            if (e.getSource() == saveItem) clickedSaveItem();
            if (e.getSource() == saveAsItem) clickedSaveAsItem();
            if (e.getSource() == pencilItem) clickedPencilItem();
            if (e.getSource() == ellipseItem) clickedEllipseItem();
            if (e.getSource() == rectangleItem) clickedRectangleItem();
        }

        public void clickedAboutPaintItem() {

           JOptionPane.showMessageDialog(frame, "<html>Paint provides you with a set of tools " +
                   "<br> with which you can draw any shape.");
        }

        public void clickedQuitItem() {

            int choice = JOptionPane.showConfirmDialog(frame, "You want to exit?");

            if (choice == JOptionPane.YES_OPTION) System.exit(0);
        }

        public void clickedNewItem() {

            int choice = JOptionPane.showConfirmDialog(frame, "Are you sure to want to delete current changes?");

            if (choice == JOptionPane.YES_OPTION){

                frame.setVisible(false);
                new PaintMenu();
            }
        }

        public void clickedOpenItem() {

            System.out.println("New document was opened");
        }

        public void clickedSaveItem() {

            System.out.println("New document was saved");
        }

        public void clickedSaveAsItem() {

            System.out.println("New document was saved as 'Name'");
        }

        public void clickedPencilItem() {

            System.out.println("You choice pencil");
        }

        public void clickedEllipseItem() {

            System.out.println("You choice ellipse");
        }

        public void clickedRectangleItem() {

            System.out.println("You choice rectangle");
        }
    }
}
