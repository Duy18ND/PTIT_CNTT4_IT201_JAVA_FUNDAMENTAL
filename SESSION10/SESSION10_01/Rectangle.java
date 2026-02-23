package SESSION10.SESSION10_01;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private static final double PI = 3.14;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
