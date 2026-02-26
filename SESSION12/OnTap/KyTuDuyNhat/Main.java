package SESSION12.OnTap.KyTuDuyNhat;

public class Main {
    static void main() {
        String character = "statistics";

        for(int i=0; i< character.length(); i++){
            char current = character.charAt(i);
            int count = 0;

            for(int j=0; j < character.length();j++){
                if(character.charAt(j) == current){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(current+ " ");
            }
        }
    }
}
