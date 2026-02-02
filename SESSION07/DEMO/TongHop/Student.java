package SESSION07.DEMO.TongHop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;

    //Biến static không cần dùng getter và setter
    public static String schoolName;
    public static int totalStudent;

    static {
        schoolName = "PTIT";
        totalStudent = 0;
    }
    public Student(){totalStudent++;}
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        totalStudent++;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public static void setTotalStudent(int totalStudent) {
        Student.totalStudent = totalStudent;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void input(){
        System.out.print("Nhập mã sinh viên: ");
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
    }

    public void display(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("SchoolName: "+ schoolName);
        System.out.println("TotalStudent: "+ totalStudent);
    }
}
