package Task_03;


import Task_03.Commands.CommandHistory;
import Task_03.Commands.appendCommands.*;
import Task_03.Commands.insertCommands.*;
import Task_03.Commands.mainCommandTypes.CharAt;
import Task_03.Commands.mainCommandTypes.Command;
import Task_03.Commands.mainCommandTypes.SubSequence;
import Task_03.Commands.othersReturnStringBuilderCommands.Delete;
import Task_03.Commands.othersReturnStringBuilderCommands.DeleteCharAt;
import Task_03.Commands.othersReturnStringBuilderCommands.Replace;
import Task_03.Commands.othersReturnStringBuilderCommands.Reverse;
import Task_03.Commands.returnIntCommands.*;
import Task_03.Commands.returnStringCommands.SubstringInt;
import Task_03.Commands.returnStringCommands.SubstringIntInt;
import Task_03.Commands.returnVoidCommands.*;

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

    public int capacity(){
        return new CapacityAbstractCommand(builder).execute();
    }
    public char charAt(int index){
        return new CharAt(builder, index).execute();
    }
    public int codePointAt(int index) {
        return new CodePointAt(builder, index).execute();
    }

    public int codePointBefore(int index) {
        return new CodePointBefore(builder, index).execute();
    }

    public int codePointCount(int beginIndex, int endIndex){
        return new CodePointCount(builder, beginIndex, endIndex).execute();
    }

    public StringBuilder delete(int start, int end){
        return new Delete(builder, start, end).execute();
    }

    public StringBuilder deleteCharAt(int index){
        return new DeleteCharAt(builder, index).execute();
    }

    public void	ensureCapacity(int minimumCapacity){
        new EnsureCapacity(builder, minimumCapacity).execute();
    }

    public void	getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin){
        new GetChars(builder, srcBegin, srcEnd, dst, dstBegin).execute();
    }

    public int indexOf(String str){
        return new IndexOf(builder, str).execute();
    }

    public int indexOf(String str, int fromIndex){
        return new IndexOf_02(builder, str, fromIndex).execute();
    }

    public StringBuilder insert(int offset, boolean b){
        return new InsertIntBoolean(builder, offset, b).execute();
    }

    public StringBuilder insert(int offset, char c){
        return new InsertIntChar(builder, offset, c).execute();
    }

    public StringBuilder insert(int offset, char[] str){
        return new InsertIntCharArray(builder, offset, str).execute();
    }

    public StringBuilder insert(int index, char[] str, int offset, int len){
        return new InsertIntCharArrayIntInt(builder, index, str, offset, len).execute();
    }

    public StringBuilder insert(int dstOffset, CharSequence s){
        return new InsertIntCharSequence(builder, dstOffset, s).execute();
    }

    public StringBuilder insert(int dstOffset, CharSequence s, int start, int end){
        return new InsertIntCharSequenceIntInt(builder, dstOffset, s, start, end).execute();
    }

    public StringBuilder insert(int offset, double d){
        return new InsertIntDouble(builder, offset, d).execute();
    }

    public StringBuilder insert(int offset, float f){
        return new InsertIntFloat(builder, offset, f).execute();
    }

    public StringBuilder insert(int offset, int i){
        return new InsertIntInt(builder, offset, i).execute();
    }

    public StringBuilder insert(int offset, long l){
        return new InsertIntLong(builder, offset, l).execute();
    }

    public StringBuilder insert(int offset, Object obj){
        return new InsertIntObject(builder, offset, obj).execute();
    }

    public StringBuilder insert(int offset, String str){
        return new InsertIntString(builder, offset, str).execute();
    }

    public int lastIndexOf(String str){
        return new LastIndexOfString(builder, str).execute();
    }

    public int lastIndexOf(String str, int fromIndex){
        return new LastIndexOfStringInt(builder, str, fromIndex).execute();
    }

    public int length(){
        return new Length(builder).execute();
    }

    public int offsetByCodePoints(int index, int codePointOffset){
        return new OffsetByCodePoints(builder, index, codePointOffset).execute();
    }

    public StringBuilder replace(int start, int end, String str){
        return new Replace(builder, start, end, str).execute();
    }

    public StringBuilder reverse(){
        return new Reverse(builder).execute();
    }

    public void	setCharAt(int index, char ch){
        new SetCharAt(builder, index, ch).execute();
    }

    public void	setLength(int newLength){
        new SetLength(builder, newLength).execute();
    }

    public CharSequence	subSequence(int start, int end){
        return new SubSequence(builder, start, end).execute();
    }

    public String substring(int start){
        return new SubstringInt(builder, start).execute();
    }

    public String substring(int start, int end){
        return new SubstringIntInt(builder, start, end).execute();
    }

    @Override
    public String toString() {
        return builder.toString();
    }

    public void	trimToSize(){
        new TrimToSize(builder).execute();
    }




}

