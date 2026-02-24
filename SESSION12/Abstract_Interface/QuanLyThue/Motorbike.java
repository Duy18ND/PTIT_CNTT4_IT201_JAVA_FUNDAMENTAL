package SESSION12.Abstract_Interface.QuanLyThue;

public class Motorbike extends Vehicle {
    public Motorbike(String brand, double price) {
        super(brand, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.05;
    }
}
