package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntBoolean extends AbstractInsertCommand{

    public InsertIntBoolean(StringBuilder builder, int input, boolean inputBoolean1) {
        super(builder);
        this.input = input;
        this.inputBoolean1 = inputBoolean1;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input, inputBoolean1);
    }
}
