package SESSION01.SESSION01_06;

import java.util.Scanner;

public class SESSION01_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập STT sách: ");
        int stt = sc.nextInt();

        int sucChua = 25;

        int keSach = (int) Math.ceil((double) stt / sucChua);

        int viTri = stt % sucChua;
        if (viTri == 0) {
            viTri = sucChua;
        }
        String khuVuc = (keSach <= 10) ? "Khu Cận (Gần cửa)" : "Khu Viễn (cuối cửa)";
        System.out.println("--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Số sách: " + stt);
        System.out.println("Địa chỉ: " + keSach + " - Vị trí: " + viTri);
        System.out.println("Phân khu: " + khuVuc);
    }
}