package Task_01;

import Task_01.GUI.GUI_Task_01;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */

// Дана строка. Разделить строку на фрагменты по три подряд идущих символа.
// В каждом фрагменте средний символ заменить на случайный символ, не совпадающий ни с одним из символов этого фрагмента.
// Показать фрагменты, упорядоченные по алфавиту.


public class Main {
    public static void main(String[] args) {
        GUI_Task_01 gui_Task_01 = new GUI_Task_01();
        gui_Task_01.init();
    }

}