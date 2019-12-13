package Task_05.GUI;

import Task_05.PropertiesOpener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Properties;

/**
 * Created by Aleksey Zaychenkov on 13.12.2019.
 */
public class SafeOpenPanel extends JPanel {

    public SafeOpenPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        final JLabel label = new JLabel("Текущий файл: не задан");






        JButton openButt = new JButton("Open file");

        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 20, 0, 20);



        openButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileopen = new JFileChooser("src/Task_05/resources/about.properties");
                int ret = fileopen.showDialog(null, "Открыть файл");

                if (JOptionPane.showConfirmDialog(null, "Открыть новый файл?", "Текущий прогресс будет утерян!",  JOptionPane.OK_CANCEL_OPTION) == 0) {
                    if (ret == JFileChooser.APPROVE_OPTION) {
                        File file = fileopen.getSelectedFile();
                        label.setText("Текущий файл: " + file.getName());

                        try {
                            Properties propertiesMap = PropertiesOpener.openProperties(file.getPath());
                            //if (propertiesMap instanceof Map)
                            //    GUI_Task_05.myStringBuilder.append("Properties extends from Hashtable");

                            for (Object key : propertiesMap.keySet())
                                GUI_Task_05.myStringBuilder.append(key + " = " +  propertiesMap.get(key)+'\n');

                        } catch (IllegalArgumentException iae){
                            System.out.println(iae);
                            JOptionPane.showMessageDialog(new JFrame(), "Неизвестный формат файла!", "Warning",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    //System.out.println("textField: " + GUI_Task_04.myStringBuilder.toString());
                    GUI_Task_05.textField.setText(GUI_Task_05.myStringBuilder.toString());
                }
            }
        });



        add(label, gbc);
        add(openButt, gbc);
    }
}
