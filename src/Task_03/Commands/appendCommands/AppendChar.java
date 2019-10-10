package Task_03.Commands.appendCommands;

import Task_03.Commands.mainCommandTypes.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 07.10.2019.
 */
public class AppendChar extends AbstractAppendCommand {
    char change;
    public AppendChar(StringBuilder builder, char change) {
        super(builder);
        this.change = change;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(change);
    }
}
