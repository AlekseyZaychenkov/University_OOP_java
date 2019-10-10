package Task_03.Commands.othersReturnStringBuilderCommands;

import Task_03.Commands.mainCommandTypes.Command;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class DeleteCharAt extends Command {
    int input1;

    public DeleteCharAt(StringBuilder builder, int input1) {
        super(builder);
        this.input1 = input1;
    }

    @Override
    public StringBuilder execute() {
        return builder.deleteCharAt(input1);
    }
}
