package Task_03.Commands.insertCommands;

import Task_03.Commands.mainCommandTypes.AbstractInsertCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class InsertIntCharSequenceIntInt extends AbstractInsertCommand {

    public InsertIntCharSequenceIntInt(StringBuilder builder, int input1, CharSequence charSequence1, int input2, int input3) {
        super(builder);
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.charSequence1 = charSequence1;
    }

    @Override
    public StringBuilder execute() {
        return builder.insert(input1, charSequence1, input2, input3);
    }
}
