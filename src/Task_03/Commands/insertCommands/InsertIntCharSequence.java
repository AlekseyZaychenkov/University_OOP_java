package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntCharSequence extends AbstractInsertCommand {

    public InsertIntCharSequence(StringBuilder builder, int input1, CharSequence charSequence1) {
        super(builder);
        this.input1 = input1;
        this.charSequence1 = charSequence1;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input1, charSequence1);
    }
}
