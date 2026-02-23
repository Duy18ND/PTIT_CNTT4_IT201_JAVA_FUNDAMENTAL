package SESSION10.SESSION10_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Laptop", 20000));
        list.add(new Product("Chuột", 500));
        list.add(new Product("Bàn phím", 1000));

        //Cách 1:
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                // Lấy giá đứa trước trừ giá đứa sau.
                // Nếu ra số âm -> p1 rẻ hơn -> Đứng trước.
                return p1.price - p2.price;
            }
        });

        // Cách 2:
        // Dịch nghĩa: Đưa cho tôi 2 sản phẩm (p1, p2),
        // mũi tên (->) chỉ ra hành động tôi muốn làm là: lấy tên chúng nó so sánh với nhau.
        System.out.println("--- Sắp xếp theo Giá (Anonymous Class) ---");
        for (Product p : list) { System.out.println(p); }
        Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("\n--- Sắp xếp theo Tên (Lambda Expression) ---");
        for (Product p : list) { System.out.println(p); }
    }
}