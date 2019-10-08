package Task_03;


import Task_03.Commands.Command;
import Task_03.Commands.CommandHistory;
import Task_03.Commands.appendCommands.AppendBoolean;
import Task_03.Commands.appendCommands.AppendChar;
import Task_03.Commands.appendCommands.AppendCharArray;
import Task_03.Commands.appendCommands.AppendString;

/**
 * Created by Aleksey Zaychenkov on 04.10.2019.
 */
public class MyStringBuilder {
        private CommandHistory history = new CommandHistory();
        StringBuilder builder;

    public  MyStringBuilder() {
        this.builder = new StringBuilder();
    }


    public void executeCommand(Command command) {
        if (command.execute()!=null) {
            history.push(builder.toString());
        }
    }

    public void undo() {
        if (history.isEmpty()) return;

        String string = history.undo();
        if (string != null) {
            builder.delete(0, builder.length());
            builder.append(string);
        }
    }

    public void redo() {
        if (history.isEmpty()) return;

        String string = history.redo();
        if (string != null) {
            builder.delete(0, builder.length());
            builder.append(string);
        }
    }



    public MyStringBuilder append(Boolean input){
       executeCommand(new AppendBoolean(builder, input));
       return this;
    }

    public MyStringBuilder append(char input){
        executeCommand(new AppendChar(builder, input));
        return this;
    }
    public MyStringBuilder append(char[] input){
        executeCommand(new AppendCharArray(builder, input));
        return this;
    }

    public MyStringBuilder append(String input){
        executeCommand(new AppendString(builder, input));
        return this;
    }


    @Override
    public String toString() {
        return builder.toString();
    }
}

