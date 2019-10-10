package Task_03.Commands.othersReturnStringBuilderCommands;

import Task_03.Commands.mainCommandTypes.Command;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class Delete extends Command {
    int input1;
    int input2;

    public Delete(StringBuilder builder, int input1, int input2) {
        super(builder);
        this.input1 = input1;
        this.input2 = input2;
    }

    @Override
    public StringBuilder execute() {
        return builder.delete(input1, input2);
    }
}
