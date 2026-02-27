package SESSION14.SESSION14_03;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Aspirin");
        set1.add("Caffeine");
        set1.add("Paracetamol");

        set2.add("Aspirin");
        set2.add("Penicillin");

        Set<String> giao = new HashSet<>();
        giao.addAll(set1);
        giao.retainAll(set2);

        for(String s : giao){
            System.out.print("Cảnh báo dị ứng: ["+s+"]");
        }

        System.out.print("\nThành phần an toàn: [");
        Set<String> hieu = new HashSet<>();
        hieu.addAll(set1);
        hieu.removeAll(set2);

        for (String s: hieu){
            System.out.print(s+ "]");
        }
    }
}
