package Task_03.Commands.appendCommands;

import Task_03.Commands.mainCommandTypes.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 09.10.2019.
 */
public class AppendLong extends AbstractAppendCommand {
    long change;
    public AppendLong(StringBuilder builder, long change) {
        super(builder);
        this.change = change;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(change);
    }
}