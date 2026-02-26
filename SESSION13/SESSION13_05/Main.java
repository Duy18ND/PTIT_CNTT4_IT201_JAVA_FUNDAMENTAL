package SESSION13.SESSION13_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Patient> patientList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        do {
            showMenu();
            System.out.print("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
                continue;
            }

            switch (choice) {
                case 1: tiepNhanBenhNhan(); break;
                case 2: capNhatChanDoan(); break;
                case 3: xuatVien(); break;
                case 4: sapXepDanhSach(); break;
                case 5: hienThiDanhSach(); break;
                case 6: System.out.println("Đã thoát chương trình."); break;
                default: System.out.println("Chức năng không hợp lệ!");
            }
        } while (choice != 6);
    }

    private static void showMenu() {
        System.out.println("\n=================[ MENU ]=================");
        System.out.println("|| 1. Tiếp nhận bệnh nhân               ||");
        System.out.println("|| 2. Cập nhật chẩn đoán                ||");
        System.out.println("|| 3. Xuất viện                         ||");
        System.out.println("|| 4. Sắp xếp danh sách bệnh nhân       ||");
        System.out.println("|| 5. Hiển thị danh sách bệnh nhân      ||");
        System.out.println("|| 6. Thoát                             ||");
        System.out.println("==========================================");
    }

    private static void tiepNhanBenhNhan() {
        System.out.print("Nhập ID bệnh nhân: ");
        String id = scanner.nextLine();

        if (findPatientById(id) != null) {
            System.out.println("Lỗi: ID này đã tồn tại trong hệ thống!");
            return;
        }

        System.out.print("Nhập tên bệnh nhân: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = scanner.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Bệnh nhân đã được tiếp nhận thành công.");
    }

    private static void capNhatChanDoan() {
        System.out.print("Nhập ID bệnh nhân cần cập nhật chẩn đoán: ");
        String id = scanner.nextLine();

        Patient p = findPatientById(id);
        if (p != null) {
            System.out.print("Nhập chẩn đoán mới: ");
            String newDiagnosis = scanner.nextLine();
            p.setDiagnosis(newDiagnosis);
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
        }
    }

    private static void xuatVien() {
        System.out.print("Nhập ID bệnh nhân để xuất viện: ");
        String id = scanner.nextLine();

        Patient p = findPatientById(id);
        if (p != null) {
            patientList.remove(p);
            System.out.println("Bệnh nhân đã xuất viện thành công.");
        } else {
            System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
        }
    }

    private static void sapXepDanhSach() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        Comparator<Patient> customComparator = new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.getAge() != p2.getAge()) {
                    return Integer.compare(p2.getAge(), p1.getAge());
                }
                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        };

        Collections.sort(patientList, customComparator);
        System.out.println("Đã sắp xếp danh sách thành công.");
    }

    private static void hienThiDanhSach() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách bệnh nhân đang trống.");
            return;
        }
        System.out.println("------------- DANH SÁCH BỆNH NHÂN -------------");
        for (Patient p : patientList) {
            System.out.println(p.toString());
        }
        System.out.println("-----------------------------------------------");
    }

    private static Patient findPatientById(String id) {
        for (Patient p : patientList) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
}