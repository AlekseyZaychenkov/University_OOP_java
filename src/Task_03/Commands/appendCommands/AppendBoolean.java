package Task_03.Commands.appendCommands;

import Task_03.Commands.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 06.10.2019.
 */
public class AppendBoolean<Boolean> extends AbstractAppendCommand {
    Boolean changeBoolean;
    public AppendBoolean(StringBuilder builder, Boolean changeBoolean) {
        super(builder);
        this.changeBoolean = changeBoolean;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(changeBoolean);
    }
}
