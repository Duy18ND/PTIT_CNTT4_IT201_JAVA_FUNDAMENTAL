package SESSION15.DEMO.Stack;

public class Stack<T> {
    private T[] list;
    private int top;

    // Khởi tạo Stack với kích thước cho trước
    @SuppressWarnings("unchecked") // Tắt cảnh báo ép kiểu Generic của Java
    public Stack(int size) {
        // Mẹo tạo mảng Generic: Tạo mảng Object rồi ép kiểu về T[]
        list = (T[]) new Object[size];
        top = -1; // -1 nghĩa là mảng đang rỗng hoàn toàn
    }

    // 1. PUSH: Thêm phần tử vào đỉnh Stack
    public void push(T item) {
        if (isFull()) {
            System.out.println("Lỗi: Stack đã đầy (Overflow)!");
            return;
        }
        // Tăng top lên 1 trước (++top), sau đó gán giá trị vào vị trí đó
        list[++top] = item;
    }

    // 2. POP: Lấy phần tử trên đỉnh ra và XÓA nó
    public T pop() {
        if (isEmpty()) {
            System.out.println("Lỗi: Stack rỗng (Underflow)!");
            return null;
        }
        // Lấy giá trị tại top hiện tại, sau đó mới giảm top đi 1 (top--)
        return list[top--];
    }

    // 3. PEEK: Chỉ xem phần tử trên đỉnh (KHÔNG xóa)
    public T peek() {
        if (isEmpty()) {
            System.out.println("Cảnh báo: Stack rỗng, không có gì để xem!");
            return null;
        }
        // ĐÃ SỬA LỖI: Chỉ trả về list[top], tuyệt đối không có dấu trừ (--) ở đây
        return list[top];
    }

    // 4. KIỂM TRA RỖNG
    public boolean isEmpty() {
        return top == -1;
    }

    // 5. KIỂM TRA ĐẦY
    public boolean isFull() {
        return top == list.length - 1;
    }

    // 6. KÍCH THƯỚC HIỆN TẠI
    public int size() {
        return top + 1;
    }

    // 7. LÀM RỖNG STACK (Xóa toàn bộ)
    public void clear() {
        // Chỉ cần ép top về -1, các phần tử cũ sẽ tự động bị ghi đè sau này
        top = -1;
        System.out.println("Đã dọn dẹp toàn bộ Stack.");
    }
    // 8. DUYỆT ĐỂ XEM (In từ Đỉnh xuống Đáy) - Dữ liệu vẫn còn nguyên
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack đang rỗng, không có gì để duyệt.");
            return;
        }
        System.out.println("--- Danh sách Stack (Đỉnh -> Đáy) ---");
        // Vòng lặp chạy ngược từ vị trí top lùi về 0
        for (int i = top; i >= 0; i--) {
            System.out.println(list[i]);
        }
        System.out.println("-------------------------------------");
    }

    // 9. DUYỆT BẰNG CÁCH RÚT HẾT RA (Destructive Traversal)
    // Cách này rất hay dùng trong các bài tập thuật toán: Rút đến đâu, in đến đó cho tới khi rỗng
    public void popAllAndDisplay() {
        if (isEmpty()) {
            System.out.println("Stack rỗng!");
            return;
        }
        System.out.println("--- Bắt đầu xả Stack ---");
        // Chừng nào Stack chưa rỗng thì cứ lấy phần tử trên đỉnh ra
        while (!isEmpty()) {
            System.out.println("Vừa rút ra: " + pop());
        }
        System.out.println("--- Stack đã được xả sạch ---");
    }
}