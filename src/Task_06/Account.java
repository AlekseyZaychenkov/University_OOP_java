package Task_06;

/**
 * Created by Aleksey Zaychenkov on 13.12.2019.
 */

public class Account {

    private final int id;
    private int bill;


    public Account(int id, int bill) {
        this.id = id;
        this.bill = bill;
    }

    public synchronized int getBill() {
        return bill;
    }

    public synchronized void setBill(int bill) {
        this.bill = bill;
    }

    public String toString() {
        return "Account ID: " + this.id + " Bill: " + this.getBill();
    }
}
