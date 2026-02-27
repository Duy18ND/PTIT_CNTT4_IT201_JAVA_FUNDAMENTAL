package SESSION14.SESSION14_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 30, "Tim mạch"),
                new Patient("Hùng", 45, "Nội tiết"),
                new Patient("Mai", 28, "Tim mạch")
        );

        Map<String, List<Patient>> hospitalMap = new HashMap<>();

        for (Patient p : patients) {
            String dept = p.getDepartment();
            if (!hospitalMap.containsKey(dept)) {
                hospitalMap.put(dept, new ArrayList<>());
            }
            hospitalMap.get(dept).add(p);
        }

        System.out.println("Output Map Structure:");
        for (Map.Entry<String, List<Patient>> entry : hospitalMap.entrySet()) {
            System.out.println("Key \"" + entry.getKey() + "\" -> Value " + entry.getValue());
        }

        String targetDept = "Tim mạch";
        System.out.println("\n--- Tra cứu khoa: " + targetDept + " ---");
        if (hospitalMap.containsKey(targetDept)) {
            System.out.println("Danh sách: " + hospitalMap.get(targetDept));
        } else {
            System.out.println("Khoa này không tồn tại hoặc không có bệnh nhân.");
        }

        String maxDept = "";
        int maxPatients = 0;

        for (Map.Entry<String, List<Patient>> entry : hospitalMap.entrySet()) {
            int currentSize = entry.getValue().size();
            if (currentSize > maxPatients) {
                maxPatients = currentSize;
                maxDept = entry.getKey();
            }
        }

        System.out.println("\nOutput Analysis: \"Khoa " + maxDept + " đang đông nhất (" + maxPatients + " bệnh nhân)\".");
    }
}