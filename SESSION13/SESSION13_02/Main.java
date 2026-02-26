package SESSION13.SESSION13_02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> inputMedicines = Arrays.asList("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen");

        System.out.println("Input: " + inputMedicines);

        List<String> outputMedicines = locVaSapXepThuoc(inputMedicines);
        System.out.println("Output: " + outputMedicines);
    }

    public static List<String> locVaSapXepThuoc(List<String> danhSachCu) {
        ArrayList<String> danhSachMoi = new ArrayList<>();
        for (String tenThuoc : danhSachCu) {
            if (!danhSachMoi.contains(tenThuoc)) {
                danhSachMoi.add(tenThuoc);
            }
        }

        Collections.sort(danhSachMoi);
        return danhSachMoi;
    }
}