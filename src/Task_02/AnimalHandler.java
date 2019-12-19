package Task_02;

import Task_02.Animals.Animal;
import Task_02.Animals.Carnivore;
import Task_02.Animals.Herbivorous;
import Task_02.Animals.Omnivores;
import Task_02.GUI.GUI_Task_02;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Aleksey Zaychenkov on 20.12.2019.
 */
public class AnimalHandler {
    static ArrayList<Animal> animals = new ArrayList<Animal>();


    public static void createList() {
        animals.add(new Omnivores("Bear", 3));
        animals.add(new Carnivore("Lion", 1));
        animals.add(new Herbivorous("Deer", 4));
        animals.add(new Carnivore("Tiger", 2));
        animals.add(new Herbivorous("Bull", 5));
        animals.add(new Herbivorous("Bull", 6));
        animals.add(new Herbivorous("Bull", 7));
        animals.add(new Herbivorous("Bull", 8));

        Collections.sort(animals);
        for (int i = 0; i < 5; i++)
            if (i <= animals.size()) {
                Animal a = animals.get(i);
                GUI_Task_02.getMyStringBuilder().append("name= " + a.getName() + " id=" + a.getId() + " needFood=" + a.getNeedFood()+"\n");
            }
    }


    public static void writeToFile(File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Animal a : animals)
                oos.writeObject(a);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        animals.clear();

        GUI_Task_02.getMyStringBuilder().append("\n");
        GUI_Task_02.getMyStringBuilder().append("List was cleared:"+"\n");
        for (Animal a : animals)
            GUI_Task_02.getMyStringBuilder().append("name= " + a.getName() + " id=" + a.getId() + " needFood=" + a.getNeedFood()+"\n");

        GUI_Task_02.getMyStringBuilder().append("\n");
    }


    public static void readFromFile(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Animal a;

            while (true) {
                //while ((a = (Animal)ois.readObject()) != null){
                a = (Animal) ois.readObject();
                GUI_Task_02.getMyStringBuilder().append("Read name= " + a.getName() + " id=" + a.getId() + " needFood=" + a.getNeedFood()+"\n");
                animals.add(a);
            }

        } catch (EOFException EOFEex) {
            GUI_Task_02.getMyStringBuilder().append("File was read successfully: " + EOFEex+"\n");
        } catch (Exception ex) {
            GUI_Task_02.getMyStringBuilder().append("Unknown exception was happened: " + ex+"\n");
        }

        GUI_Task_02.getMyStringBuilder().append("\n");
        GUI_Task_02.getMyStringBuilder().append("Bottom line:"+"\n");
        for (int i = 0; i < 5; i++)
            if (i <= animals.size()) {
                Animal a = animals.get(i);
                GUI_Task_02.getMyStringBuilder().append("name= " + a.getName() + " id=" + a.getId() + " needFood=" + a.getNeedFood()+"\n");
            }
    }
}
