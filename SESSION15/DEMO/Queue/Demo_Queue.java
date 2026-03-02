package SESSION15.DEMO.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo_Queue {
    public static void main(String[] args) {

        // 1. KHỞI TẠO QUEUE (Mượn cấu trúc của LinkedList)
        Queue<String> hangDoi = new LinkedList<>();

        System.out.println("--- 1. THÊM VÀO HÀNG ĐỢI (ENQUEUE) ---");
        // Hàm offer(): Xếp hàng vào cuối danh sách.
        // (Trong thực tế khuyên dùng offer() thay vì add() vì offer() an toàn hơn, không gây lỗi sập chương trình nếu hàng đợi bị đầy).
        hangDoi.offer("Khách hàng A");
        hangDoi.offer("Khách hàng B");
        hangDoi.offer("Khách hàng C");

        System.out.println("Đã thêm 3 người vào hàng đợi. Kích thước: " + hangDoi.size());


        System.out.println("\n--- 2. XEM NGƯỜI ĐỨNG ĐẦU HÀNG (PEEK) ---");
        // Hàm peek(): Xem ai đang đứng đầu để chuẩn bị phục vụ (Chỉ nhìn, KHÔNG xóa khỏi hàng)
        System.out.println("Người chuẩn bị được phục vụ là: " + hangDoi.peek());
        // Kết quả: Khách hàng A


        System.out.println("\n--- 3. DUYỆT ĐỂ XEM (KHÔNG MẤT DỮ LIỆU) ---");
        // Dùng vòng lặp for-each để nhìn lướt qua xem trong hàng có những ai (Từ đầu hàng đến cuối hàng)
        System.out.print("Danh sách đang xếp hàng: ");
        for (String khach : hangDoi) {
            System.out.print(khach + " -> ");
        }
        System.out.println(" (Cuối hàng)");


        System.out.println("\n--- 4. PHỤC VỤ VÀ XÓA KHỎI HÀNG (DEQUEUE) ---");
        // Hàm poll(): Gọi người đầu tiên ra phục vụ, và XÓA người đó khỏi hàng đợi.
        // (Khuyên dùng poll() thay vì remove(), vì nếu hàng rỗng poll() chỉ trả về null chứ không báo lỗi đỏ).
        String nguoiDuocPhucVu = hangDoi.poll();
        System.out.println("Đang phục vụ: " + nguoiDuocPhucVu);
        System.out.println("Người tiếp theo đang chờ: " + hangDoi.peek()); // Lúc này sẽ là B


        System.out.println("\n--- 5. DUYỆT BẰNG CÁCH RÚT SẠCH HÀNG ĐỢI ---");
        // Đây là cách duyệt phổ biến nhất trong thực tế: Phục vụ liên tục cho đến khi hết khách
        while (!hangDoi.isEmpty()) {
            System.out.println("Tiếp tục phục vụ: " + hangDoi.poll());
        }

        System.out.println("\nHàng đợi lúc này đã rỗng? " + hangDoi.isEmpty());
    }
}