package SESSION15.SESSION15_01;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        this.history = new Stack<>();
    }
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã lưu thao tác: " + action.getDescription());
    }
    public EditAction undoEdit() {
        if (isEmpty()) {
            System.out.println("Lịch sử trống, không có thao tác nào để hoàn tác!");
            return null;
        }
        EditAction undoneAction = history.pop();
        System.out.println("Đã HOÀN TÁC thao tác: " + undoneAction.getDescription());
        return undoneAction;
    }
    public EditAction getLatestEdit() {
        if (isEmpty()) {
            System.out.println("Lịch sử trống!");
            return null;
        }
        return history.peek();
    }
    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (isEmpty()) {
            System.out.println("Lịch sử chỉnh sửa đang trống.");
            return;
        }
        System.out.println("\n--- LỊCH SỬ CHỈNH SỬA (Từ cũ nhất -> Mới nhất) ---");
        for (EditAction action : history) {
            System.out.println(action.toString());
        }
        System.out.println("---------------------------------------------------");
    }
}