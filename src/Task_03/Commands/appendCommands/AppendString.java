package Task_03.Commands.appendCommands;

import Task_03.Commands.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 07.10.2019.
 */

public class AppendString extends AbstractAppendCommand {
    String change;
    public AppendString(StringBuilder builder, String change) {
        super(builder);
        this.change = change;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(change);
    }
}