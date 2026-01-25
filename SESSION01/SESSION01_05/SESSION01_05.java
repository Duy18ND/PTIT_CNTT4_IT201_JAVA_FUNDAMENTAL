package SESSION01.SESSION01_05;

import java.util.Scanner;

public class SESSION01_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int number = sc.nextInt();
        //Tách hàng nghìn
        int thousands = number / 1000;
        //Tách hàng trăm
        int hundreds = (number / 100) % 10;
        //Tách hàng chục
        int dozens = (number / 10) % 10;
        //Tách hàng đơn vị
        int units = number % 10;

        //Tính sumOfFirstThreeNumber
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        // Số dư của sumOfFirstThreeNumber % 10
        int result = sumOfFirstThreeNumber % 10;

        boolean isStatus = result == units;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + units);

        System.out.println("Kết quả kiểm tra mã sách: " + (isStatus ? "Hợp lệ" : "Sai!"));
    }
}
