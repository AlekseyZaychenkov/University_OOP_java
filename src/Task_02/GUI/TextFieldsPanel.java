package Task_02.GUI;

import Task_01.GUI.GUI_Task_01;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class TextFieldsPanel extends JPanel {
    public TextFieldsPanel() {
        setAlignmentY(CENTER_ALIGNMENT);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        Border border = BorderFactory.createLineBorder(Color.GRAY);
        gbc.fill = GridBagConstraints.BOTH;

        gbc.insets = new Insets(2, 20, 2, 20);

        gbc.weightx = 0.2;
        add(new JLabel("Handlers window:"), gbc);

        gbc.gridy = 4;
        GUI_Task_01.setTextField(new JTextArea( 20, 40));
        GUI_Task_01.getTextField().setLineWrap(true);
        GUI_Task_01.getTextField().setBorder(border);

        JScrollPane scrollPane = new JScrollPane(GUI_Task_01.getTextField());

        add(scrollPane, gbc);
    }
}