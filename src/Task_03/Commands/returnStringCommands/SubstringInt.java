package Task_03.Commands.returnStringCommands;

import Task_03.Commands.mainCommandTypes.AbstractReturnStringCommand;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public class SubstringInt extends AbstractReturnStringCommand {

    public SubstringInt(StringBuilder builder, int input1) {
        super(builder);
        this.input1 = input1;
    }

    public String execute(){
        return builder.substring(input1);
    }
}
