package SESSION07.SESSION07_06;

public class Main {

    public static void printLoginResult(String user, String pass) {
        boolean isSuccess = UserManager.checkLogin(user, pass);
        System.out.println("- Login (\"" + user + "\", \"" + pass + "\"): "
                + (isSuccess ? "Thành công!" : "Thất bại!"));
    }

    public static void main(String[] args) {
        //Tạo 3 user
        User u1 = new User(1, "dev_a", "123456");
        User u2 = new User(2, "dev_b", "java_is_fun");
        User u3 = new User(3, "dev_c", "duy_pro_2026");

        //Thêm vào hệ thống
        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        for (User u : UserManager.users) {
            System.out.println(u);
        }
        System.out.println("\n>> Kiểm tra đăng nhập:");

        printLoginResult("dev_a", "123456");
        printLoginResult("dev_a", "1234567");
    }
}
