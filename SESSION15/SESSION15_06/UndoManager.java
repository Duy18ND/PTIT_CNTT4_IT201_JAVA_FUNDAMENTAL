package SESSION15.SESSION15_06;

import java.util.Stack;

public class UndoManager {
    private Stack<InputAction> undoStack;
    private int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.undoStack = new Stack<>();
        this.maxUndoSteps = maxUndoSteps;
    }

    public void recordAction(InputAction action) {
        if (undoStack.size() >= maxUndoSteps) {
            undoStack.remove(0);
        }
        undoStack.push(action);
    }

    public InputAction undo() {
        if (!undoStack.isEmpty()) {
            return undoStack.pop();
        }
        return null;
    }
}