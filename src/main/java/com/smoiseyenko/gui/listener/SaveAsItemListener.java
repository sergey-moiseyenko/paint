package com.smoiseyenko.gui.listener;

        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/24/16.
 */
public class SaveAsItemListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        System.out.println("New document was saved as 'Name'");
    }
}
