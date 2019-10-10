package Task_03.Commands.othersReturnStringBuilderCommands;

import Task_03.Commands.mainCommandTypes.Command;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class Reverse extends Command {
    int input1;

    public Reverse(StringBuilder builder) {
        super(builder);
    }

    @Override
    public StringBuilder execute() {
        return builder.reverse();
    }
}

