package Task_03.Commands.returnIntCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnIntCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */

public class LastIndexOf extends AbstractReturnIntCommand {

    public LastIndexOf(StringBuilder builder, String inputStr, int input) {
        super(builder);
        this.inputStr = inputStr;
        this.input    = input;
    }

    @Override
    public int execute() {
        return builder.indexOf(inputStr, input);
    }
}