package SESSION03.SESSION03_02;

import java.util.Scanner;

public class SESSION03_02 {
    public static int searchBooks(String[] arr, String search){
        int isStatus = -1;
        for (int i = 0; i < arr.length; i++){
            if(arr[i].toLowerCase().equals(search.toLowerCase())){
                isStatus = i;
                break;
            }
        }
        return isStatus;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"Doraemon", "Dragon Ball", "Shin", "OneMan", "Super"};

        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int check = searchBooks(arr, search);
        if(check == -1){
            System.out.println("Sách không tồn tại trong thư viện");
        }else{
            System.out.printf("Tìm thấy sách '%s' tại vị trí số: %d", arr[check], check);
        }
    }
}
