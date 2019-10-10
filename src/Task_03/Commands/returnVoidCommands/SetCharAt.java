package Task_03.Commands.returnVoidCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnVoidCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class SetCharAt extends AbstractReturnVoidCommand {

    public SetCharAt(StringBuilder builder, int input1, char inputChar1){
        super(builder);
        this.input1     = input1;
        this.inputChar1 = inputChar1;
    }

    public void execute() {
        builder.setCharAt(input1, inputChar1);
    }
}

