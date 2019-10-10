package Task_03.Commands.mainCommandTypes;

/**
 * Created by Aleksey Zaychenkov on 04.10.2019.
 */
public abstract class Command {
    public StringBuilder builder;
    private String backup;
    protected int input;
    protected int input1;
    protected int input2;
    protected int input3;
    protected int input4;
    protected double inputDouble1;
    protected float inputFloat1;
    protected long inputLong1;
    protected char inputChar1;
    protected char[] inputCharArray1;
    protected boolean inputBoolean1;
    protected String inputString1;
    protected CharSequence charSequence1;
    protected Object inputObject1;


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