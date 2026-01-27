package SESSION03.SESSION03_04;

import java.util.Scanner;

public class SESSION03_04 {
    public static int[] sortBooks(int[] arr){
        for (int i=0; i< arr.length; i++){
            for(int j=0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void displayBooks(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {109,23,435,32,45,230,202,101};
        System.out.print("Trước khi sắp xếp:  [");
        displayBooks(arr);
        System.out.print("Sau khi sắp xếp:  [");
        arr =  sortBooks(arr);
        displayBooks(arr);

    }
}

