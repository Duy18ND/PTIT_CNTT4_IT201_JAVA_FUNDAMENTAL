package SESSION14.DEMO.SapXepDanhSach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    // 1. Sửa lỗi: Thêm String[] args
    public static void main(String[] args) throws ParseException {
        List<Product> products = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        products.add(new Product(1, "Tivi", sdf.parse("21/02/2025"), 2500000.0));
        products.add(new Product(2, "Tủ Lạnh", sdf.parse("15/01/2025"), 400000.0));
        products.add(new Product(3, "Máy Giặt", sdf.parse("10/03/2025"), 150000.0));

        System.out.println("--- SẮP XẾP TĂNG DẦN THEO TÊN ---");
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                // Muốn tăng thì dùng o1 so sánh o2
                return o1.getName().compareTo(o2.getName());
            }
        };
        products.sort(comparator);
        for(Product p: products){
            System.out.println(p);
        }

        System.out.println("\n--- SẮP XẾP GIẢM DẦN THEO GIÁ ---");
        Comparator<Product> comparator1 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                // 2. Sửa lỗi: o2 so sánh với o1 để giảm dần
                return o2.getPrice().compareTo(o1.getPrice());
            }
        };

        products.sort(comparator1);
        for(Product p: products){
            System.out.println(p);
        }
    }
}