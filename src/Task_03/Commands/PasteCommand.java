package Task_03.Commands;

/**
 * Created by Aleksey Zaychenkov on 04.10.2019.
 */
public class PasteCommand extends Command {

    public PasteCommand(StringBuilder editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
       // if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
      //  editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
