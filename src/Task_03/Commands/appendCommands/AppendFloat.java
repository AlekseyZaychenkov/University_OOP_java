package Task_03.Commands.appendCommands;

import Task_03.Commands.AbstractAppendCommand;

/**
 * Created by Aleksey Zaychenkov on 09.10.2019.
 */
public class AppendFloat extends AbstractAppendCommand {
    float change;
    public AppendFloat(StringBuilder builder, float change) {
        super(builder);
        this.change = change;
    }

    @Override
    public StringBuilder execute() {
        return builder.append(change);
    }
}