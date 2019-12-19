package Task_02.GUI;

import javax.swing.*;

/**
 * Created by Aleksey Zaychenkov on 08.10.2019.
 */
public class GUI_Task_02 {
    private static JTextArea textField;
    private static StringBuilder myStringBuilder = new StringBuilder();
    private static TextFieldsPanel textFieldsPanel = new TextFieldsPanel();
    private static SafeOpenPanel safeOpenPanel = new SafeOpenPanel();

    public static JTextArea getTextField() {
        return textField;
    }

    public static void setTextField(JTextArea textField) {
        GUI_Task_02.textField = textField;
    }

    public static StringBuilder getMyStringBuilder() {
        return myStringBuilder;
    }

    public static void setMyStringBuilder(StringBuilder myStringBuilder) {
        GUI_Task_02.myStringBuilder = myStringBuilder;
    }

    public static TextFieldsPanel getTextFieldsPanel() {
        return textFieldsPanel;
    }

    public static void setTextFieldsPanel(TextFieldsPanel textFieldsPanel) {
        GUI_Task_02.textFieldsPanel = textFieldsPanel;
    }

    public static SafeOpenPanel getSafeOpenPanel() {
        return safeOpenPanel;
    }

    public static void setSafeOpenPanel(SafeOpenPanel safeOpenPanel) {
        GUI_Task_02.safeOpenPanel = safeOpenPanel;
    }



    public void init() {
        JFrame frame = new JFrame("Text editor");
        JPanel contentPanel = new JPanel();

        contentPanel.add(textFieldsPanel);
        contentPanel.add(safeOpenPanel);


        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        frame.setContentPane(contentPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000, 480);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}







