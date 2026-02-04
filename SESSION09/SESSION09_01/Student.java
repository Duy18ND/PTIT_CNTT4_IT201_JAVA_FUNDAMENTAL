package SESSION09.SESSION09_01;

import java.util.Scanner;

public class Student extends  Person {
    private String stuID;
    private double avgScore;

    public Student(){super();};
    public Student(String fullName, int age, String stuID, double avgScore) {
        super(fullName, age);
        this.stuID = stuID;
        this.avgScore = avgScore;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        //Nhập thông tin sinh viên
        System.out.println("---------------------------");
        System.out.print("Nhập mã sinh viên: ");
        stuID = sc.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        avgScore = sc.nextDouble();
        sc.nextLine();

        super.input();
    }

    @Override
    public void display() {
        System.out.println("------HIỂN THỊ THÔNG TIN-------");
        System.out.println("Mã Sinh Viên: "+ stuID);
        super.display();
        System.out.println("Điểm trung bình: "+ avgScore);
    }
}
