package SESSION14.SESSION14_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> list = new HashMap<>();

        list.put(1, "T01-Paracetamol");
        list.put(2,"T02-Ibuprofen");
        list.put(3,"T03-Thuoc do");
        list.put(4,"T04-Thuoc tim");
        list.put(5,"T05-Thuoc dau dau");

        System.out.print("Nhập tên thuốc: ");
        String search = sc.nextLine();
        boolean check = false;

        for (Map.Entry<Integer, String> entry : list.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            String[] parts = value.split("-");
            String id  = parts[0];
            String name = parts[1];

            if(search.equalsIgnoreCase(String.valueOf(key)) || search.equalsIgnoreCase(id)){
                System.out.println("Tên thuốc: "+ name);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Thuốc không có trong danh mục BHYT.");
        }
        sc.close();
    }
}
