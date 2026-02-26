package Câu2.Phan1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean fount= false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    fount = true;
                    break;
                }
            }

            if (fount == true) {
                continue;
            }

            int count = 0;

            for (int k = i; k < n; k++) {
                if (arr[i] == arr[k]) {
                    count++;
                }
            }

            System.out.println("Số " + arr[i] + " xuất hiện: " + count + " lần");
        }
    }
}
