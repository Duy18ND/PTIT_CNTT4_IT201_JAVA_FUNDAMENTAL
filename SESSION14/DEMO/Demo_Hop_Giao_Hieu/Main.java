package SESSION14.DEMO.Demo_Hop_Giao_Hieu;

import java.util.HashSet;
import java.util.Set;

public class Main {
    // Sửa lỗi: Hàm main chuẩn phải có public và String[] args
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1); set1.add(2); set1.add(3); set1.add(7); set1.add(8);
        set2.add(2); set2.add(3); set2.add(5); set2.add(6);

        // --- IN DANH SÁCH BAN ĐẦU ---
        System.out.println("Tập hợp set1: " + set1);
        System.out.println("Tập hợp set2: " + set2); // Sửa lỗi in nhầm set1


        // ==========================================
        // 1. PHÉP HỢP (UNION): Gom tất cả lại với nhau
        // ==========================================
        Set<Integer> hop = new HashSet<>();

        // addAll(): Đổ toàn bộ phần tử của tập hợp khác vào tập hợp hiện tại.
        // Nhờ đặc tính của Set, những số bị trùng (như 2 và 3) sẽ tự động bị loại bỏ, chỉ giữ lại 1 bản.
        hop.addAll(set1); // Bỏ hết set1 vào
        hop.addAll(set2); // Bỏ tiếp set2 vào

        System.out.println("\nHợp (Union) set1 + set2: ");
        for(Integer i : hop){
            System.out.print(i + " ");
        } // Kết quả: 1 2 3 5 6 7 8


        // ==========================================
        // 2. PHÉP GIAO (INTERSECTION): Tìm điểm chung
        // ==========================================
        Set<Integer> giao = new HashSet<>();
        giao.addAll(set1); // Copy dữ liệu từ set1 sang để làm gốc

        // retainAll(): So sánh tập hiện tại với tập truyền vào (set2).
        // CHỈ GIỮ LẠI những phần tử có mặt ở CẢ HAI tập hợp. Cái nào không có ở set2 thì xóa đi.
        giao.retainAll(set2);

        System.out.println("\n\nGiao (Intersection) set1 & set2: ");
        for(Integer i : giao){
            System.out.print(i + " ");
        } // Kết quả: 2 3 (Vì 2 và 3 nằm ở cả 2 tập hợp)


        // ==========================================
        // 3. PHÉP HIỆU (DIFFERENCE): Phần riêng biệt
        // ==========================================
        Set<Integer> hieu = new HashSet<>();
        hieu.addAll(set1); // Copy dữ liệu từ set1 sang để làm gốc

        // removeAll(): Quét tập hiện tại, nếu thấy phần tử nào nằm trong tập truyền vào (set2) thì XÓA BỎ phần tử đó.
        // Tức là: set1 trừ đi set2 (Lấy những cái chỉ có ở set1 mà không có ở set2).
        hieu.removeAll(set2);

        System.out.println("\n\nHiệu (Difference) set1 - set2: ");
        for(Integer i : hieu){
            System.out.print(i + " ");
        } // Kết quả: 1 7 8 (Vì 2 và 3 đã bị set2 đá bay mất)
    }
}