package Minproject.SESSION05;

import java.util.Scanner;

public class minprojectSS05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String[] cardID = new String[100];
        int count = 0;

        do {
            System.out.println("--------MENU---------");
            System.out.println("1. Hiển thị MSSV");
            System.out.println("2. Thêm MSSV");
            System.out.println("3. Cập nhật MSSV theo index");
            System.out.println("4. Xóa: Nhập một MSSV cụ thể. Nếu tìm thấy, thực hiện xóa và dồn mảng để đảm bảo tính liên tục");
            System.out.println("5. Tìm kiếm (Regex): Nhập một chuỗi ký tự bất kỳ từ bàn phím");
            System.out.println("6. Thoát");
            System.out.print("Mời bạn lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count == 0) {
                        System.out.println("Danh sách trống!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ": " + cardID[i]);
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.print("Nhập MSSV (B + 7 chữ số): ");
                        String id = sc.nextLine();
                        if (!id.matches("B\\d{7}")) {
                            System.out.println("Sai định dạng. MSSV phải bắt đầu bằng chữ B, theo sau là đúng 7 chữ số (Ví dụ: B2101234)");
                        } else {
                            cardID[count] = id;
                            count++;
                            System.out.println("Thêm thành công!");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhập index cần sửa: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index < 0 || index >= count) {
                        System.out.println("Index không hợp lệ!");
                        break;
                    }

                    while (true) {
                        System.out.print("Nhập MSSV mới: ");
                        String newID = sc.nextLine();

                        if (!newID.matches("B\\d{7}")) {
                            System.out.println("Sai định dạng. MSSV phải bắt đầu bằng chữ B, theo sau là đúng 7 chữ số (Ví dụ: B2101234)");
                        } else {
                            cardID[index] = newID;
                            System.out.println("Cập nhật thành công!");
                            break;
                        }
                    }
                    break;
                case 4:
                    int checkCase4 = -1;
                    while (checkCase4 == -1) {
                        System.out.print("Mời bạn nhập MSSV cần xóa: ");
                        String deleteID = sc.nextLine();
                        int pos = -1;

                        for (int i = 0; i < count; i++) {
                            if (cardID[i].equals(deleteID)) {
                                pos = i;
                                break;
                            }
                        }
                        // Không tìm thấy
                        if (pos == -1) {
                            System.out.println("Không tìm thấy MSSV!");
                        } else {
                            checkCase4 = 2;
                            // Dồn mảng
                            for (int i = pos; i < count - 1; i++) {
                                cardID[i] = cardID[i + 1];
                            }
                            cardID[count - 1] = null;

                            System.out.println("Xóa MSSV thành công!");
                        }
                    }
                    break;

                case 5:
//                    int checkCase5 = -1;
//                    while(checkCase5 == -1){
//                        System.out.print("Tìm kiếm mã sinh viên:");
//                        String search = sc.nextLine();
//
//                        for(int i=0; i< count; i++){
//
//                        }
//                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }
}
