package Minproject.SESSION08;

public class Student {
    // Phần quản lý danh sách (Nên tách ra class khác, nhưng tạm thời để đây theo ý bạn)
    private Student[] students;
    private int currentCount = 0; // Khởi tạo biến đếm
    private final int MAX_SIZE = 100;

    // Thuộc tính sinh viên
    private String id;
    private String name;
    private double score;
    private String rank; // Bỏ public, dùng getter

    // Constructor 1: Dùng để khởi tạo đối tượng quản lý danh sách
    public Student() {
        // QUAN TRỌNG: Phải khởi tạo mảng, nếu không sẽ bị lỗi NullPointerException
        this.students = new Student[MAX_SIZE];
    }

    // Constructor 2: Dùng để tạo đối tượng sinh viên chứa dữ liệu
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        calculateRank(); // Tính xếp loại ngay khi tạo
    }

    // --- CÁC HÀM QUẢN LÝ ---

    // Add
    public boolean addStudent(Student s) {
        if (currentCount >= MAX_SIZE) {
            System.out.println("Danh sách đã đầy");
            return false;
        }

        // Kiểm tra null để tránh lỗi khi mảng chưa full
        for (int i = 0; i < currentCount; i++) {
            if (students[i].getId().equalsIgnoreCase(s.getId())) {
                System.out.println("Mã sinh viên đã tồn tại");
                return false;
            }
        }
        students[currentCount++] = s;
        return true;
    }

    // Hiển thị
    public void displayAllStudents() {
        if (currentCount == 0) {
            System.out.println("Danh sách sinh viên đang trống!");
            return;
        }

        System.out.println("\n================= DANH SÁCH SINH VIÊN =================");
        // Đã sửa lại format: Bỏ Tuổi và Giới tính vì class không có dữ liệu này
        System.out.printf("%-10s %-20s %-10s %-12s\n",
                "Mã SV", "Họ tên", "Điểm TB", "Xếp loại");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < currentCount; i++) {
            Student s = students[i];
            System.out.printf("%-10s %-20s %-10.2f %-12s\n",
                    s.getId(),
                    s.getName(),
                    s.getScore(),
                    s.getRank());
        }
    }

    // --- GETTER / SETTER ---

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    // Sửa tên hàm getRank (void) thành calculateRank cho đúng nghĩa
    public void calculateRank(){
        if(score >= 8.0){
            rank = "Giỏi";
        } else if (score >= 6.5) {
            rank =  "Khá";
        } else {
            rank =  "Trung bình";
        }
    }
    public void searchByRank(String searchRank) {
        if (currentCount == 0) {
            System.out.println("Danh sách trống!");
            return;
        }

        boolean found = false;
        // In hoa searchRank để hiển thị cho đẹp
        System.out.println("\n--- DANH SÁCH SINH VIÊN XẾP LOẠI: " + searchRank.toUpperCase() + " ---");
        System.out.printf("%-10s %-20s %-10s %-12s\n", "Mã SV", "Họ tên", "Điểm TB", "Xếp loại");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < currentCount; i++) {
            if (students[i].getRank().equalsIgnoreCase(searchRank)) {
                System.out.printf("%-10s %-20s %-10.2f %-12s\n",
                        students[i].getId(),
                        students[i].getName(),
                        students[i].getScore(),
                        students[i].getRank());
                found = true;
            }
        }

        if (!found) {
            System.out.println(">>> Không có sinh viên nào xếp loại: " + searchRank);
        }
    }

    //Sắp xếp
    public void sortByRankDesc() {
        if (currentCount == 0) {
            System.out.println("Danh sách trống, không thể sắp xếp!");
            return;
        }

        for (int i = 0; i < currentCount - 1; i++) {
            for (int j = 0; j < currentCount - 1 - i; j++) {
                // Nếu điểm người trước THẤP HƠN người sau -> Đổi chỗ ra sau
                if (students[j].getScore() < students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp xong! (Giỏi -> Khá -> TB -> Yếu)");
    }
    // Getter cho rank để dùng trong display
    public String getRank() {
        return rank;
    }

    // Sửa tostring thành toString
    @Override
    public String toString(){
        return "ID: "+ id + "\nName: " +name+ "\nScore: " +score+ "\nRank: " + rank;
    }
}