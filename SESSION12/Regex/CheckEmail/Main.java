package SESSION12.Regex.CheckEmail;

public class Main {
    static void main() {
        User u1 = new User("duy18nd@gmail.com");
        User u2 = new User("duy18nd@sakurastudio.com");

        //regex check
        if(u2.getEmail().matches("^[\\w-\\.]+@sakurastudio\\.+(com|ip)$")){
            System.out.println("Email nội bộ!");
        }else{
            System.out.println("Không phải Email nội bộ!");
        }
    }
}
