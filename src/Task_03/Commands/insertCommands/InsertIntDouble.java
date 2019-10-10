package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntDouble extends AbstractInsertCommand {

    public InsertIntDouble(StringBuilder builder, int input, double inputDouble1) {
        super(builder);
        this.input = input;
        this.inputDouble1 = inputDouble1;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input, inputDouble1);
    }
}