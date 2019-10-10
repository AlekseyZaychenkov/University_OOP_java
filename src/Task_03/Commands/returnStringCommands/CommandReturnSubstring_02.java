package Task_03.Commands.returnStringCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnStringCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class CommandReturnSubstring_02 extends AbstractReturnStringCommand {

    protected CommandReturnSubstring_02(StringBuilder builder, int input1, int input2) {
        super(builder);
        this.input1 = input1;
        this.input2 = input2;
    }

    public String execute(){
        return builder.substring(input1, input2);
    }
}