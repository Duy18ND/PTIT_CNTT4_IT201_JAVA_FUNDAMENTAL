package SESSION09.DEMO;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person{
    private String stuId;
    private String className;
    private String schoolName;

    public Student() {
        //Gọi đến constructor không tham số của lớp cha
        super();
    }

    public Student(String fullName, Boolean gender, Date birthDay, String address, String stuId, String className, String schoolName) {
        super(fullName, gender, birthDay, address);
        this.stuId = stuId;
        this.className = className;
        this.schoolName = schoolName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập StuID: ");
        stuId = sc.nextLine();

        System.out.print("Nhập Class Name: ");
        className = sc.nextLine();

        System.out.print("Nhập schoolName: ");
        schoolName = sc.nextLine();
        super.input();
    }
    public String display(){
        return super.display() +
                "\nStuID: " + stuId +
                "\nclassName: " + className +
                "\nschoolName: " + schoolName;
    }
}
