package SESSION12.Abstract_Interface.QuanLyThue;

public class Car extends Vehicle{
    public Car(String brand, double price) {
        super(brand, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.10;
    }

}
