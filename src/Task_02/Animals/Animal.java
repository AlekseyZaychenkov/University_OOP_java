package Task_02.Animals;
import java.io.Serializable;




public abstract class Animal implements Comparable<Animal>, Serializable {
    private String name;
    private int id;
    private int needFood;

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int compareTo(Animal a){
        if(this.needFood!=a.needFood)
            return this.needFood - a.needFood;
        return name.compareTo(a.name);
    }

    public int getNeedFood() {
        return needFood;
    }

    public void setNeedFood(int needFood) {
        this.needFood = needFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}