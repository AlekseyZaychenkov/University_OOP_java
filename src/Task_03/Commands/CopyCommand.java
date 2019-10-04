package Task_03.Commands;


public class CopyCommand extends Command {

    public CopyCommand(StringBuilder editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
       // editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}