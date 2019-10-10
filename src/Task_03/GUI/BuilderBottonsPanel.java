package Task_03.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class BuilderBottonsPanel extends JPanel {
    public BuilderBottonsPanel() {


        JButton appBool = new JButton("AppBool");
        JButton appChar = new JButton("AppChar");
        JButton appCharArray = new JButton("AppChArr");
        JButton appChSeq = new JButton("AppChSeq");
        JButton appChArrWithOff = new JButton("appChAWOff");
        JButton appChSeqWithOff = new JButton("AppChSWOff");
        JButton appDouble = new JButton("AppDouble");
        JButton appFloat = new JButton("AppFloat");
        JButton appInt = new JButton("AppInt");
        JButton appLong = new JButton("AppLong");
        JButton appObj = new JButton("AppObj");
        JButton appStr = new JButton("AppStr");
        JButton appBuff = new JButton("AppBuff");
        JButton appCodeP = new JButton("AppCP");


        appBool.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (GUI_Task_03.textField2.getText().equals("true") || GUI_Task_03.textField2.getText().equals("false"))
                    GUI_Task_03.myStringBuilder.append(Boolean.parseBoolean(GUI_Task_03.textField2.getText()));
                else
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input type. This is not boolean!", "Warning",
                            JOptionPane.WARNING_MESSAGE);

                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appChar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((GUI_Task_03.textField2.getText().toString().length() == 1))
                    GUI_Task_03.myStringBuilder.append(GUI_Task_03.textField2.getText().toString().charAt(0));
                else
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input type. This is not char!", "Warning",
                            JOptionPane.WARNING_MESSAGE);

                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appCharArray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI_Task_03.myStringBuilder.append(GUI_Task_03.textField2.getText().toString().toCharArray());
                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appChSeq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI_Task_03.myStringBuilder.append(GUI_Task_03.textField2.getText().subSequence(0, GUI_Task_03.textField2.getText().toString().length()));
                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appChSeqWithOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = GUI_Task_03.textField2.getText().toString();
                String inputArg[] = input.split(" ");

                try {
                    int arg1 = Integer.valueOf(inputArg[1]);
                    int arg2 = Integer.valueOf(inputArg[2]);
                    GUI_Task_03.myStringBuilder.append(GUI_Task_03.textField2.getText().subSequence(0, GUI_Task_03.textField2.getText().toString().length()));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input parameters. Please use pattern: \"char[]  offset  length\"", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } catch (ArrayIndexOutOfBoundsException aioobe) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input parameters. Wrong value of arguments offset or length!", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }

                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appChArrWithOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = GUI_Task_03.textField2.getText().toString();
                String inputArg[] = input.split(" ");

                try {
                    int arg1 = Integer.valueOf(inputArg[1]);
                    int arg2 = Integer.valueOf(inputArg[2]);
                    GUI_Task_03.myStringBuilder.append(GUI_Task_03.textField2.getText().toString().toCharArray(), arg1, arg2);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input parameters. Please use pattern: \"char[]  offset  length\"", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } catch (ArrayIndexOutOfBoundsException aioobe) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input parameters. Wrong value of arguments offset or length!", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }

                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });
        appChArrWithOff.setToolTipText("Pattern: \"char[] offset len\"");

        appDouble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double input = Double.valueOf(GUI_Task_03.textField2.getText());
                    GUI_Task_03.myStringBuilder.append(input);
                } catch (ClassCastException | NumberFormatException cce) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input type!", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appFloat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float input = Float.valueOf(GUI_Task_03.textField2.getText());
                    GUI_Task_03.myStringBuilder.append(input);
                } catch (ClassCastException | NumberFormatException cce) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input type!", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appInt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int input = Integer.valueOf(GUI_Task_03.textField2.getText());
                    GUI_Task_03.myStringBuilder.append(input);
                } catch (ClassCastException | NumberFormatException cce) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input type!", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appLong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    long input = Long.valueOf(GUI_Task_03.textField2.getText());
                    GUI_Task_03.myStringBuilder.append(input);
                } catch (ClassCastException | NumberFormatException cce) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input type!", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appObj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object input = new String(GUI_Task_03.textField2.getText());
                GUI_Task_03.myStringBuilder.append(input);

                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appStr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI_Task_03.myStringBuilder.append(GUI_Task_03.textField2.getText());
                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appBuff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI_Task_03.myStringBuilder.append(new StringBuffer(GUI_Task_03.textField2.getText()));

                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });

        appCodeP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((GUI_Task_03.textField2.getText().toString().length() == 1)) {
                    char input = GUI_Task_03.textField2.getText().toString().charAt(0);
                    GUI_Task_03.myStringBuilder.appendCodePoint((int) input);
                } else
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid input type. This is not character of Unicode!", "Warning",
                            JOptionPane.WARNING_MESSAGE);

                GUI_Task_03.textField.setText(GUI_Task_03.myStringBuilder.toString());
                GUI_Task_03.textField2.setText("");
            }
        });




















        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 3, 5, 3);

        gbc.gridy = 0;
        add(appBool, gbc);
        gbc.gridx++;
        gbc.gridy = 0;
        add(appChar, gbc);
        gbc.gridx++;
        gbc.gridy = 0;
        add(appCharArray, gbc);
        gbc.gridx++;
        gbc.gridy = 0;
        add(appChSeq, gbc);
        gbc.gridx++;
        gbc.gridy = 0;
        add(appChArrWithOff, gbc);


        gbc.gridx = 0;
        gbc.gridy = 2;
        add(appChSeqWithOff, gbc);
        gbc.gridx++;
        add(appDouble, gbc);
        gbc.gridx++;
        add(appFloat, gbc);
        gbc.gridx++;
        add(appInt, gbc);
        gbc.gridx++;
        add(appLong, gbc);


        gbc.gridx = 0;
        gbc.gridy = 3;
        add(appObj, gbc);
        gbc.gridx++;
        add(appStr, gbc);
        gbc.gridx++;
        add(appBuff, gbc);
        gbc.gridx++;
        add(appCodeP, gbc);
        gbc.gridx++;
    }
}