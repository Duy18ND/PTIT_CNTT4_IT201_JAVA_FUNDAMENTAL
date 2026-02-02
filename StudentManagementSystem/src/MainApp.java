package StudentManagementSystem.src;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.print("Mời bạn chọn chức năng (1-9): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại. Vui lòng chọn lại!");
            }
        } while (choice != 9);
    }

    private static void printMenu() {
        System.out.println("\n================ QUẢN LÝ SINH VIÊN ================");
        System.out.println("| 1. Thêm sinh viên mới                           |");
        System.out.println("| 2. Hiển thị tất cả sinh viên                    |");
        System.out.println("| 3. Tìm kiếm sinh viên                           |");
        System.out.println("| 4. Cập nhật thông tin sinh viên                 |");
        System.out.println("| 5. Xóa sinh viên                                |");
        System.out.println("| 6. Tính điểm trung bình và xếp loại (Tự động)   |");
        System.out.println("| 7. Sắp xếp sinh viên                            |");
        System.out.println("| 8. Thống kê                                     |");
        System.out.println("| 9. Thoát                                        |");
        System.out.println("===================================================");
    }
}