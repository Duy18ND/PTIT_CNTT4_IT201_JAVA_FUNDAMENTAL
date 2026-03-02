package SESSION15.DEMO;

import SESSION15.DEMO.Stack.Stack;

public class Main {
    public static void main(String[] args) {
        // Tạo một Stack chứa tối đa 3 chuỗi (String)
        Stack<String> history = new Stack<>(3);

        System.out.println("--- THÊM DỮ LIỆU (PUSH) ---");
        history.push("Trang chủ");
        history.push("Sản phẩm");
        history.push("Giỏ hàng");

        // Thử thêm phần tử thứ 4 để test lỗi "Full Stack"
        history.push("Thanh toán");

        System.out.println("\n--- THÔNG TIN STACK ---");
        System.out.println("Kích thước hiện tại: " + history.size());
        System.out.println("Đang đứng ở trang: " + history.peek());

        System.out.println("\n--- BẤM NÚT QUAY LẠI (POP) ---");
        System.out.println("Rời khỏi trang: " + history.pop());
        System.out.println("Rời khỏi trang: " + history.pop());

        System.out.println("Bây giờ đang đứng ở: " + history.peek()); // Sẽ là "Trang chủ"
        // 1. Duyệt để xem thử (Số 30 vào sau cùng sẽ nằm trên cùng)
        history.display();

        System.out.println("\nKích thước sau khi display: " + history.size());

        // 2. Duyệt bằng cách rút sạch ra ngoài
        history.popAllAndDisplay();

        System.out.println("\nKích thước sau khi popAll: " + history.size());
    }
}