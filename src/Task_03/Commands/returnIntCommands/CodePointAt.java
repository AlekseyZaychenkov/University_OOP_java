package Task_03.Commands.returnIntCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnIntCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class CodePointAt extends AbstractReturnIntCommand {

    public CodePointAt(StringBuilder builder, int input) {
        super(builder);
        this.input   = input;
    }

    @Override
    public int execute() {
        return builder.codePointAt(input);
    }
}