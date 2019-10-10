package Task_03.Commands.returnIntCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnIntCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class IndexOf extends AbstractReturnIntCommand {

    public IndexOf(StringBuilder builder, String inputStr) {
        super(builder);
        this.inputStr   = inputStr;
    }

    @Override
    public int execute() {
        return builder.indexOf(inputStr);
    }
}