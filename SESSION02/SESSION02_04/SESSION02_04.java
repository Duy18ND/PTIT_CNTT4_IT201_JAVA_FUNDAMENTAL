package SESSION02.SESSION02_04;
import java.util.Scanner;
public class SESSION02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ID;
        do {
            System.out.print("Mời bạn nhập ID: ");
            ID = sc.nextInt();
            if(ID <= 0){
                System.out.println("Mã không hợp lệ hãy nhập lại!");
            }else{
                System.out.println("Lưu mã danh sách thành công!");
                System.out.printf("Xác nhận: %d đã được ghi nhận",ID);
            }
        }while(ID <= 0);
    }
}
