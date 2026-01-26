package SESSION02.SESSION02_01;
import java.util.Scanner;
public class SESSION02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Nhập tuổi (số nguyên) và số sách đang giữ (số nguyên)
        System.out.print("Nhập số tuổi: ");
        int age = sc.nextInt();
        System.out.print("Nhập số sách mượn: ");
        int book = sc.nextInt();

        if(age >= 18  && (book <=3 || book > 0)){
            System.out.println("KẾT QUẢ: Bạn đủ điều kiện mượn sách quý hiếm");
        } else if (age < 18) {
            System.out.println("KẾT QUẢ: Không đủ điều kiện");
            System.out.println("Lý do: Bạn phải đủ 18 tuổi trở lên!");
        } else if (book > 3) {
            System.out.println("KẾT QUẢ: Bạn không đủ điều kiện");
            System.out.println("Lý do: Bạn đã mượn quá số lượng cho phép!");
        }
    }
}
