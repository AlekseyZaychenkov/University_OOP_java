package Task_01.GUI;

import Task_01.StringHandler;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksey Zaychenkov on 13.12.2019.
 */
public class ControlPanel extends JPanel {

    private int lettersInString = 75;
    private int stepSize = 5;

    public ControlPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();



        JButton runButt = new JButton("Run handler");

        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 20, 0, 20);

        runButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI_Task_01.getMyStringBuilder().append("Letters in string: " + lettersInString + "\n");
                GUI_Task_01.getMyStringBuilder().append("Step size: " + stepSize+ "\n"+ "\n");


                StringHandler.run(lettersInString, stepSize);
                GUI_Task_01.getTextField().setText(GUI_Task_01.getMyStringBuilder().toString());
            }
        });


        // create a slider
        JSlider stringSlider = new JSlider(0, 150, lettersInString);
        stringSlider.setBorder(BorderFactory.createTitledBorder("Letters in string (5 is minimum): "));

        // paint the ticks and tarcks
        stringSlider.setPaintTrack(true);
        stringSlider.setPaintTicks(true);
        stringSlider.setPaintLabels(true);


        // set spacing
        stringSlider.setMajorTickSpacing(50);
        stringSlider.setMinorTickSpacing(10);

        stringSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            if(((JSlider)e.getSource()).getValue()<5)
                lettersInString = 5;
            else
                lettersInString = ((JSlider)e.getSource()).getValue();
            }
        });


        // create a slider
        JSlider stepSlider = new JSlider(0, 10, stepSize);
        stepSlider.setBorder(BorderFactory.createTitledBorder("Step size (2 is minimum): "));

        // paint the ticks and tarcks
        stepSlider.setPaintTrack(true);
        stepSlider.setPaintTicks(true);
        stepSlider.setPaintLabels(true);


        // set spacing
        stepSlider.setMajorTickSpacing(5);
        stepSlider.setMinorTickSpacing(2);

        stepSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                if(((JSlider)e.getSource()).getValue()<2)
                    stepSize = 2;
                else
                    stepSize = ((JSlider)e.getSource()).getValue();
            }
        });

        // add sliders and button to panel
        add(stringSlider, gbc);
        add(stepSlider, gbc);
        add(runButt, gbc);
    }
}
