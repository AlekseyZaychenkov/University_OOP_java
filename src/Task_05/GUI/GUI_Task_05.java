package Task_05.GUI;

import javax.swing.*;

/**
 * Created by Aleksey Zaychenkov on 08.10.2019.
 */
public class GUI_Task_05 {
    public static JTextArea textField;
    public static StringBuilder myStringBuilder = new StringBuilder();
    public static TextFieldsPanel textFieldsPanel = new TextFieldsPanel();
    public static SafeOpenPanel safeOpenPanel = new SafeOpenPanel();


    public void init() {
        JFrame frame = new JFrame("Text editor");
        JPanel contentPanel = new JPanel();

        contentPanel.add(textFieldsPanel);
        contentPanel.add(safeOpenPanel);


        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        frame.setContentPane(contentPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(640, 320);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}







