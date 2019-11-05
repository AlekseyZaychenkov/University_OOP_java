package Task_02.Animals;

/**
 * Created by Aleksey Zaychenkov on 06.11.2019.
 */
public class Herbivorous extends Animal{
    public Herbivorous(String name, int id) {
        super(name, id);
        super.setNeedFood(10);
    }

}