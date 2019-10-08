package Task_03.Commands.appendCommands;

import Task_03.Commands.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 07.10.2019.
 */
public class AppendChar extends AbstractAppendCommand {
    char changeChar;
    public AppendChar(StringBuilder builder, char changeChar) {
        super(builder);
        this.changeChar = changeChar;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(changeChar);
    }
}
