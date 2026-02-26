package Câu2.Phan2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        int fount = -1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    fount = arr[i];
                    break;
                }
            }
            if (fount != -1) break;
        }

        if (fount != -1) {
            System.out.println(fount);
        } else {
            System.out.println("Mảng không có số lặp lại!");
        }
    }
}
