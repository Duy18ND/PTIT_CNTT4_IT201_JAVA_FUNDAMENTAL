package SESSION16.ThucHanh;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProductRepository product = new ProductRepository();

        product.add(new ElectronicProduct("E001", "Laptop Gaming", 20000000, 24));
        product.add(new ElectronicProduct("E002", "Iphone 4s", 400000, 24));
        product.add(new FoodProduct("F001", "Cơm rang", 35000, 25));
        product.add(new FoodProduct("F002", "Phở bò", 35000, 10));

        System.out.println("DANH SÁCH BAN ĐẦU");
        List<Product> list = product.findAll();
        for (Product p : list) {
            p.displayInfo();
            System.out.printf(" => Thành tiền: %,.0f VND\n", p.calculateFinalPrice());
        }

        System.out.println("\nTÌM KIẾM THEO ID");
        Product pFound = product.findById("E001");
        if (pFound != null) {
            pFound.displayInfo();
        } else {
            System.out.println("Không tìm thấy!");
        }

        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.calculateFinalPrice(), o2.calculateFinalPrice());
            }
        };

        list.sort(productComparator);
        System.out.println("\nSẮP XẾP TĂNG DẦN THEO GIÁ");
        for (Product p : list) {
            p.displayInfo();
            System.out.printf(" => Thành tiền: %,.0f VND\n", p.calculateFinalPrice());
        }


        System.out.println("\nTHỐNG KÊ SỐ LƯỢNG SẢN PHẨM");

        Map<String, Integer> stats = new HashMap<>();
        stats.put("Electronic", 0);
        stats.put("Food", 0);

        for (Product p : list) {
            if (p instanceof ElectronicProduct) {
                stats.put("Electronic", stats.get("Electronic") + 1);
            } else if (p instanceof FoodProduct) {
                stats.put("Food", stats.get("Food") + 1);
            }
        }

        for (String key : stats.keySet()) {
            System.out.println(key + ": " + stats.get(key));
        }
    }
}