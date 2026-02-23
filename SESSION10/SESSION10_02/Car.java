package SESSION10.SESSION10_02;

public class Car extends Vehicle{
    public Car(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println("Tên hãng: "+ brand + "\nCách di chuyển: Di chuyển bằng động cơ");
    }
}
