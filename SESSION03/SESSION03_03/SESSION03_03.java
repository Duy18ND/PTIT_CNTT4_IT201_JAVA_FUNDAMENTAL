package SESSION03.SESSION03_03;

import java.util.Scanner;

public class SESSION03_03 {
    //Max QuantityOfBoook
    public static void maxQuantityOfBooks(String[] names, int[] quantities){
        //tìm max
        int max = quantities[0];
        for (int i =0; i < quantities.length; i ++){
            if(quantities[i] > max){
                max = quantities[i];
            }
        }
        System.out.printf("Sách có số lượng nhiều nhất (%d):\n", max);
        //In tên và số lượng cuốn sách có số lượng lớn nhất
        for (int i=0; i< names.length; i++){
            if (quantities[i] == max) {
                System.out.printf("- %s\n",names[i]);
            }
        }
    }

    //Min QuantityOfBoook
    public static void minQuantityOfBooks(String[] names, int[] quantities){
        int min = quantities[0];
        for (int i =0; i < quantities.length; i++){
            if(quantities[i] < min){
                min = quantities[i];
            }
        }
        System.out.printf("Sách có số lượng ít nhất (%d):\n",min);
        for (int i=0; i < names.length; i++){
            if(quantities[i] == min){
                System.out.printf("- %s\n",names[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Doraemon", "Dragon Ball", "Shin", "OneMan", "Super"};
        int[] quantities = {50,2,5,100,100};

        maxQuantityOfBooks(names, quantities);
        System.out.println("-----------------");
        minQuantityOfBooks(names,quantities);
    }
}
