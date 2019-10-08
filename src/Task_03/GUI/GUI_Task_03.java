package Task_03.GUI;

import Task_03.MyStringBuilder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksey Zaychenkov on 08.10.2019.
 */
public class GUI_Task_03 {
    public JTextArea textField;
    public JTextArea textField2;
    public String clipboard;
    public MyStringBuilder myStringBuilder = new MyStringBuilder();

    public void init() {
        JFrame frame = new JFrame("Text editor");
        JPanel contentPanel = new JPanel();

        contentPanel.add(new GUI_Task_03.TestPane());

        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        frame.setContentPane(contentPanel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




        frame.setSize(480, 340);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public class TestPane extends JPanel {

        public TestPane() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            Border border = BorderFactory.createLineBorder(Color.GRAY);

            gbc.gridx = 0;
            gbc.gridy = 0;
            //gbc.insets = new Insets(2, 2, 2, 2);

            add(new JLabel("Now in StringBuilder:"), gbc);
            gbc.gridy++;
             gbc.fill = GridBagConstraints.HORIZONTAL;
            textField = new JTextArea("StringBuilder is still empty" ,5, 40);
            textField.setLineWrap(true);
            textField.setBorder(border);
            textField.setEditable(false);
            //textArea.setText();
            //ProtectedDocumentFilter.install(textField);
            add(textField, gbc);
            gbc.gridy = gbc.gridy+5;


            add(new JLabel("Users input:"), gbc);
            gbc.gridy++;
            textField2 = new JTextArea(1, 40);
            textField2.setLineWrap(true);
            textField2.setBorder(border);
            add(textField2, gbc);
            gbc.gridy++;
            // gbc.fill = GridBagConstraints.NONE;

            //gbc.gridwidth = 2;
            //add(new JButton("Click"), gbc);


            GridLayout gbl = new GridLayout(5,5);
            setLayout(gbl);


            JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel buttons2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

            JButton appStr = new JButton("Append");
            JButton appBool = new JButton("AppBool");
            JButton appChar = new JButton("AppChar");
            JButton undoButt = new JButton("Undo");
            JButton redoButt = new JButton("Redo");
            JButton appCharArray = new JButton("AppChArr");



            appStr.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    myStringBuilder.append(textField2.getText());
                    textField.setText(myStringBuilder.toString());
                    textField2.setText("");
                }
            });

            appBool.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(textField2.getText().equals("true")||textField2.getText().equals("false"))
                        myStringBuilder.append(Boolean.parseBoolean(textField2.getText()));
                    else
                        JOptionPane.showMessageDialog(new JFrame(),"Invalid input type. This is not boolean!", "Warning",
                                JOptionPane.WARNING_MESSAGE);

                    textField.setText(myStringBuilder.toString());
                    textField2.setText("");
                }
            });

            appChar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if((textField2.getText().toString().length() == 1)&&(Character.isLetter(textField2.getText().toString().charAt(0))))
                        myStringBuilder.append(textField2.getText().toString().charAt(0));
                    else
                        JOptionPane.showMessageDialog(new JFrame(),"Invalid input type. This is not char!", "Warning",
                                JOptionPane.WARNING_MESSAGE);


                    textField.setText(myStringBuilder.toString());
                    textField2.setText("");
                }
            });


            appCharArray.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    boolean isLetters = true;
                    for(char ch : textField2.getText().toString().toCharArray())
                        if(!Character.isLetter(ch))
                            isLetters = false;

                    if(isLetters)
                        myStringBuilder.append(textField2.getText().toString().toCharArray());
                    else
                        JOptionPane.showMessageDialog(new JFrame(),"Invalid input type. This is not char array!", "Warning",
                                JOptionPane.WARNING_MESSAGE);


                    textField.setText(myStringBuilder.toString());
                    textField2.setText("");
                }
            });



            undoButt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    myStringBuilder.undo();
                    textField.setText(myStringBuilder.toString());
                }
            });
            redoButt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    myStringBuilder.redo();
                    textField.setText(myStringBuilder.toString());
                }
            });




            buttons.add(appStr);
            buttons.add(appBool);
            buttons.add(appChar);
            buttons.add(appCharArray);

            buttons.add(undoButt, gbl);
            buttons.add(redoButt, gbl);

            add(buttons, gbl);
            //add(buttons2, gbl);










        }

    }



}
