package Minproject.SESSION08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student manager = new Student();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            Menu();
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("---THÊM SINH VIÊN----");
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập Name: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập Score: ");
                    double score = sc.nextDouble();
                    sc.nextLine();

                    Student newStudent = new Student(id, name, score);

                    if(manager.addStudent(newStudent)){
                        System.out.println("Thêm thành công!");
                    } else {
                        System.out.println("Thêm thất bại!");
                    }
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Nhập học lực (Giỏi/Khá/Trung bình): ");
                    String rank = sc.nextLine();
                    manager.searchByRank(rank);
                    break;
                case 4:
                    System.out.println("\n--- 4. KẾT QUẢ SẮP XẾP THEO HỌC LỰC GIẢM DẦN ---");
                    manager.sortByRankDesc();
                    manager.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ!");
            }
        } while (choice != 5);
    }

    private static void Menu() {
        System.out.println("\n===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo Học lực");
        System.out.println("4. Sắp xếp theo học lực giảm dần");
        System.out.println("5. Thoát");
        System.out.println("==================================");
    }
}