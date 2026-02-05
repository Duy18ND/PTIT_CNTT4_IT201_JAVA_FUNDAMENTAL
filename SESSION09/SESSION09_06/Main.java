package SESSION09.SESSION09_06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));

        shapes.add(new Rectangle(3,4));
        shapes.add(new Rectangle(6));

        System.out.println("In kết quả: ");
        double totalArea = 0;
        int index = 1;
        for(Shape s : shapes){
            double area = s.calculateArea();
            System.out.printf("%d. %-30s - Diện tích: %.2f\n", index, s.toString(), area);

            totalArea += area;
            index++;
        }
        System.out.println("---------------------------------------------");
        System.out.printf("Tổng diện tích các hình: %.2f\n", totalArea);
    }
}
