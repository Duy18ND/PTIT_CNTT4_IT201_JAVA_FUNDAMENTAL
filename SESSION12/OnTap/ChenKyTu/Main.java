package SESSION12.OnTap.ChenKyTu;

import java.util.Scanner;

public class Main {
    static void main() {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;

        int currentSize = 4;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Nhập số nguyên bất kỳ: ");
            int n = sc.nextInt();

            System.out.print("Nhập vị trí bất kỳ (0- "+arr.length +") : ");
            int k = sc.nextInt();

            if(k > (arr.length -1)){
                System.out.println("Vị trí chèn không hợp lệ!");
            }else{
                for(int i=currentSize; i> k ; i--){
                    arr[i] = arr[i-1];
                }
                //Gắn giá trị
                arr[k] = n;
                //Tăng số lượng arr
                currentSize++;
                System.out.print("✔️ Mảng sau khi chèn: ");
                for(int i = 0; i < currentSize; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();

                break;
            }

        }
    }
}
