package Task_03.Commands.mainCommandTypes;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public abstract class AbstractReturnIntCommand {
    public StringBuilder builder;
    protected int input;
    protected int input1;
    protected int input2;
    protected String inputStr;

    protected AbstractReturnIntCommand(StringBuilder builder) {
        this.builder = builder;
    }

    public abstract int execute();
}
