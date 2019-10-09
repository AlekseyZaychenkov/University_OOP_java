package Task_03.GUI;

import Task_03.MyStringBuilder;

import javax.swing.*;

/**
 * Created by Aleksey Zaychenkov on 08.10.2019.
 */
public class GUI_Task_03 {
    public static JTextArea textField;
    public static JTextArea textField2;
    public static MyStringBuilder myStringBuilder = new MyStringBuilder();

    public void init() {
        JFrame frame = new JFrame("Text editor");
        JPanel contentPanel = new JPanel();
        contentPanel.add(new TextFieldsPane());
        contentPanel.add(new BuilderBottonsPanel());
        contentPanel.add(new RedoUndoPanel());

        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        frame.setContentPane(contentPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}







