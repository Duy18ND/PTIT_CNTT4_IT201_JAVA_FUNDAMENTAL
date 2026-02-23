package SESSION10.SESSION10_05;

public class Main {
    public static void main(String[] args) {
        Employee staff = new OfficeStaff("Nguyễn Văn Lệ", 10000000);
        Manager manager = new Manager("Trần Sếp Lớn", 20000000, 5000000);

        System.out.println("=== BẢNG LƯƠNG NHÂN VIÊN VĂN PHÒNG ===");
        staff.displayInfo();
        System.out.println("-> Tổng lương thực lãnh: " + String.format("%,.0f", staff.calculateSalary()) + " VNĐ\n");

        System.out.println("=== BẢNG LƯƠNG QUẢN LÝ ===");
        manager.displayInfo();
        System.out.println("Thưởng KPI: " + String.format("%,.0f", manager.getBonus()) + " VNĐ");
        System.out.println("-> Tổng lương thực lãnh: " + String.format("%,.0f", manager.calculateSalary()) + " VNĐ");
    }
}