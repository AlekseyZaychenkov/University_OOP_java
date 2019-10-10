package Task_03.Commands.returnIntCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnIntCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */

public class LastIndexOfString extends AbstractReturnIntCommand {

    public LastIndexOfString(StringBuilder builder, String inputStr) {
        super(builder);
        this.inputStr = inputStr;
        this.input    = input;
    }

    @Override
    public int execute() {
        return builder.indexOf(inputStr, input);
    }
}