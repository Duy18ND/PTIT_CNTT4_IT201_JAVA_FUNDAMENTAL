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
        for (int i = 0; i < currentCount; i++) {
            if (students[i] != null && students[i].getStudentId().trim().equalsIgnoreCase(id.trim())) {
                //Cập nhật thông tin mới
                students[i].setStudentName(newInfo.getStudentName());
                students[i].setAge(newInfo.getAge());
                students[i].setSex(newInfo.isSex());
                students[i].setMathScore(newInfo.getMathScore());
                students[i].setPhysicsScore(newInfo.getPhysicsScore());
                students[i].setChemistryScore(newInfo.getChemistryScore());

               //Tự tính lại điểm trung bình
                students[i].calculateAvgAndRank();

                return true;
            }
        }
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