package StudentManagementSystem.src;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("SV001", "Nguyen Van A", 20, true, 8.5, 7.0, 9.0)); // Giỏi
        manager.addStudent(new Student("SV002", "Tran Thi B", 19, false, 5.0, 6.0, 5.5));  // Trung bình
        manager.addStudent(new Student("SV003", "Le Van C", 21, true, 7.0, 8.0, 7.5));    // Khá
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
                    System.out.println("--- CẬP NHẬT THÔNG TIN ---");
                    //Nhập ID cần sửa
                    System.out.print("Nhập ID sinh viên cần sửa: ");
                    String idUpdate = sc.nextLine();
                    Student existingStudent = manager.findById(idUpdate);
                    if (existingStudent == null) {
                        System.out.println("Không tìm thấy ID!!");
                    } else {
                        //Nhập thông tin mới
                        System.out.print("Nhập Tên mới: ");
                        String newName = sc.nextLine();

                        System.out.print("Nhập Tuổi mới: ");
                        int newAge = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nhập Giới tính (true: Nam, false: Nữ): ");
                        boolean newSex = sc.nextBoolean();

                        //Nhập điểm toán lý hóa
                        double newMath = inputScore(sc, "Toán");
                        double newPhys = inputScore(sc, "Lý");
                        double newChem = inputScore(sc, "Hóa");
                        sc.nextLine();

                        Student newInfo = new Student(idUpdate, newName, newAge, newSex, newMath, newPhys, newChem);

                        boolean check = manager.updateStudent(idUpdate, newInfo);

                        if (check) {
                            System.out.println("Cập nhật thành công!");
                        } else {
                            System.out.println("Thất bại: Không tìm thấy mã SV này.");
                        }
                    }

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

    private static double inputScore(Scanner sc, String subjectName) {
        double score;
        while (true) {
            System.out.print("Nhập điểm " + subjectName + " (0-10): ");
            score = sc.nextDouble();
            if (score >= 0 && score <= 10) {
                break;
            }
            System.out.println("Lỗi nhập điểm, điểm số môn từ 0-10!!");
        }
        return score;
    }
}