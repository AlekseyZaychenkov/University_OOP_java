package Task_03.Commands;

/**
 * Created by Aleksey Zaychenkov on 04.10.2019.
 */
public abstract class Command {
    public StringBuilder builder;
    private String backup;
    protected String changeString;

    protected Command(StringBuilder editor) {
        this.builder = editor;
    }

    protected Command(StringBuilder editor, String changeString) {
        this.builder = editor;
        this.changeString = changeString;
    }

    void backup() {
        backup = builder.toString();
    }

    public void undo() {
        builder = new StringBuilder(backup);
    }

    public abstract boolean execute();
}