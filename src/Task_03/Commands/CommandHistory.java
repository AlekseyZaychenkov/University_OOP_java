package Task_03.Commands;

import java.util.LinkedList;
import java.util.ListIterator;


public class CommandHistory {
    private LinkedList<String> history = new LinkedList<>();
    ListIterator<String> iterator;
    boolean previousWasUndo = false;
    boolean previousWasRedo = false;

    public void push(String str) {
        history.add(str);
    }

    public String undo() {
        try {
            if (iterator == null)
                iterator = history.listIterator(history.size() - 1);

            if (previousWasRedo)
                iterator.previous();

            if (iterator.hasPrevious())
                return iterator.previous();
            else
                return "";
        } finally {
            previousWasUndo = true;
            previousWasRedo = false;
        }
    }

    public String redo() {
        try {
            if (iterator == null)
                iterator = history.listIterator(history.size() - 1);

            if (previousWasUndo)
                iterator.next();

            if (iterator.hasNext())
                return iterator.next();
            else
                return history.size() == 0 ? "" : history.get(history.size()-1);

        } finally {
            previousWasUndo = false;
            previousWasRedo = true;
        }
    }

    public boolean isEmpty() { return history.isEmpty(); }
}