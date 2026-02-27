package SESSION14.SESSION14_05;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static void main() {
        Comparator<Patient> comparator = new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                if(o1.getSeverity() != o2.getSeverity()){
                    return Integer.compare(o1.getSeverity(), o2.getSeverity());
                }
                return o1.getArrivalTime().compareTo(o2.getArrivalTime());
            }
        };

        Set<Patient> queue = new TreeSet<>(comparator);
        queue.add(new Patient("A", 3, "08:00"));
        queue.add(new Patient("B", 1, "08:15"));
        queue.add(new Patient("C", 1, "08:05"));

        queue.add(new Patient("D", 2, "08:10"));

        System.out.println("Thứ tự xử lý:");
        for (Patient p : queue) {
            System.out.println("Bệnh nhân " + p.getName() + " (Mức " + p.getSeverity() + ", đến lúc " + p.getArrivalTime() + ")");
        }
    }
}
