package SESSION13.SESSION13_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>(Arrays.asList(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));

        System.out.println("Danh sách ban đầu: " + temperatures);

        Iterator<Double> iterator = temperatures.iterator();
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }
        }

        System.out.println("Danh sách sau khi lọc: " + temperatures);

        if (!temperatures.isEmpty()) {
            double sum = 0;
            for (Double temp : temperatures) {
                sum += temp;
            }
            double average = sum / temperatures.size();

            System.out.printf("Nhiệt độ trung bình: %.2f\n", average);
        } else {
            System.out.println("Không có dữ liệu nhiệt độ hợp lệ.");
        }
    }
}