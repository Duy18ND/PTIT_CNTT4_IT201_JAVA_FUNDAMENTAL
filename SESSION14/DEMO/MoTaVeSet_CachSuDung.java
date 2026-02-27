package SESSION14.DEMO;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MoTaVeSet_CachSuDung {

    public static void main(String[] args) {

        System.out.println("========== ỨNG DỤNG THỰC TẾ CỦA SET ==========");

        /* * KỊCH BẢN: Xây dựng hệ thống quản lý "Thành tựu" (Achievements) trong Game.
         * Yêu cầu:
         * 1. Mỗi thành tựu chỉ được mở khóa MỘT LẦN duy nhất.
         * 2. Tốc độ kiểm tra xem người chơi đã có thành tựu này chưa phải cực kỳ nhanh.
         */

        // Sử dụng HashSet: Tốc độ thêm và tìm kiếm nhanh nhất (nhưng không giữ thứ tự)
        Set<String> unlockedAchievements = new HashSet<>();

        System.out.println("\n--- 1. Thêm dữ liệu vào Set ---");
        // Hàm add() của Set trả về boolean (true nếu thêm thành công, false nếu đã tồn tại)
        boolean add1 = unlockedAchievements.add("First Blood (Chiến công đầu)");
        boolean add2 = unlockedAchievements.add("Monster Hunter (Săn 100 quái vật)");
        boolean add3 = unlockedAchievements.add("Godlike (Bất tử)");

        System.out.println("Thêm 'First Blood': " + add1); // true

        // Người chơi vô tình kích hoạt lại sự kiện nhận thành tựu "First Blood"
        System.out.println("\n--- 2. Tính năng CHỐNG TRÙNG LẶP ---");
        boolean addDuplicate = unlockedAchievements.add("First Blood (Chiến công đầu)");
        System.out.println("Thêm lại 'First Blood' lần 2: " + addDuplicate); // FALSE! Set tự từ chối

        // In ra để thấy Set không có cái nào bị lặp lại
        System.out.println("Danh sách thành tựu hiện có: " + unlockedAchievements);


        System.out.println("\n--- 3. Các loại Set phổ biến khác trong thực tế ---");

        /* * TreeSet: Tự động sắp xếp (A-Z hoặc Nhỏ -> Lớn)
         * Ứng dụng: Khi cần hiển thị danh sách người chơi tham gia sự kiện theo thứ tự tên A-Z
         */
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zenitsu");
        treeSet.add("Tanjiro");
        treeSet.add("Inosuke");
        System.out.println("TreeSet (Tự xếp A-Z): " + treeSet);
        // Kết quả: [Inosuke, Tanjiro, Zenitsu]

        /* * LinkedHashSet: Giữ nguyên thứ tự bạn đưa dữ liệu vào
         * Ứng dụng: Ghi log (lịch sử) các phòng (Room) mà người chơi vừa đi qua gần đây nhất
         */
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Room A");
        linkedSet.add("Room C");
        linkedSet.add("Room B");
        System.out.println("LinkedHashSet (Giữ thứ tự nhập): " + linkedSet);
        // Kết quả: [Room A, Room C, Room B]
    }
}