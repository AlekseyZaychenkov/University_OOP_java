package Task_03.Commands.appendCommands;

import Task_03.Commands.mainCommandTypes.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 09.10.2019.
 */
public class AppendCharSequenceWithOffset extends AbstractAppendCommand {
    CharSequence  change;
    int offset, len;
    public AppendCharSequenceWithOffset(StringBuilder builder, CharSequence change, int offset, int len) {
        super(builder);
        this.change = change;
        this.offset = offset;
        this.len    = len;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(change, offset, len);
    }
}