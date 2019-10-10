package Task_03.Commands.mainCommandTypes;

/**
 * Created by Aleksey Zaychenkov on 10.10.2019.
 */
public abstract class AbstractInsertCommand extends Command {
    protected AbstractInsertCommand(StringBuilder builder) {
        super(builder);
    }
}