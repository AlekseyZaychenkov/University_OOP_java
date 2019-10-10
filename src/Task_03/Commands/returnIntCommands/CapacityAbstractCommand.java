package Task_03.Commands.returnIntCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnIntCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class CapacityAbstractCommand extends AbstractReturnIntCommand {

    public CapacityAbstractCommand(StringBuilder builder) {
        super(builder);
    }

    @Override
    public int execute() {
        return builder.capacity();
    }
}