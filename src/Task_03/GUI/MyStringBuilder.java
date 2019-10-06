package Task_03.GUI;


import Task_03.Commands.AppendCommand;
import Task_03.Commands.Command;
import Task_03.Commands.CommandHistory;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksey Zaychenkov on 04.10.2019.
 */
public class MyStringBuilder {
        public JTextArea textField;
        public JTextArea textField2;
        public String clipboard;
        private CommandHistory history = new CommandHistory();

        public void init() {
            JFrame frame = new JFrame("Text editor");
            JPanel contentPanel = new JPanel();

            contentPanel.add(new TestPane());

            contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
            frame.setContentPane(contentPanel);

            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




            frame.setSize(480, 240);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

        private void executeCommand(Command command) {
            if (command.execute()) {
                history.push(command);
            }
        }

        private void undo() {
            if (history.isEmpty()) return;

            Command command = history.pop();
            if (command != null) {
                command.undo();
            }
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
           // gbc.fill = GridBagConstraints.HORIZONTAL;
            textField = new JTextArea("Now in StringBuilder:" ,5, 40);
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











            JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));

            JButton ctrlC = new JButton("Copy");
            /*JButton ctrlX = new JButton("Cut");
            JButton ctrlV = new JButton("Paste");
            JButton ctrlZ = new JButton("Undo");*/

            // Creation of StringBuilder-target
            StringBuilder builder = new StringBuilder();

            ctrlC.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    executeCommand(new AppendCommand(builder, textField2.getText()));
                    textField.setText(builder.toString());
                    textField2.setText("");
                }
            });
            /*
            ctrlX.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    executeCommand(new CutCommand(builder));
                }
            });
            ctrlV.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    executeCommand(new PasteCommand(builder));
                }
            });
            ctrlZ.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    undo();
                }
            });*/



            buttons.add(ctrlC);
            /*buttons.add(ctrlX, gbc);
            buttons.add(ctrlV, gbc);
            buttons.add(ctrlZ, gbc);*/


            add(buttons, gbc);


        }

    }




    }

