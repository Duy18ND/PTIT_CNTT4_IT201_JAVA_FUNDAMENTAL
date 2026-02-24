package SESSION12.Regex;

import java.util.Scanner;

public class Main {
    static void main() {
        String email = "duy18namdinh@gmail.com";

       //Logic kiểm tra email đúng
        if(email.matches("^[\\w-\\.]+@+[\\w-]+\\.+(com|vn)")){
            System.out.println("Email đúng!");
            String name = email.split("@")[0];

            char[] arrayName = name.toUpperCase().toCharArray();

            for(int i=0; i <arrayName.length; i++){
                System.out.print(arrayName[i] + " ");
            }
            System.out.println("");
            for(char c : arrayName){
                System.out.print(c + " ");
            }
        }else {
            System.out.println("Email sai!");
        }
    }
}
