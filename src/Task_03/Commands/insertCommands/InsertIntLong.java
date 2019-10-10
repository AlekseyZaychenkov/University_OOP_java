package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntLong extends AbstractInsertCommand {

    public InsertIntLong(StringBuilder builder, int input1, long inputLong1) {
        super(builder);
        this.input1 = input1;
        this.inputLong1 = inputLong1;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input1, inputLong1);
    }
}