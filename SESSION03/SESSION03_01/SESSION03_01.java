package SESSION03.SESSION03_01;

import java.util.Scanner;

public class SESSION03_01 {
    public static int[] addBookTolibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.printf("Mời bạn nhập mã số cho %d cuốn sách: \n",n);
        for (int i = 0 ; i < n; i++){
            System.out.printf("Sách thứ %d : ", (i + 1));
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayLibraries(int[] arr) {
        System.out.println("--- KẾT QUẢ ---");
        System.out.print("Danh sách mã Sách: ");
        for (int i =0; i < arr.length; i ++){
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách cần quản lý: ");
        int number = sc.nextInt();

        int[] arr = addBookTolibraries(number);
        displayLibraries(arr);
    }
}
