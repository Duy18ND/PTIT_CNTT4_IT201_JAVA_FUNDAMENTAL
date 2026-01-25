package SESSION01.SESSION01_01;

import java.util.Scanner;

public class SESSION01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookID;
        String bookName;
        int publishYear;
        double price;
        boolean isAvailable;

        System.out.print("Nhập mã sách: ");
        bookID = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        bookName = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        publishYear = sc.nextInt();

        System.out.print("Nhập giá bìa: ");
            price = sc.nextDouble();

        System.out.print("Sách còn trong kho (True/ False): ");
            isAvailable = sc.nextBoolean();

        System.out.println("---- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookName);
        System.out.println("Mã số: "+ bookID + " | Tuổi thọ: " + (2026 - publishYear));
        System.out.println("Giá bán: "+ price);
        System.out.println("Tình trạng: "+ (isAvailable ? "Còn sách" : "Hết hàng!") );
    }
}