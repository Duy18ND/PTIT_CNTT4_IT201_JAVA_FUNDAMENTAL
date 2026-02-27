package SESSION14.SESSION14_01;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main() {
        Set<String> list = new LinkedHashSet<>();
        list.add("Nguyễn Văn A – Yên Bái");
        list.add("Trần Thị B – Thái Bình");
        list.add("Nguyễn Văn A – Yên Bái");
        list.add("Lê Văn C – Hưng Yên");

        for(String s : list){
            System.out.println(s);
        }
    }
}
