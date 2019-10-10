package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntInt extends AbstractInsertCommand {

    public InsertIntInt(StringBuilder builder, int input1, int input2) {
        super(builder);
        this.input1 = input1;
        this.input2 = input2;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input1, input2);
    }
}