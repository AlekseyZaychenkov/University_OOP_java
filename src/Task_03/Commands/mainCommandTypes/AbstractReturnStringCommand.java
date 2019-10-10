package Task_03.Commands.mainCommandTypes;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public abstract class AbstractReturnStringCommand {
    public StringBuilder builder;
    private String backup;
    protected int input1;
    protected int input2;

    protected AbstractReturnStringCommand(StringBuilder builder) {
        this.builder = builder;
    }

    void backup() {
        backup = builder.toString();
    }

    public void undo() {
        builder = new StringBuilder(backup);
    }

    public abstract String execute();
}