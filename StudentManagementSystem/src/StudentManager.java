package StudentManagementSystem.src;

public class StudentManager {
    // --- KHAI BÁO THUỘC TÍNH (Attributes) ---
    private Student[] students;       // Mảng chứa sinh viên
    private int currentCount;         // Biến đếm số lượng hiện tại
    private final int MAX_SIZE = 100; // Hằng số giới hạn mảng

    // --- CONSTRUCTOR ---
    public StudentManager() {
        this.students = new Student[MAX_SIZE];
        this.currentCount = 0;
    }

    // --- CÁC PHƯƠNG THỨC CHỨC NĂNG (Functional Requirements) ---

    // [FR1] Thêm sinh viên mới
    public boolean addStudent(Student s) {
        return false;
    }

    // [FR2] Hiển thị danh sách sinh viên
    public void displayAll() {
    }


    // [FR3] Tìm kiếm sinh viên theo Mã
    public Student findById(String id) {
        return null;
    }
    // [FR3] Tìm kiếm sinh viên theo Tên
    public void findByName(String keyword) {
    }


    // [FR4] Cập nhật thông tin sinh viên
    public boolean updateStudent(String id, Student newInfo) {
        return false;
    }

    // [FR5] Xóa sinh viên
    public boolean deleteStudent(String id) {
        return false;
    }


    // [FR7] Sắp xếp theo Điểm TB giảm dần
    public void sortByAvgDesc() {
    }
    // [FR7] Sắp xếp theo Tên A-Z
    public void sortByName() {
    }


    // [FR8] Thống kê báo cáo
    public void showStatistics() {
    }

    // Getter lấy số lượng hiện tại (Dùng cho MainApp nếu cần)
    public int getCurrentCount() {
        return currentCount;
    }
}