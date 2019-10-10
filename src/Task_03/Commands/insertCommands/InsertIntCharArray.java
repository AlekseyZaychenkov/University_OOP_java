package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntCharArray extends AbstractInsertCommand {

    public InsertIntCharArray(StringBuilder builder, int input, char[] inputCharArray1) {
        super(builder);
        this.input = input;
        this.inputCharArray1 = inputCharArray1;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input, inputCharArray1);
    }
}
