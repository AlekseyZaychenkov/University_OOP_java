package Task_03.Commands.appendCommands;

import Task_03.Commands.mainCommandTypes.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 08.10.2019.
 */
public class AppendCharArray extends AbstractAppendCommand {
    char[]  change;
    public AppendCharArray(StringBuilder builder, char[] change) {
        super(builder);
        this.change = change;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(change);
    }
}