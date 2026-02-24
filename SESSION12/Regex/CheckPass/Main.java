package SESSION12.Regex.CheckPass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();

        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        System.out.println("=== HỆ THỐNG ĐĂNG KÝ THÀNH VIÊN ===");
        while (true) {
            System.out.print("\nNhập Username: ");
            String username = sc.nextLine();

            String password = "";

            while (true) {
                System.out.print("Nhập Password (Tối thiểu 8 ký tự, có 1 chữ hoa, 1 số): ");
                password = sc.nextLine();

                if (password.matches(passwordRegex)) {
                    System.out.println("✔️ Mật khẩu hợp lệ!");
                    break;
                } else {
                    System.out.println("❌ Lỗi: Mật khẩu quá yếu hoặc sai định dạng. Vui lòng nhập lại!");
                }
            }

            userList.add(new User(username, password));
            System.out.println("🎉 Đã tạo tài khoản thành công cho: " + username);

            // Hỏi người dùng có muốn đăng ký tiếp không
            System.out.print("=> Bạn có muốn đăng ký thêm tài khoản không? (Gõ '0' để Thoát, phím bất kỳ để Tiếp tục): ");
            String choice = sc.nextLine();
            if (choice.equals("0")) {
                break;
            }
        }

        // In danh sách ra để kiểm tra
        System.out.println("\n=== DANH SÁCH THÀNH VIÊN ĐÃ ĐĂNG KÝ ===");
        for (User u : userList) {
            System.out.println(u.toString());
        }
        System.out.println("Tổng số thành viên: " + userList.size());
    }
}
