package Task_03.Commands.returnIntCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnIntCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class OffsetByCodePoints extends AbstractReturnIntCommand {

    public OffsetByCodePoints(StringBuilder builder, int input1, int input2) {
        super(builder);
        this.input1 = input1;
        this.input2 = input2;
    }

    @Override
    public int execute() {
        return builder.offsetByCodePoints(input1, input2);
    }
}

