package Task_03.Commands.returnVoidCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnVoidCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class SetLength extends AbstractReturnVoidCommand {

    public SetLength(StringBuilder builder, int input1){
        super(builder);
        this.input1     = input1;
    }

    public void execute() {
        builder.setLength(input1);
    }
}

