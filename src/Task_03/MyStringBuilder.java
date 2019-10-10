package Task_03;


import Task_03.Commands.returnIntCommands.CapacityAbstractCommand;
import Task_03.Commands.mainCommandTypes.Command;
import Task_03.Commands.CommandHistory;
import Task_03.Commands.appendCommands.*;

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
        if (command.execute() != null) {
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
    public MyStringBuilder append(char[] input, int offset, int len){
        executeCommand(new AppendCharArrayWithOffset(builder, input, offset, len));
        return this;
    }
    public MyStringBuilder append(CharSequence s){
        executeCommand(new AppendCharSequence(builder, s));
        return this;
    }
    public MyStringBuilder append(CharSequence s, int start, int end){
        executeCommand(new AppendCharSequenceWithOffset(builder, s, start, end));
        return this;
    }
    public MyStringBuilder append(double d){
        executeCommand(new AppendDouble(builder, d));
        return this;
    }
    public MyStringBuilder append(float d){
        executeCommand(new AppendFloat(builder, d));
        return this;
    }
    public MyStringBuilder append(int d){
        executeCommand(new AppendInt(builder, d));
        return this;
    }
    public MyStringBuilder append(long lng){
        executeCommand(new AppendLong(builder, lng));
        return this;
    }
    public MyStringBuilder append(Object obj){
        executeCommand(new AppendObject(builder, obj));
        return this;
    }
    public MyStringBuilder append(String input){
        executeCommand(new AppendString(builder, input));
        return this;
    }
    public MyStringBuilder append(StringBuffer sb){
        executeCommand(new AppendObject(builder, sb));
        return this;
    }
    public MyStringBuilder appendCodePoint(int codePoint){
        executeCommand(new AppendCodePoint(builder, codePoint));
        return this;
    }




    public int capacityCommand(){
        return new CapacityAbstractCommand(builder).executeReturnInt();
    }


    @Override
    public String toString() {
        return builder.toString();
    }
}

