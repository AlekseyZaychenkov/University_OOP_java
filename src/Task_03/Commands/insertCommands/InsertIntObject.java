package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntObject  extends AbstractInsertCommand {

    public InsertIntObject(StringBuilder builder, int input1, Object inputObject1) {
        super(builder);
        this.input1 = input1;
        this.inputObject1 = inputObject1;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input1, inputObject1);
    }
}
