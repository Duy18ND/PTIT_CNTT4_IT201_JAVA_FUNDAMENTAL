package SESSION05.SESSION05_06;

public class SESSION06_06 {
    static class User {
        private int id;
        private String username;
        private String password;
        private String email;

        public User(int id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            setPassword(password);
            setEmail(email);
        }

        public void setEmail(String email) {
            if (email != null && email.contains("@") && email.contains(".")) {
                this.email = email;
            } else {
                this.email = "default@gmail.com";
                System.out.println("LỖI: Email '" + email + "' không hợp lệ (Phải có @ và dấu chấm)!");
            }
        }

        public void setPassword(String password) {
            if (password != null && !password.trim().isEmpty()) {
                this.password = password;
            } else {
                this.password = "123456";
                System.out.println("LỖI: Password không được để trống!");
            }
        }

        public String getAllUser() {
            String hiddenPass = (password != null) ? "*".repeat(password.length()) : "";

            return "\n--- THÔNG TIN USER ---" +
                    "\nID      : " + id +
                    "\nName    : " + username +
                    "\nPassword: " + hiddenPass + " (Đã ẩn)" +
                    "\nEmail   : " + email;
        }
    }

    public static void main(String[] args) {
        User u1 = new User(1, "duy18nd", "DuyDepTrai", "duy@gmail.com");
        System.out.println(u1.getAllUser());

        User u2 = new User(2, "an_nguyen", "", "duy123@s12");
        System.out.println(u2.getAllUser());
    }
}