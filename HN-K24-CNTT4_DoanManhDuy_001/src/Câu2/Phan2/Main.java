package Câu2.Phan2;

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
        int count = arr[0];
        int check = -1;
        for (int i=0;i<n -1;i++){
                if(arr[i] == arr[i+1]){
                    count = arr[i];
                    check = i;
            }
        }
        if(check != -1){
            System.out.println(count);
        }else{
            System.out.println("Mảng không có số lặp lại!");
        }
    }
}
