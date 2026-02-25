package Câu1.Phan1;

public class Main {
    static void main() {
        String input = "abc12mn4t5";
        String[] words = input.split("[^\\d]");

        StringBuilder sbt = new StringBuilder();

        for(int i=0; i< words.length;i++){
           sbt.append(words[i]);
    }

        System.out.println("Output: "+ sbt);
    }
}
