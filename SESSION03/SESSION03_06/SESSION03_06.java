package SESSION03.SESSION03_06;

import java.util.Arrays;
import java.util.Scanner;
public class SESSION03_06 {
    public static int[] mergeSort(int[] arr1, int[] arr2){
        int[] temp = new int[arr1.length + arr2.length];

        for (int i=0;i < arr1.length; i++){
            temp[i] = arr1[i];
        }

        for (int i=0; i< arr2.length; i++){
            temp[arr1.length + i] = arr2[i];
        }

        Arrays.sort(temp);

        int[] resultTemp = new int[temp.length];
        int k = 0;

        for (int i=0; i< temp.length; i++){
            if(i == 0 || temp[i] != temp[i-1]){
                resultTemp[k] = temp[i];
                k++;
            }
        }

        int[] finalResult = new int[k];
        for (int i=0; i<k; i++){
            finalResult[i] = resultTemp[i];
        }
        return finalResult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,3,5,6,8,9,10};
        System.out.print("Kho cũ: ");
        for (int i=0; i < arr1.length; i++){
            System.out.print(arr1[i] + (i == arr1.length -1 ? "]" : ", "));
        }
        System.out.print("\nLô mới: ");
        for (int i=0; i < arr2.length; i++){
            System.out.print(arr2[i] + (i == arr2.length -1 ? "]" : ", "));
        }
        int[] result = mergeSort(arr1,arr2);
        System.out.println("\nKho tổng (đã gộp & bỏ trùng): "+ Arrays.toString(result));
    }
}
