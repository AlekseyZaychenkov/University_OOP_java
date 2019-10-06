package Task_03.Commands;

/**
 * Created by Aleksey Zaychenkov on 06.10.2019.
 */
public class AppendBoolean extends  AbstractAppendCommand{

    public AppendBoolean(StringBuilder builder, Boolean changeBoolean) {
        super(builder, changeBoolean);
        changeString = changeBoolean.toString();
    }

    @Override
    public boolean execute() {
        builder.append(changeString);

        //editor.clipboard = editor.textField.getSelectedText();
        return false;
    }

}
