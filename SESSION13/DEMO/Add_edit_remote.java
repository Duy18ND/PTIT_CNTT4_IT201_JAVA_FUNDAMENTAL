package SESSION13.DEMO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Add_edit_remote {

    public static void main(String[] args) {

        System.out.println("=====================================================");
        System.out.println("       PHẦN 1: ARRAYLIST (MẢNG ĐỘNG - TỐC ĐỘ CAO)    ");
        System.out.println(" Ứng dụng: Chuyên dùng khi cần Tìm kiếm, Đọc dữ liệu ");
        System.out.println("=====================================================\n");

        List<String> arrayList = new ArrayList<>();

        // 🟢 1. THÊM (ADD)
        arrayList.add("Java");           // Thêm vào cuối mảng
        arrayList.add("Python");
        arrayList.add(0, "C++");         // Chèn C++ vào vị trí số 0 (Java & Python tự động lùi ra sau)
        System.out.println("1. Sau khi ADD: " + arrayList); // -> [C++, Java, Python]

        // 🟡 2. SỬA (EDIT)
        // Cú pháp: set(vị_trí, giá_trị_mới) -> Tốc độ sửa của ArrayList là O(1) (Nhanh như chớp)
        arrayList.set(1, "C#");          // Nhảy đúng vào vị trí số 1, đá "Java" ra, thay "C#" vào
        System.out.println("2. Sau khi EDIT: " + arrayList); // -> [C++, C#, Python]

        // 🔴 3. XÓA (REMOVE)
        arrayList.remove(0);             // Xóa theo Vị trí (Index): Xóa C++ ở vị trí 0
        arrayList.remove("Python");      // Xóa theo Tên (Object): Xóa chữ Python
        System.out.println("3. Sau khi REMOVE: " + arrayList); // -> [C#]


        System.out.println("\n=====================================================");
        System.out.println("       PHẦN 2: LINKEDLIST (DANH SÁCH LIÊN KẾT)       ");
        System.out.println(" Ứng dụng: Chuyên dùng khi Thêm/Xóa liên tục ở 2 đầu ");
        System.out.println("=====================================================\n");

        LinkedList<String> linkedList = new LinkedList<>();

        // 🟢 1. THÊM (ADD) - Có võ riêng của LinkedList
        linkedList.add("Toa Giữa");      // Dùng chung add() như ArrayList cũng được
        linkedList.addFirst("Đầu Tàu");  // Thêm chớp nhoáng vào vị trí đầu tiên
        linkedList.addLast("Toa Chót");  // Thêm chớp nhoáng vào vị trí cuối cùng
        System.out.println("1. Tàu sau khi ADD: " + linkedList); // -> [Đầu Tàu, Toa Giữa, Toa Chót]

        // 🟡 2. SỬA (EDIT) - Dùng chung hàm set() của List
        // LƯU Ý: LinkedList sửa bằng vị trí (index) sẽ bị chậm hơn ArrayList vì nó phải dò đường từ đầu mảng
        linkedList.set(0, "Đầu Tàu Siêu Tốc"); // Sửa phần tử đầu tiên
        linkedList.set(linkedList.size() - 1, "Toa Hàng Hóa"); // Sửa phần tử cuối cùng
        System.out.println("2. Tàu sau khi EDIT: " + linkedList); // -> [Đầu Tàu Siêu Tốc, Toa Giữa, Toa Hàng Hóa]

        // 🔴 3. XÓA (REMOVE) - Có võ riêng của LinkedList
        linkedList.removeFirst();        // Chặt đứt toa đầu tiên
        linkedList.removeLast();         // Chặt đứt toa cuối cùng
        // linkedList.remove("Toa Giữa"); // Vẫn dùng được cách xóa theo tên như ArrayList
        System.out.println("3. Tàu sau khi REMOVE: " + linkedList); // -> [Toa Giữa]


        System.out.println("\n=====================================================");
        System.out.println("       PHẦN 3: TUYỆT CHIÊU DÙNG CHUNG CHO CẢ 2       ");
        System.out.println("        (THAO TÁC HÀNG LOẠT & TỐI ƯU JAVA 8+)        ");
        System.out.println("=====================================================\n");

        List<String> dbs = new ArrayList<>(Arrays.asList("MySQL", "SQL Server", "MongoDB", "Oracle", "MySQL"));

        // 🟢 1. XÓA SẠCH MẢNG
         arrayList.clear();

        // 🟢 2. XÓA THEO ĐIỀU KIỆN (Java 8+ - removeIf)
        // Cực hay: Xóa tất cả các Database có chứa chữ "SQL"
        dbs.removeIf(db -> db.contains("SQL"));
        System.out.println("- Sau khi removeIf (Xóa chữ chứa SQL): " + dbs); // -> [MongoDB, Oracle]

        // 🟢 3. SỬA HÀNG LOẠT (Java 8+ - replaceAll)
        // Đổi toàn bộ chữ trong mảng thành chữ IN HOA
        dbs.replaceAll(db -> db.toUpperCase());
        System.out.println("- Sau khi replaceAll (In hoa toàn bộ): " + dbs); // -> [MONGODB, ORACLE]

        // 🟢 4. GỘP MẢNG (addAll)
        List<String> newDbs = Arrays.asList("PostgreSQL", "Redis");
        dbs.addAll(newDbs); // Bê toàn bộ mảng newDbs ném vào đuôi mảng dbs
        System.out.println("- Sau khi addAll (Gộp mảng): " + dbs); // -> [MONGODB, ORACLE, PostgreSQL, Redis]
    }
}