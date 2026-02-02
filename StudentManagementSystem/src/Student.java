package StudentManagementSystem.src;

public class Student {
    // 1. Khai báo thuộc tính (Attributes)
    private String studentId;     // Mã SV
    private String studentName;   // Họ tên
    private int age;              // Tuổi
    private boolean sex;          // Giới tính
    private double mathScore;     // Toán
    private double physicsScore;  // Lý
    private double chemistryScore; // Hóa

    // Hai thuộc tính phụ (tự tính toán)
    private double avgScore;      // Điểm TB [FR6]
    private String rank;          // Xếp loại [FR6]

    // 2. Constructor
    public Student(){};
    public Student(String studentId, String studentName, int age, boolean sex, double mathScore, double physicsScore, double chemistryScore, double avgScore, String rank) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.avgScore = avgScore;
        this.rank = rank;

        //tính toán ngay khi khởi tạo
        calculateAvgAndRank();
    }

    // 3. Các phương thức xử lý (Methods)

    // [FR6] Tính điểm TB và Xếp loại
    public void calculateAvgAndRank() {
    }

    // Getter & Setter


}