package Task_06.GUI;

import Task_06.TransactionHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by Aleksey Zaychenkov on 13.12.2019.
 */
public class RunPanel extends JPanel {

    public RunPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        final JLabel label = new JLabel("Current file: not chosen");






        JButton openButt = new JButton("Open file");

        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 20, 0, 20);



        openButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileopen = new JFileChooser("src/Task_06/resources/");
                int ret = fileopen.showDialog(null, "Handle file of transactions");

                if (JOptionPane.showConfirmDialog(null, "Open new file?", "Current  progress will be lost!",  JOptionPane.OK_CANCEL_OPTION) == 0) {
                    if (ret == JFileChooser.APPROVE_OPTION) {
                        File file = fileopen.getSelectedFile();
                        label.setText("Current file: " + file.getName());

                        try {
                            TransactionHandler.runHandling(file);
                        } catch (IllegalArgumentException iae){
                            System.out.println(iae);
                            JOptionPane.showMessageDialog(new JFrame(), "Unknown file format!", "Warning",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    //System.out.println("textField: " + GUI_Task_04.myStringBuilder.toString());
                    GUI_Task_06.textField.setText(GUI_Task_06.myStringBuffer.toString());
                }
            }
        });



        add(label, gbc);
        add(openButt, gbc);
    }
}
