package SESSION05.DEMO;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Player player1 = new Player("P001", "Đoàn Mạnh Duy", "Nam", "30/04/2006", "Nam Định", "Sân Mỹ Đình", 200000);
        System.out.println(player1.getAllPlayer());
    }
}
