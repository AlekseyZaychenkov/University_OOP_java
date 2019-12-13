package Task_04.GUI;

import javax.activation.UnsupportedDataTypeException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.channels.InterruptedByTimeoutException;
import java.util.Scanner;

/**
 * Created by Aleksey Zaychenkov on 13.12.2019.
 */
public class SafeOpenPanel extends JPanel {

    public SafeOpenPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        final JLabel label = new JLabel("Текущий файл: не задан");





        JButton safeButt = new JButton("Safe file");
        JButton openButt = new JButton("Open file");
        JButton dellButt = new JButton("Delete file");
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 20, 0, 20);

        safeButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //FileNameExtensionFilter filter = new FileNameExtensionFilter("*.txt");
                JFileChooser fc = new JFileChooser();
                //fc.setFileFilter(filter);

                if ( fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION ) {
                    try ( FileWriter fw = new FileWriter(fc.getSelectedFile()) ) {
                        System.out.println("try: "+GUI_Task_04.textField.getText().toString());
                        fw.write(GUI_Task_04.textField.getText().toString());
                    } catch (FileNotFoundException fnf){
                        System.out.println(fnf);
                        JOptionPane.showMessageDialog(new JFrame(), "Отказанно в доступе!", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    } catch (InterruptedByTimeoutException ibt){
                        System.out.println(ibt);
                        JOptionPane.showMessageDialog(new JFrame(), "Ошибка записи! Превышено время ожидания!", "Warning",
                                JOptionPane.WARNING_MESSAGE);

                    } catch (UnsupportedDataTypeException | UnsupportedEncodingException udt){
                        System.out.println(udt);
                        JOptionPane.showMessageDialog(new JFrame(), "Неразрешенный символ для записи!", "Warning",
                                JOptionPane.WARNING_MESSAGE);


                    } catch (IOException ex2) {
                        System.out.println(ex2);
                        JOptionPane.showMessageDialog(new JFrame(), "Неизвестная ошибка при открытии файла!", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }


                GUI_Task_04.textField.setText(GUI_Task_04.myStringBuilder.toString());
            }
        });

        openButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileopen = new JFileChooser();
                int ret = fileopen.showDialog(null, "Открыть файл");

                if (JOptionPane.showConfirmDialog(null, "Открыть новый файл?", "Текущий прогресс будет утерян!",  JOptionPane.OK_CANCEL_OPTION) == 0) {
                    if (ret == JFileChooser.APPROVE_OPTION) {
                        File file = fileopen.getSelectedFile();
                        label.setText("Текущий файл: " + file.getName());

                        try (Scanner sc = new Scanner(file)) {
                            while (sc.hasNextLine()) {
                                //System.out.println("while"+sc.nextLine());
                                GUI_Task_04.myStringBuilder.append(sc.nextLine() + '\n');
                            }
                        } catch (FileNotFoundException fnf){
                            System.out.println(fnf);
                            JOptionPane.showMessageDialog(new JFrame(), "Отказанно в доступе!", "Warning",
                                    JOptionPane.WARNING_MESSAGE);
                        } catch (IllegalArgumentException iae){
                            System.out.println(iae);
                            JOptionPane.showMessageDialog(new JFrame(), "Неизвестный формат файла!", "Warning",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    //System.out.println("textField: " + GUI_Task_04.myStringBuilder.toString());
                    GUI_Task_04.textField.setText(GUI_Task_04.myStringBuilder.toString());
                }
            }
        });



        dellButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileopen = new JFileChooser();
                int ret = fileopen.showDialog(null, "Удалить файл");
                if (ret == JFileChooser.APPROVE_OPTION) {
                    File file = fileopen.getSelectedFile();
                    try {
                        if (JOptionPane.showConfirmDialog(null, "Удалить файл?", "Подтверждение удаления",  JOptionPane.OK_CANCEL_OPTION) == 0)
                            file.delete();

                    }catch (SecurityException  ex2 ) {
                        System.out.println("Недостаточно прав для удаления файла!");
                    }
                }

                GUI_Task_04.myStringBuilder = new StringBuilder();
            }
        });


        add(label, gbc);
        add(safeButt, gbc);
        add(openButt, gbc);
        add(dellButt, gbc);
    }
}
