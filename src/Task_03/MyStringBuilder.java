package Task_03;


import Task_03.Commands.Command;
import Task_03.Commands.CommandHistory;
import Task_03.Commands.appendCommands.AppendBoolean;
import Task_03.Commands.appendCommands.AppendChar;
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
                history.push(command);
            }
        }

        private void undo() {
            if (history.isEmpty()) return;

            Command command = history.pop();
            if (command != null) {
                command.undo();
            }
        }


   public MyStringBuilder appendBoolean(Boolean input){
       executeCommand(new AppendBoolean(builder, input));
       return this;
   }

    public MyStringBuilder appendChar(char input){
        executeCommand(new AppendChar(builder, input));
        return this;
    }

    public MyStringBuilder appendString(String input){
        executeCommand(new AppendString(builder, input));
        return this;
    }


    @Override
    public String toString() {
        return builder.toString();
    }
}

