package SESSION10.SESSION10_01;

public class Circle implements Shape {
    private double radius;
    private static final double PI = 3.14;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
