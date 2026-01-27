package SESSION03.SESSION03_05;
import java.util.Scanner;

public class SESSION03_05 {
    public static int deleteBook(int[] arr, int n, int bookId){
        int check = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == bookId){
                check = i;
                break;
            }
        }

        if(check == -1){
            System.out.println("Không tìm thấy mã sách " + bookId);
            return n;
        }

        for (int i = check; i < n - 1; i++){
            arr[i] = arr[i+1];
        }

        System.out.printf("Đã xóa mã sách: %d\n", bookId);
        return n - 1;
    }

    public static void displayBook(int[] arr, int n){
        System.out.print("[");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + ((i == n - 1) ? "" : ", "));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = 6;

        while (true) {
            System.out.printf("\nKho sách hiện tại (%d cuốn): ", n);
            displayBook(arr, n);

            if (n == 0) {
                System.out.println("Kho sách đã hết!");
                break;
            }

            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int bookId = sc.nextInt();

            if (bookId == 0) {
                System.out.println("Thoát chương trình.");
                break;
            }
            n = deleteBook(arr, n, bookId);
        }
    }
}