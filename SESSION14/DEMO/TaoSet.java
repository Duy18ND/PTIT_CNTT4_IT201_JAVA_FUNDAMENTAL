package SESSION14.DEMO;

import java.util.HashSet;
import java.util.Iterator; // Cần import thêm thư viện Iterator
import java.util.Set;

public class TaoSet {
    // Lưu ý nhỏ: Hàm main trong Java bắt buộc phải có tham số (String[] args) mới chạy được
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1); // Đặc tính của Set: Tự động từ chối số 1 bị trùng lặp này

        System.out.println("\nDANH SÁCH CÁC PHẦN TỬ KHÔNG TRÙNG LẶP");

        // Cách 1: Dùng forEach (for-each loop)
        System.out.println("--- Cách 1 ---");
        for(Integer i : list){
            System.out.println(i + " ");
        }

        // Cách 2: Dùng while kết hợp với Iterator
        System.out.println("--- Cách 2 ---");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value + " ");
        }
    }
}