package SESSION02.SESSION02_05;

import java.util.Scanner;

public class SESSION02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentScore = 100;
        int bookDate;

        System.out.println("---- HỆ THỐNG ĐÁNH GIÁ ĐỘC GIẢ ----");
        System.out.println("(Nhập số ngày trễ. Nhập <= 0 là đúng hạn. Nhập 999 để thoát!)");

        while(true){
            System.out.print("Nhập số ngày (trễ/sớm): ");
            bookDate = sc.nextInt();

            if(bookDate == 999){
                System.out.println("-> Đã dừng nhập liệu.");
                break;
            }

            if (bookDate <= 0) {
                currentScore += 5;
                System.out.println("   -> Trả đúng hạn: +5 điểm uy tín");
            } else {
                int phat = bookDate * 2;
                currentScore -= phat;
                System.out.printf("   -> Trả trễ %d ngày: -%d điểm uy tín \n", bookDate, phat);
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("TỔNG ĐIỂM UY TÍN CUỐI CÙNG: %d\n", currentScore);

        if(currentScore > 120) {
            System.out.println("Xếp loại: ĐỘC GIẢ THÂN THIẾT");
        } else if (currentScore >= 80) {
            System.out.println("Xếp loại: ĐỘC GIẢ TIÊU CHUẨN");
        } else {
            System.out.println("Xếp loại: ĐỘC GIẢ CẦN LƯU Ý");
        }
    }
}