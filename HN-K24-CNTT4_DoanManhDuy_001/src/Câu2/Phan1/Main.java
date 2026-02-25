package Câu2.Phan1;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            System.out.printf("arr[%d] = ",i);
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n -1;i++){
            int count = 0;
            if(arr[i] != arr[i +1]) System.out.print("Số "+ arr[i] + " xuất hiện: ");
            for(int j=1; j< n;j++){
                if(arr[i] == arr[j]){
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
