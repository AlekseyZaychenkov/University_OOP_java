package Task_03.Commands.mainCommandTypes;

/**
 * Created by Aleksey Zaychenkov on 06.10.2019.
 */
public abstract class AbstractAppendCommand  extends Command {
    protected AbstractAppendCommand(StringBuilder editor) {
        super(editor);
    }
}
