package SESSION02.SESSION02_02;
import java.util.Scanner;
public class SESSION02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã khu vực (A, B, C, D): ");
        String choice = sc.nextLine();
        choice = choice.toUpperCase();
        switch (choice){
            case "A":
                System.out.println("A: Tầng 1 Sách Văn Học");
                break;
            case "B":
                System.out.println("B: Tầng 2 Sách Khoa Học");
                break;
            case "C":
                System.out.println("C: Tầng 3 Sách Ngoại Ngữ");
                break;
            case "D":
                System.out.println("D: Tầng 4 Sách Tin Học");
                break;
            default:
                System.out.println("Mã khu vực không hợp lệ!");
        }
    }
}
