package Task_03.Commands.returnVoidCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnVoidCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class EnsureCapacity extends AbstractReturnVoidCommand {
    int input;

    public EnsureCapacity(StringBuilder builder, int input){
        super(builder);
        this.input   = input;
    }

    public void execute() {
         builder.ensureCapacity(input);
    }
}
