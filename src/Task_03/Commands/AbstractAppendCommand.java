package Task_03.Commands;

/**
 * Created by Aleksey Zaychenkov on 06.10.2019.
 */
public abstract class AbstractAppendCommand<T>  extends  Command{
    protected AbstractAppendCommand(StringBuilder editor, T inputType) {
        super(editor);
        this.builder = editor;
    }
}
