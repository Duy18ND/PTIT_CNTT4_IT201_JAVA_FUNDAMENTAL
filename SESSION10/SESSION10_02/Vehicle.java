package SESSION10.SESSION10_02;

public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void move();
}