package Task_03.Commands.mainCommandTypes;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public abstract class AbstractReturnVoidCommand {
    public StringBuilder builder;
    private String backup;
    protected int input1;
    protected int input2;
    protected int input3;
    protected int input4;
    protected char inputChar1;
    protected char[] input1ChArr;

    protected AbstractReturnVoidCommand(StringBuilder builder) {
        this.builder = builder;
    }

    void backup() {
        backup = builder.toString();
    }

    public void undo() {
        builder = new StringBuilder(backup);
    }

    public abstract void execute();
}
