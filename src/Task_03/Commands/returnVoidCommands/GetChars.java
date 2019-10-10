package Task_03.Commands.returnVoidCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnVoidCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class GetChars extends AbstractReturnVoidCommand {

    public GetChars(StringBuilder builder, int input1, int input2, char[] input1ChArr, int input4){
        super(builder);
        this.input1      = input1;
        this.input2      = input2;
        this.input1ChArr = input1ChArr;
        this.input4      = input4;
    }

    public void execute() {
        builder.getChars(input1, input2, input1ChArr, input4);
    }
}
