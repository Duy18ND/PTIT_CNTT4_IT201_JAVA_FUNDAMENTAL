package SESSION10.SESSION10_01;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,6);
        Circle c1 = new Circle(4);

        System.out.println("Diện tích hình tròn: " + c1.getArea());
        System.out.println("Chu vi hình tròn: " + c1.getPerimeter());

        System.out.println("Diện t  ích hình chữ nhật: " + r1.getArea());
        System.out.println("Chu vi hình tròn: " + r1.getPerimeter());

    }
}
