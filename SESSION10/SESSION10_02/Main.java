package SESSION10.SESSION10_02;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car("VinFast");
        Vehicle v2 = new Bicycle("Martin");

        v1.move();
        v2.move();
    }
}