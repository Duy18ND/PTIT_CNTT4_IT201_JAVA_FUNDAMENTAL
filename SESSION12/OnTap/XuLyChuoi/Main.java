package SESSION12.OnTap.XuLyChuoi;

import java.util.Locale;

public class Main {
    static void main() {
        String character = "123nguyen!! @van23 bA";

        // chuyển về ký tự và xử lý ký tự đặc biệt
        String[] words = character.split("[^a-zA-Z]+");

        //Tạo Stringbulder
        StringBuilder result = new StringBuilder();

        // Tách chuỗi + chữ cái đầu Hoa
        for(int i=0; i< words.length;i++){
            if(!words[i].isEmpty()){
                String startWord = words[i].substring(0,1).toUpperCase();
                String endtWord = words[i].substring(1).toLowerCase();

                //Gộp vào result
                result.append(startWord).append(endtWord).append(" ");
            }
        }

        System.out.println("Output: "+ result);
    }
}
