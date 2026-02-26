package Câu1.Phan1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Lỗi: không nhập nội dung");
            return;
        }
        String[] numbers = input.split("[^\\d]+");
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i].isEmpty()) {
                int num = Integer.parseInt(numbers[i]);
                sum += num;
            }
        }

        System.out.println("Output: " + sum);
    }
}

