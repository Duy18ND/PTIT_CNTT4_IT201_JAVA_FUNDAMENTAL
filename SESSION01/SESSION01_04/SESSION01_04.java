package SESSION01.SESSION01_04;

import java.util.Scanner;

public class SESSION01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD): ");
        double USD = sc.nextDouble();

        float rate = 25450;
        double result = USD * rate;

        System.out.println("Giá chính xác: " + result);

        long totalAmount = (long) result;
        System.out.println("Giá làm tròn để thanh toán: " + totalAmount);
    }
}
