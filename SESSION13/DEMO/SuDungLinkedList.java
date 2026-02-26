package SESSION13.DEMO;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class SuDungLinkedList {

    // Đã thêm hàm main chuẩn mực
    public static void main(String[] args) {

        System.out.println("==========================================================");
        System.out.println("      BÍ KÍP TỐI THƯỢNG: LINKED_LIST ALL-IN-ONE           ");
        System.out.println(" Đặc điểm: Thêm/Xóa 2 đầu siêu tốc, nhưng Tìm kiếm thì chậm ");
        System.out.println("==========================================================\n");

        // ⚠️ LƯU Ý: Phải dùng LinkedList ở vế trái để gọi được các hàm Độc quyền
        LinkedList<String> list = new LinkedList<>();

        // =======================================================
        // PHẦN 1: THÊM (ADD) - ĐẦU, CUỐI, VỊ TRÍ BẤT KỲ
        // =======================================================
        System.out.println("--- 1. THAO TÁC THÊM ---");

        // Thêm Cuối (Siêu nhanh O(1) - Có hàm riêng)
        list.addLast("Java");
        list.addLast("Python");

        // Thêm Đầu (Siêu nhanh O(1) - Không cần đẩy phần tử khác lùi lại như ArrayList)
        list.addFirst("C++");

        // Thêm Vị trí bất kỳ (Chậm O(n) - Phải chạy bộ từ đầu đến vị trí index để móc xích)
        list.add(1, "Ruby");

        System.out.println("Sau khi THÊM: " + list);
        // -> [C++, Ruby, Java, Python]


        // =======================================================
        // PHẦN 2: SỬA (EDIT) - ĐẦU, CUỐI, VỊ TRÍ BẤT KỲ
        // =======================================================
        System.out.println("\n--- 2. THAO TÁC SỬA ---");

        // Sửa Đầu (Nhảy vào index 0)
        list.set(0, "C++_Update");

        // Sửa Cuối (Nhảy vào index size() - 1)
        list.set(list.size() - 1, "Python_Update");

        // Sửa Vị trí bất kỳ (Chậm O(n) - Phải lội bộ tìm đúng vị trí mới sửa được)
        list.set(2, "Java_Update");

        System.out.println("Sau khi SỬA:  " + list);
        // -> [C++_Update, Ruby, Java_Update, Python_Update]


        // =======================================================
        // PHẦN 3: XÓA (REMOVE) - ĐẦU, CUỐI, VỊ TRÍ BẤT KỲ
        // =======================================================
        System.out.println("\n--- 3. THAO TÁC XÓA ---");

        // Xóa Đầu (Siêu nhanh O(1) - Có hàm riêng, chặt đứt móc xích đầu tiên)
        list.removeFirst();

        // Xóa Cuối (Siêu nhanh O(1) - Chặt đứt móc xích cuối cùng)
        list.removeLast();

        // Xóa Vị trí bất kỳ (Chậm O(n))
        list.remove(0); // Lúc này xóa chữ "Ruby" đang ở đầu

        // Khôi phục lại data để làm ví dụ Duyệt mảng
        list.clear();
        list.add("A"); list.add("B"); list.add("C"); list.add("D");
        System.out.println("Reset mảng để Duyệt: " + list);
        // -> [A, B, C, D]


        // =======================================================
        // PHẦN 4: 5 CÁCH DUYỆT MẢNG + ƯU/NHƯỢC ĐIỂM
        // =======================================================
        System.out.println("\n--- 4. CÁC CÁCH DUYỆT MẢNG ---");

        // 1️⃣ DÙNG VÒNG LẶP FOR-EACH (CHÂN ÁI CỦA LINKEDLIST)
        // - Ưu điểm: Lướt qua các móc xích rất mượt mà, code sạch đẹp. Dùng để xem data.
        System.out.print("1. For-each:  ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();


        // 2️⃣ DÙNG ITERATOR (BẮT BUỘC NẾU MUỐN XÓA)
        // - Ưu điểm: Là cách an toàn duy nhất để vừa duyệt vừa xóa phần tử mà không bị lỗi.
        System.out.print("2. Iterator:  ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        // 3️⃣ DÙNG LIST_ITERATOR (ĐỈNH CAO DUYỆT NGƯỢC)
        // - Ưu điểm: Đặt con trỏ ở cuối dây chuyền, dò ngược về đầu cực kỳ hiệu quả.
        System.out.print("3. ListIterator (Duyệt ngược): ");
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();


        // 4️⃣ DÙNG LAMBDA (JAVA 8+)
        // - Ưu điểm: 1 dòng code duy nhất, nhìn rất chuyên nghiệp.
        System.out.print("4. Lambda:    ");
        list.forEach(item -> System.out.print(item + " "));
        System.out.println();


        // 5️⃣ DÙNG FOR-INDEX (TỬ HUYỆT 💀 - CẤM CHỈ ĐỊNH)
        // - Nhược điểm CỰC LỚN: Vì LinkedList không đánh số thứ tự liền kề, mỗi lần gọi list.get(i)
        //   là máy tính phải ĐI BỘ LẠI TỪ ĐẦU mảng để đếm. Nếu mảng có 1 triệu phần tử, app của bạn sẽ bị treo!
        System.out.print("5. For-index (Không nên dùng): ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}