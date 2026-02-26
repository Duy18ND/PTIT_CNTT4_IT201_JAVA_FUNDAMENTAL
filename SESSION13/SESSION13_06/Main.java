package SESSION13.SESSION13_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    private static List<Medicine> prescription = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        do {
            showMenu();
            System.out.print("Chọn lựa chọn: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số nguyên!");
                continue;
            }

            switch (choice) {
                case 1: themThuoc(); break;
                case 2: dieuChinhSoLuong(); break;
                case 3: xoaThuoc(); break;
                case 4: inHoaDon(); break;
                case 5: timThuocGiaRe(); break;
                case 6: System.out.println("Kết thúc chương trình."); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    private static void showMenu() {
        System.out.println("\n=================[ MENU ]=================");
        System.out.println("|| 1. Thêm thuốc vào đơn                ||");
        System.out.println("|| 2. Điều chỉnh số lượng               ||");
        System.out.println("|| 3. Xóa thuốc                         ||");
        System.out.println("|| 4. In hóa đơn                        ||");
        System.out.println("|| 5. Tìm thuốc giá rẻ                  ||");
        System.out.println("|| 6. Thoát                             ||");
        System.out.println("==========================================");
    }

    private static void themThuoc() {
        System.out.print("Nhập mã thuốc: ");
        String id = scanner.nextLine();

        Medicine existingMedicine = findMedicineById(id);

        if (existingMedicine != null) {
            System.out.print("Thuốc đã tồn tại. Nhập số lượng muốn thêm: ");
            int addQty = Integer.parseInt(scanner.nextLine());

            int currentQty = existingMedicine.getQuantity();
            existingMedicine.setQuantity(currentQty + addQty);
            System.out.println("Đã cộng dồn số lượng thành công !");
        } else {
            System.out.print("Nhập tên thuốc: ");
            String name = scanner.nextLine();

            System.out.print("Nhập giá thuốc: ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("Nhập số lượng: ");
            int qty = Integer.parseInt(scanner.nextLine());

            prescription.add(new Medicine(id, name, price, qty));
            System.out.println("Thêm thuốc thành công !");
        }
    }

    private static void dieuChinhSoLuong() {
        System.out.print("Nhập mã thuốc: ");
        String id = scanner.nextLine();

        Medicine m = findMedicineById(id);
        if (m == null) {
            System.out.println("Thuốc không tồn tại trong đơn.");
            return;
        }

        System.out.print("Nhập số lượng mới: ");
        int newQty = Integer.parseInt(scanner.nextLine());

        if (newQty <= 0) {
            prescription.remove(m);
            System.out.println("Số lượng bằng 0. Đã xóa thuốc khỏi đơn !");
        } else {
            m.setQuantity(newQty);
            System.out.println("Cập nhật số lượng thành công !");
        }
    }

    private static void xoaThuoc() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = scanner.nextLine();

        Medicine m = findMedicineById(id);
        if (m != null) {
            prescription.remove(m);
            System.out.println("Xóa thuốc thành công !");
        } else {
            System.out.println("Mã thuốc không tồn tại !");
        }
    }

    private static void inHoaDon() {
        if (prescription.isEmpty()) {
            System.out.println("Đơn thuốc hiện đang trống.");
            return;
        }

        System.out.println("\n----------------- HÓA ĐƠN -----------------");
        System.out.printf("%-10s %-15s %-10s %-5s\n", "Mã Thuốc", "Tên Thuốc", "Đơn Giá", "Số Lượng");

        double total = 0;
        for (Medicine m : prescription) {
            System.out.println(m.toString());
            total += m.getThanhTien();
        }

        System.out.println("-------------------------------------------");
        System.out.printf("Tổng tiền: %.0f VNĐ\n", total);

        prescription.clear();
        System.out.println("\n(Đã làm rỗng danh sách đơn thuốc sau khi thanh toán)");
    }

    private static void timThuocGiaRe() {
        System.out.println("--- CÁC THUỐC CÓ GIÁ DƯỚI 50.000 VNĐ ---");
        boolean found = false;

        for (Medicine m : prescription) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc nào giá dưới 50.000 VNĐ.");
        }
    }

    private static Medicine findMedicineById(String id) {
        for (Medicine m : prescription) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }
}