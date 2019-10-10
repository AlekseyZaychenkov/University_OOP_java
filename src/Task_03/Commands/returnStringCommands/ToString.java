package Task_03.Commands.returnStringCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnStringCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class ToString extends AbstractReturnStringCommand {

    protected ToString(StringBuilder builder) {
        super(builder);
    }

    public String execute(){
        return builder.toString();
    }
}
