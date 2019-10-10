package Task_03.Commands.returnVoidCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnVoidCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class TrimToSize extends AbstractReturnVoidCommand {

    public TrimToSize(StringBuilder builder){
        super(builder);
    }

    public void execute() {
        builder.trimToSize();
    }
}


