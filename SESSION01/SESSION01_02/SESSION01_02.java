package SESSION01.SESSION01_02;

import java.util.Scanner;

public class SESSION01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int m;
        boolean status = false;
        System.out.print("Nhập số ngày chậm trễ: ");
        n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn: ");
        m = sc.nextInt();

        double total = n * m * 5000;
        double tienPhat = total;
        // Tiền phạt nếu trả sách muộn
        if(n > 7 && m > 3){
            tienPhat = total + (total * 0.2);
        }
        //Khóa thẻ nếu nợ quá 50k
        if(total > 50000){
            status = true;
        }
        System.out.printf("Tiền phạt gốc: %.0f VND\n", total);

        System.out.printf("Tiền phạt sau khi điều chỉnh: %.0f VND\n", tienPhat);

        System.out.printf("Yêu cầu khóa thẻ: %b", status);
    }
}
