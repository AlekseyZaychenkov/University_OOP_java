package Task_03.Commands.appendCommands;

import Task_03.Commands.mainCommandTypes.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 06.10.2019.
 */
public class AppendBoolean extends AbstractAppendCommand {
    Boolean change;
    public AppendBoolean(StringBuilder builder, Boolean change) {
        super(builder);
        this.change = change;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(change);
    }
}
