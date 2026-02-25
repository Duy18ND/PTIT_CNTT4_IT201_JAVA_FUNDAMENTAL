package Câu3;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.print("Nhập m: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        for(int i=0; i< n;i++){
            System.out.printf("a[%d]",i);
            a[i] = sc.nextInt();
        }

        System.out.println("=====================");
        for (int j=0; j< m;j++){
            System.out.printf("b[%d]",j);
            b[j] = sc.nextInt();
        }

        for(int i = 0; i< n;i++){
             for (int j=0; j<m; j++){
                 if(a[i] == b[j]){
                     System.out.println("Mảng B là mảng con của mảng A");
                     return;
                 }else{
                     System.out.println("Mảng B không phải là mảng con của A!");
                 }
             }
        }
    }
}
