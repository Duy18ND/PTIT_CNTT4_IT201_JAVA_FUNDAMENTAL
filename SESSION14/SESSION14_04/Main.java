package SESSION14.SESSION14_04;


import java.util.*;

public class Main {
    static void main() {
        List<String> list = new ArrayList<>(Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết"));

        Map<String, Integer> map = new TreeMap<>();

        for(String s: list){
            if(map.containsKey(s)){
                int count = map.get(s);
                map.put(s, count + 1);
            }else{
                map.put(s, 1);
            }
        }

        System.out.println("Output (đã sắp xếp):");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
