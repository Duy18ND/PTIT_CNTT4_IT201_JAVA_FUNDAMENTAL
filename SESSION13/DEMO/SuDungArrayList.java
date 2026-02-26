package SESSION13.DEMO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SuDungArrayList {

    public static void main(String[] args) {

        System.out.println("==========================================================");
        System.out.println("        BÍ KÍP TỐI THƯỢNG: ARRAYLIST ALL-IN-ONE           ");
        System.out.println("==========================================================\n");

        List<String> list = new ArrayList<>();

        // =======================================================
        // PHẦN 1: THÊM (ADD) - ĐẦU, CUỐI, VỊ TRÍ BẤT KỲ
        // =======================================================
        System.out.println("--- 1. THAO TÁC THÊM ---");

        // Thêm Cuối (Nhanh nhất O(1))
        list.add("Java");
        list.add("Python");

        // Thêm Đầu (Chậm O(n) - Phải đẩy các số khác lùi ra sau)
        list.add(0, "C++");

        // Thêm Vị trí bất kỳ (Ví dụ: index 1)
        list.add(1, "Ruby");

        System.out.println("Sau khi THÊM: " + list);
        // -> [C++, Ruby, Java, Python]


        // =======================================================
        // PHẦN 2: SỬA (EDIT) - ĐẦU, CUỐI, VỊ TRÍ BẤT KỲ
        // Tốc độ: Cực nhanh O(1) ở mọi vị trí
        // =======================================================
        System.out.println("\n--- 2. THAO TÁC SỬA ---");

        // Sửa Đầu (Index 0)
        list.set(0, "C++_Update");

        // Sửa Cuối (Index là size() - 1)
        list.set(list.size() - 1, "Python_Update");

        // Sửa Vị trí bất kỳ (Ví dụ: index 2)
        list.set(2, "Java_Update");

        System.out.println("Sau khi SỬA:  " + list);
        // -> [C++_Update, Ruby, Java_Update, Python_Update]


        // =======================================================
        // PHẦN 3: XÓA (REMOVE) - ĐẦU, CUỐI, VỊ TRÍ BẤT KỲ
        // =======================================================
        System.out.println("\n--- 3. THAO TÁC XÓA ---");

        // Xóa Đầu (Chậm O(n) - Các số sau phải dồn lên)
        list.remove(0);

        // Xóa Cuối (Nhanh O(1))
        list.remove(list.size() - 1);

        // Xóa Vị trí bất kỳ (Ví dụ: index 1)
        list.remove(1);

        // Khôi phục lại data để làm ví dụ Duyệt mảng
        list.clear();
        list.add("A"); list.add("B"); list.add("C"); list.add("D");
        System.out.println("Reset mảng để Duyệt: " + list);
        // -> [A, B, C, D]


        // =======================================================
        // PHẦN 4: 5 CÁCH DUYỆT MẢNG + ƯU/NHƯỢC ĐIỂM
        // =======================================================
        System.out.println("\n--- 4. CÁC CÁCH DUYỆT MẢNG ---");

        // 1️⃣ DÙNG VÒNG LẶP FOR-INDEX TRUYỀN THỐNG
        // - Ưu điểm: Biết chính xác vị trí index, có thể duyệt ngược (i--), dễ can thiệp vị trí chẵn/lẻ.
        // - Nhược điểm: Code dài dòng.
        System.out.print("1. For-index: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        // 2️⃣ DÙNG VÒNG LẶP FOR-EACH
        // - Ưu điểm: Code cực kỳ ngắn gọn, dễ đọc, sạch sẽ.
        // - Nhược điểm: KHÔNG biết được index hiện tại, KHÔNG được dùng để xóa phần tử (Lỗi sập chương trình).
        System.out.print("2. For-each:  ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();


        // 3️⃣ DÙNG ITERATOR (CỔ ĐIỂN - SỐNG CÒN)
        // - Ưu điểm tuyệt đối: Là cách DUY NHẤT an toàn 100% nếu muốn XÓA phần tử ngay trong lúc đang chạy vòng lặp.
        // - Nhược điểm: Code lằng nhằng, khó nhìn.
        System.out.print("3. Iterator:  ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            // An toàn gọi: iterator.remove();
        }
        System.out.println();


        // 4️⃣ DÙNG LIST_ITERATOR (ĐẶC SẢN CỦA LIST)
        // - Ưu điểm: Là phiên bản nâng cấp, cho phép duyệt NGƯỢC từ cuối lên đầu cực mượt (dùng hasPrevious).
        // - Nhược điểm: Khởi tạo dài dòng.
        System.out.print("4. ListIterator (Duyệt ngược): ");
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();


        // 5️⃣ DÙNG LAMBDA (JAVA 8+)
        // - Ưu điểm: Đỉnh cao của sự ngắn gọn (Chỉ 1 dòng code), phong cách lập trình hiện đại.
        // - Nhược điểm: Không dùng được lệnh 'break' hay 'continue' để thoát vòng lặp giữa chừng.
        System.out.print("5. Lambda:    ");
        list.forEach(item -> System.out.print(item + " "));
        System.out.println();
    }
}