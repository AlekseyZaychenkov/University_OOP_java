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
        frame.setSize(640, 640);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public class TestPane extends JPanel {

        public TestPane() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            Border border = BorderFactory.createLineBorder(Color.GRAY);



            add(new JLabel("Now in StringBuilder:"), gbc);
            textField = new JTextArea("StringBuilder is still empty" ,5, 40);
            textField.setLineWrap(true);
            textField.setBorder(border);
            textField.setEditable(false);
            add(textField, gbc);


            add(new JLabel("Users input:"), gbc);
            textField2 = new JTextArea(1, 40);
            textField2.setLineWrap(true);
            textField2.setBorder(border);
            add(textField2, gbc);



            GridLayout gbl = new GridLayout(5,5, 15 , 5);
            setLayout(gbl);

            JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
            //JPanel buttons2 = new JPanel(new FlowLayout(FlowLayout.CENTER));


            JButton appBool   = new JButton("AppBool");
            JButton appChar   = new JButton("AppChar");
            JButton appCharArray = new JButton("AppChArr");
            JButton appChSeq  = new JButton("AppChSeq");
            JButton appChArrWithOff = new JButton("appChAWOff");
            JButton appChSeqWithOff = new JButton("AppChSWOff");
            JButton appDouble = new JButton("AppDouble");
            JButton appFloat  = new JButton("AppFloat");
            JButton appInt    = new JButton("AppInt");
            JButton appLong   = new JButton("AppLong");
            JButton appObj    = new JButton("AppObj");
            JButton appStr    = new JButton("AppStr");
            JButton appBuff   = new JButton("AppBuff");
            JButton appCodeP  = new JButton("AppCP");



            JButton undoButt = new JButton("Undo");
            JButton redoButt = new JButton("Redo");



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
                    if((textField2.getText().toString().length() == 1))
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
                    myStringBuilder.append(textField2.getText().toString().toCharArray());
                    textField.setText(myStringBuilder.toString());
                    textField2.setText("");
                }
            });


            appChArrWithOff.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String input = textField2.getText().toString();
                    String inputArg[] = input.split(" ");

                    try {
                        int arg1 = Integer.valueOf(inputArg[1]);
                        int arg2 = Integer.valueOf(inputArg[2]);
                        myStringBuilder.append(textField2.getText().toString().toCharArray(), arg1, arg2);
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(new JFrame(),"Invalid input parameters. Please use pattern: \"char[]  offset  length\"", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }  catch (ArrayIndexOutOfBoundsException aioobe) {
                        JOptionPane.showMessageDialog(new JFrame(),"Invalid input parameters. Wrong value of arguments offset or length!", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }

                    textField.setText(myStringBuilder.toString());
                    textField2.setText("");
                }
            });
            appChArrWithOff.setToolTipText("Pattern: \"char[] offset len\"");




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



            buttons.add(appBool);
            buttons.add(appChar);
            buttons.add(appCharArray);
            buttons.add(appChSeq);
            buttons.add(appChArrWithOff);
            buttons.add(appChSeqWithOff);
            buttons.add(appDouble);
            buttons.add(appFloat);
            buttons.add(appInt);
            buttons.add(appLong);
            buttons.add(appObj);
            buttons.add(appStr);
            buttons.add(appBuff);
            buttons.add(appCodeP);


            buttons.add(undoButt, gbl);
            buttons.add(redoButt, gbl);


            //add(buttons, gbc);

            add(buttons, gbl);
            //add(buttons2, gbl);










        }

    }



}
