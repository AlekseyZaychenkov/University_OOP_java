package Task_03.Commands.appendCommands;

import Task_03.Commands.mainCommandTypes.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 09.10.2019.
 */
public class AppendCodePoint extends AbstractAppendCommand {
    int change;
    public AppendCodePoint(StringBuilder builder, int change) {
        super(builder);
        this.change = change;
    }

    @Override
    public StringBuilder execute() {
        return builder.appendCodePoint(change);
    }
}