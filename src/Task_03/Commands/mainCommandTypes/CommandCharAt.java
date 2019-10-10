package Task_03.Commands.mainCommandTypes;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class CommandCharAt {
    public StringBuilder builder;
    int input;

    public CommandCharAt(StringBuilder builder, int input){
        this.builder = builder;
        this.input   = input;
    }

    public char execute() {
        return builder.charAt(input);
    }
}
