package Task_03.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class RedoUndoPanel extends JPanel {
    public RedoUndoPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JButton undoButt = new JButton("Undo");
        JButton redoButt = new JButton("Redo");
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 20, 0, 20);

        undoButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI_Task_03.myStringBuilder.undo();
                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
            }
        });
        redoButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI_Task_03.myStringBuilder.redo();
                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
            }
        });

        add(undoButt, gbc);
        add(redoButt, gbc);
    }
}
