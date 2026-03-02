package SESSION15.SESSION15_03;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack;

    public MedicationProcessChecker() {
        this.stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {
        for (String action : actions) {
            if (action.equalsIgnoreCase("PUSH")) {
                stack.push(action);
                System.out.println("Phát thuốc");
            } else if (action.equalsIgnoreCase("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Lỗi: Không được POP khi Stack rỗng (Chưa phát thuốc mà đã báo hoàn tất)!");
                    return false;
                }
                stack.pop();
                System.out.println("Hoàn tất phát thuốc");
            } else {
                System.out.println("Thao tác không hợp lệ: " + action);
                return false;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("=> Kết thúc ca trực: Quy trình hợp lệ, Stack rỗng.");
            return true;
        } else {
            System.out.println("=> Lỗi kết thúc ca trực: Stack không rỗng (Còn thuốc chưa hoàn tất)!");
            return false;
        }
    }

    public void reset() {
        stack.clear();
        System.out.println("\n--- Đã reset lại hệ thống cho ca mới ---");
    }
}