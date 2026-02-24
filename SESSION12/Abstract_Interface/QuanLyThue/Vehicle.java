package SESSION12.Abstract_Interface.QuanLyThue;

public abstract class Vehicle {
    protected String brand;
    protected double price;

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double calculateTax();

}
