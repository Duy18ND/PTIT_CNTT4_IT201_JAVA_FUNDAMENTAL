package SESSION05.SESSION05_02;

public class SESSION05_02 {
    static class Account {
        String username;
        String password;
        String email;

        public Account(String username, String password, String email){
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public String getAllAccount(){
            String newPassword = "***************".substring(0, password.length());
            return "Name: "+ username + "\nemail: " + email + "\npassword: "+ newPassword;
        }
        public void changePassword(String newPass){
            this.password = newPass;
        }

    }
    public static void main(String[] args) {
        Account s1 = new Account("duy18nd", "duy12345", "duy18nd@gmail.com");
        System.out.println("Ban đầu: "+ s1.getAllAccount());

        //Đổi mk
        s1.changePassword("Duy18nd");
        System.out.println("Ban đầu: "+ s1.getAllAccount());
    }
}
