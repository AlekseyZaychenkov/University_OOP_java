package Task_03.Commands;

/**
 * Created by Aleksey Zaychenkov on 04.10.2019.
 */
public abstract class Command {
    public StringBuilder editor;
    private String backup;

    Command(StringBuilder editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.toString();
    }

    public void undo() {
        editor = new StringBuilder(backup);
    }

    public abstract boolean execute();
}