package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntFloat extends AbstractInsertCommand {

    public InsertIntFloat(StringBuilder builder, int input, float inputFloat1) {
        super(builder);
        this.input = input;
        this.inputFloat1 = inputFloat1;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input, inputFloat1);
    }
}
