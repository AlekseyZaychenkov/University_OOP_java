package Task_03.Commands.appendCommands;

import Task_03.Commands.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 07.10.2019.
 */

public class AppendString<Boolean> extends AbstractAppendCommand {
    String changeString;
    public AppendString(StringBuilder builder, String changeString) {
        super(builder);
        this.changeString = changeString;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(changeString);
    }
}