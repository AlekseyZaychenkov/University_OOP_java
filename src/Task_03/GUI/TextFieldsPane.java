package Task_03.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class TextFieldsPane extends JPanel {
    public TextFieldsPane() {
        setAlignmentY(CENTER_ALIGNMENT);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        Border border = BorderFactory.createLineBorder(Color.GRAY);
        gbc.fill = GridBagConstraints.BOTH;

        gbc.insets = new Insets(2, 20, 2, 20);

        gbc.weightx = 0.2;
        add(new JLabel("Now in StringBuilder:"), gbc);

        gbc.gridy = 4;
        GUI_Task_03.textField = new JTextArea("StringBuilder is still empty", 5, 40);
        GUI_Task_03.textField.setLineWrap(true);
        GUI_Task_03.textField.setBorder(border);
        GUI_Task_03.textField.setEditable(false);
        add(GUI_Task_03.textField, gbc);

        gbc.gridy++;
        add(new JLabel("Users input:"), gbc);
        gbc.gridy++;
        GUI_Task_03.textField2 = new JTextArea(1, 40);
        GUI_Task_03.textField2.setLineWrap(true);
        GUI_Task_03.textField2.setBorder(border);
        add(GUI_Task_03.textField2, gbc);

    }
}