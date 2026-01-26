package SESSION02.SESSION02_06;

import java.util.Scanner;

public class SESSION02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxLuotMuon = 0;
        int minLuotMuon = 0;

        long total = 0;
        int soNgayMoCua = 0;

        boolean laSoDauTien = true;

        for (int i = 2; i <= 8; i++){
            String tenThu = (i == 8 ? "Chủ nhật" : "Thứ " + i);
            System.out.printf("Nhập lượt mượn %s là: ", tenThu);
            int soLuot = sc.nextInt();

            if(soLuot == 0){
                continue;
            }

            total += soLuot;
            soNgayMoCua++;

            if (laSoDauTien == true) {
                maxLuotMuon = soLuot;
                minLuotMuon = soLuot;
                laSoDauTien = false;
            } else {
                if(soLuot > maxLuotMuon) {
                    maxLuotMuon = soLuot;
                }
                if(soLuot < minLuotMuon){
                    minLuotMuon = soLuot;
                }
            }
        }

        System.out.println("\n----------KẾT QUẢ THỐNG KÊ-----------");
        if (laSoDauTien == false) {
            System.out.println("Lượt mượn cao nhất: " + maxLuotMuon);
            System.out.println("Lượt mượn thấp nhất: "+ minLuotMuon);

            double trungBinh = (double) total / soNgayMoCua;
            System.out.printf("Trung bình lượt mượn/ngày: %.2f", trungBinh);
        } else {
            System.out.println("Tuần này thư viện đóng cửa, không có dữ liệu!");
        }
    }
}