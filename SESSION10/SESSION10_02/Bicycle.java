package SESSION10.SESSION10_02;

public class Bicycle extends Vehicle{
    public Bicycle(String brand) {
        super(brand);
    }
    @Override
    void move() {
        System.out.println("Tên hãng: "+ brand + "\nCách di chuyển: Di chuyển bằng sức người");
    }
}
