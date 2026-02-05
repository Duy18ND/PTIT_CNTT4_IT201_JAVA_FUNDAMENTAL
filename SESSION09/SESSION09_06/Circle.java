package SESSION09.SESSION09_06;

public class Circle extends Shape {
    private double radius;

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Diện tích hình tròn: "+ String.format("%.2f",calculateArea());
    }
}
