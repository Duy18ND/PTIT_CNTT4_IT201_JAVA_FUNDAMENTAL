package SESSION02.SESSION02_03;

import java.util.Scanner;

public class SESSION02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách trả muộn: ");
        int book = sc.nextInt();
        float totalAmount = 0;
        for(int i=0; i < book; i ++){
            System.out.printf("Nhập số ngày trễ của cuốn sách thứ %d là: ", (i + 1));
            int bookDate = sc.nextInt();
            totalAmount += (5000 * bookDate);
        }
        System.out.println("Tổng số tiền phạt: " + totalAmount);
    }
}
