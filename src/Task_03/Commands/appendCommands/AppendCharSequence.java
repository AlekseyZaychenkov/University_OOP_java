package Task_03.Commands.appendCommands;

import Task_03.Commands.mainCommandTypes.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 09.10.2019.
 */
public class AppendCharSequence  extends AbstractAppendCommand {
    CharSequence change;
    public AppendCharSequence(StringBuilder builder, CharSequence change) {
        super(builder);
        this.change = change;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(change);
    }
}