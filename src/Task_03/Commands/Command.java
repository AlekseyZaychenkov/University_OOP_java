package Task_03.Commands;

/**
 * Created by Aleksey Zaychenkov on 04.10.2019.
 */
public abstract class Command {
    public StringBuilder builder;
    private String backup;

    protected Command(StringBuilder builder) {
        this.builder = builder;
    }

    void backup() {
        backup = builder.toString();
    }

    public void undo() {
        builder = new StringBuilder(backup);
    }

    public abstract StringBuilder execute();
}