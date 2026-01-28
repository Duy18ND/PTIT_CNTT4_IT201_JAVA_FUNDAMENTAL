package SESSION04.SESSION04_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SESSION04_05{

    public static void main(String[] args) {
        String logEntry = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";
        String regex = "^(\\d{4}-\\d{2}-\\d{2}) \\| User: (.*?) \\| Action: (\\w+) \\| BookID: (\\w+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(logEntry);

        if (matcher.find()) {
            System.out.println("Ngày: " + matcher.group(1));

            System.out.println("Người dùng: " + matcher.group(2).trim());

            System.out.println("Hành động: " + matcher.group(3));

            System.out.println("Mã sách: " + matcher.group(4));
        } else {
            System.out.println("Dữ liệu không đúng định dạng!");
        }
    }
}