package Task_03.Commands.othersReturnStringBuilderCommands;

import Task_03.Commands.mainCommandTypes.Command;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class Replace extends Command {
    int input1;

    public Replace(StringBuilder builder, int input1, int input2, String inputString1) {
        super(builder);
        this.input1 = input1;
        this.input2 = input2;
        this.inputString1 = inputString1;
    }

    @Override
    public StringBuilder execute() {
        return builder.	replace(input1, input2, inputString1);
    }
}

