package SESSION14.DEMO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_Map {
    public static void main(String[] args) {

        // 1. KHỞI TẠO MAP
        // Giống như việc thuê một dãy tủ đồ siêu thị.
        // Key (Integer): Mã số trên chìa khóa (phải là DUY NHẤT).
        // Value (Student): Món đồ cất bên trong tủ (có thể trùng nhau).
        Map<Integer, Student> mapSinhVien = new HashMap<>();

        // 2. THÊM DỮ LIỆU (Cách sử dụng put)
        // Cú pháp: put(chìa_khóa, món_đồ)
        mapSinhVien.put(1, new Student(1, "CNTT4"));
        mapSinhVien.put(2, new Student(2, "CNTT4"));
        mapSinhVien.put(3, new Student(3, "CNTT4"));
        mapSinhVien.put(4, new Student(4, "CNTT4"));

        // Lưu ý cơ chế của put(): Nếu bạn cố tình nhét đồ vào một cái tủ đã có chủ:
        // mapSinhVien.put(1, new Student(99, "CNTT_Mới"));
        // -> Nó sẽ ĐÁ văng bạn sinh viên cũ ra, và thay thế bằng sinh viên mới.

        // ====================================================
        // CÁCH 1: DUYỆT THEO KEY (Lấy một chùm chìa khóa ra thử từng cái)
        // ====================================================
        System.out.println("\n--- Cách duyệt 1: Duyệt theo tập hợp Key (keySet) ---");

        // keySet(): Hàm này gom tất cả các Key (1, 2, 3, 4) thành một Set (vì Key không được trùng).
        Set<Integer> tapHopKey = mapSinhVien.keySet();

        for(Integer key : tapHopKey){
            // get(key): Đút chìa khóa vào Map để lấy đối tượng Value (Student) ra.
            Student sinhVien = mapSinhVien.get(key);
            System.out.println("Key tủ số: " + key + " -> Bên trong chứa: " + sinhVien.toString());
        }

        // ====================================================
        // CÁCH 2: DUYỆT THEO ENTRY (Bê cả Khóa lẫn Tủ ra cùng lúc - KHUYÊN DÙNG)
        // ====================================================
        System.out.println("\n--- Cách duyệt 2: Duyệt theo Entry (Cặp Key-Value) ---");

        // entrySet(): Hàm này gom cả Key và Value thành một khối gọi là Map.Entry.
        // Tác dụng: Cực kỳ tối ưu tốc độ. Máy tính không phải tốn công cầm chìa khóa (key) chạy đi tìm đồ (value) như hàm get() ở Cách 1 nữa.
        for(Map.Entry<Integer, Student> entry : mapSinhVien.entrySet()){
            Integer key = entry.getKey();         // Lấy Key trực tiếp từ khối Entry
            Student sinhVien = entry.getValue();  // Lấy Value trực tiếp từ khối Entry

            System.out.println("Key tủ số: " + key + " -> Bên trong chứa: " + sinhVien.toString());
        }
    }
}