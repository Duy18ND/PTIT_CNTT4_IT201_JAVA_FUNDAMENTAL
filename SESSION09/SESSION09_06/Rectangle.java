package SESSION09.SESSION09_06;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        if(width == height) return "Hình vuông: "+ width;
        return "Diện tích hình chữ nhật: "+ calculateArea();
    }
}
