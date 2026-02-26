package Câu1.Phan2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mời bạn nhập chuỗi ký tự bất kỳ: ");
        String character = sc.nextLine();

        char[] chars = character.toCharArray();
        for (int i = 0; i < chars.length -1; i++) {
            int count = 0;
            if(chars[i] != chars[i+1]) {
                System.out.print(chars[i] + ": ");
            }
            for(int j=1; j< chars.length;j++){
                if(chars[i] == chars[j]){
                    count++;
                }
            }
            if(count == 0) count = 1;
            if(chars[i] != chars[i+1]) System.out.println(count);
        }
    }
}
