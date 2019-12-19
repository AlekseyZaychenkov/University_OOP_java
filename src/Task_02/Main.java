package Task_02;

import Task_02.Animals.Animal;
import Task_02.Animals.Carnivore;
import Task_02.Animals.Herbivorous;
import Task_02.Animals.Omnivores;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals =  new ArrayList<Animal>();
        animals.add(new Omnivores("Bear", 3));
        animals.add(new Carnivore("Lion", 1));
        animals.add(new Herbivorous("Deer", 4));
        animals.add(new Carnivore("Tiger", 2));
        animals.add(new Herbivorous("Bull", 5));
        animals.add(new Herbivorous("Bull", 6));
        animals.add(new Herbivorous("Bull", 7));
        animals.add(new Herbivorous("Bull", 8));

        Collections.sort(animals);
        for(int i=0; i<5; i++)
            if(i<=animals.size()) {
                Animal a = animals.get(i);
                System.out.println("name= " + a.getName() + " id=" + a.getId() + " needFood=" + a.getNeedFood());
            }


        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animals.dat")))
        {
            for(Animal a: animals)
                oos.writeObject(a);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }


        animals.clear();


        System.out.println(" ");
        System.out.println("removed:");
        for(Animal a: animals)
            System.out.println("name= "+a.getName()+" id="+a.getId()+" needFood="+a.getNeedFood());

        System.out.println("");

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("animals.dat"))) {
            Animal a;

            while (true){
                //while ((a = (Animal)ois.readObject()) != null){
                a = (Animal)ois.readObject();
                System.out.println("Read name= " + a.getName() + " id=" + a.getId() + " needFood=" + a.getNeedFood());
                animals.add(a);
            }

        } catch(EOFException EOFEex){
            System.out.println("File was read successfully: "+EOFEex);
        } catch(Exception ex){
            System.out.println("Unknown exception was happened: "+ex);
        }


        System.out.println("Bottom line:");
        for(int i=0; i<5; i++)
            if(i<=animals.size()) {
                Animal a = animals.get(i);
                System.out.println("name= " + a.getName() + " id=" + a.getId() + " needFood=" + a.getNeedFood());
            }
        //System.out.println("Hello World!");
    }
}