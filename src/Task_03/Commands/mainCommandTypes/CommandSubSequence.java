package Task_03.Commands.mainCommandTypes;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class CommandSubSequence {
    public StringBuilder builder;
    private String backup;
    protected int input1;
    protected int input2;

    protected CommandSubSequence(StringBuilder builder, int input1,int input2) {
        this.builder = builder;
        this.input1 = input1;
        this.input2 = input2;
    }

    void backup() {
        backup = builder.toString();
    }

    public void undo() {
        builder = new StringBuilder(backup);
    }

    public CharSequence execute(){
            return builder.subSequence(input1, input2);
    }
}
