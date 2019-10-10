package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntString extends AbstractInsertCommand {

    public InsertIntString(StringBuilder builder, int input1, String inputString1) {
        super(builder);
        this.input1 = input1;
        this.inputString1 = inputString1;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input1, inputString1);
    }
}