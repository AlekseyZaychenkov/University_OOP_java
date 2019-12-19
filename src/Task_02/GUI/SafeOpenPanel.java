package Task_02.GUI;

import Task_02.AnimalHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by Aleksey Zaychenkov on 13.12.2019.
 */
public class SafeOpenPanel extends JPanel {

    public SafeOpenPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        final JLabel label = new JLabel("Current file: not chosen");

        JButton createButt = new JButton("Create list");
        JButton safeButt = new JButton("Safe file");
        JButton openButt = new JButton("Open file");
        JButton dellButt = new JButton("Delete file");
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 20, 0, 20);

        createButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AnimalHandler.createList();
                GUI_Task_02.getTextField().setText(GUI_Task_02.getMyStringBuilder().toString());
            }
        });

        safeButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser("src/Task_02/resources/");
                if ( fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION )
                    AnimalHandler.writeToFile(fc.getSelectedFile());

                GUI_Task_02.getTextField().setText(GUI_Task_02.getMyStringBuilder().toString());
            }
        });

        openButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileopen = new JFileChooser("src/Task_02/resources/");
                int ret = fileopen.showDialog(null, "Open file");

                if (JOptionPane.showConfirmDialog(null, "Open new file?", "Current progress will be lost!",  JOptionPane.OK_CANCEL_OPTION) == 0) {
                    if (ret == JFileChooser.APPROVE_OPTION)
                        AnimalHandler.readFromFile(fileopen.getSelectedFile());

                    GUI_Task_02.getTextField().setText(GUI_Task_02.getMyStringBuilder().toString());
                }
            }
        });



        dellButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileopen = new JFileChooser("src/Task_02/resources/");
                int ret = fileopen.showDialog(null, "Delete file?");
                if (ret == JFileChooser.APPROVE_OPTION) {
                    File file = fileopen.getSelectedFile();
                    try {
                        if (JOptionPane.showConfirmDialog(null, "Delete file?", "Deletion confirmation",  JOptionPane.OK_CANCEL_OPTION) == 0)
                            file.delete();

                    }catch (SecurityException  ex2 ) {
                        System.out.println("Insufficient permissions to delete file!");
                    }
                }

                GUI_Task_02.setMyStringBuilder(new StringBuilder());
            }
        });


        add(label, gbc);
        add(createButt, gbc);
        add(safeButt, gbc);
        add(openButt, gbc);
        add(dellButt, gbc);
    }
}
