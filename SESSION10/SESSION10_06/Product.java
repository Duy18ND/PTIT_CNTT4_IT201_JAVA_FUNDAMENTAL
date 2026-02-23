package SESSION10.SESSION10_06;

public class Product {
    public String name;
    public int price; // Dùng số nguyên cho dễ hiểu

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - Giá: " + price;
    }
}