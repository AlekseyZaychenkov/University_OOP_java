package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntChar extends AbstractInsertCommand {

    public InsertIntChar(StringBuilder builder, int input, char inputChar1) {
        super(builder);
        this.input = input;
        this.inputChar1 = inputChar1;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input, inputChar1);
    }
}
