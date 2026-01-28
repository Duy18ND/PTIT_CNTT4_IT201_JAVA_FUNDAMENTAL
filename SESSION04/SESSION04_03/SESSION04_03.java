package SESSION04.SESSION04_03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SESSION04_03 {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        StringBuilder report = new StringBuilder();
        report.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String today = sdf.format(new Date());
        report.append("Ngày tạo: ").append(today).append("\n");

        for (String trans : transactions) {
            report.append("Giao dịch: ").append(trans).append("\n");
        }

        System.out.println(report.toString());

        int soLanLap = 10000;


        long startSB = System.currentTimeMillis();

        StringBuilder sbTest = new StringBuilder();
        for (int i = 0; i < soLanLap; i++) {
            sbTest.append("Test");
        }

        long endSB = System.currentTimeMillis();

        long startS = System.currentTimeMillis();

        String strTest = "";
        for (int i = 0; i < soLanLap; i++) {
            strTest += "Test";
        }

        long endS = System.currentTimeMillis();

        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: " + (endS - startS));
    }
}