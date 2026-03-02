package SESSION15.SESSION15_06;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> editStack;
    private String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
        this.editStack = new Stack<>();
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
    }

    public EditAction undoEdit() {
        if (!editStack.isEmpty()) {
            return editStack.pop();
        }
        return null;
    }

    public String getRecordId() {
        return recordId;
    }
}