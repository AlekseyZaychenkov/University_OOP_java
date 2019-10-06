package Task_03.Commands;


public class AppendCommand extends Command {

    public AppendCommand(StringBuilder builder, String changeString) {
        super(builder);
        this.changeString = changeString;
    }

    @Override
    public boolean execute() {
        builder.append(changeString);

        //editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}