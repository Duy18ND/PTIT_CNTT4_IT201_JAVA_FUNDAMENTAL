package SESSION07.SESSION07_01;

import java.util.Scanner;

public class SESION07_01 {
    static class Student {
        private int StuID;
        private String Name;

        static int totalStudent;

        public Student() {
            totalStudent++;
        }

        public Student(int stuID, String Name) {
            this.StuID = stuID;
            this.Name = Name;
            totalStudent++;
        }

        public void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập ID: ");
            StuID = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập Name: ");
            Name = sc.nextLine();
        }

        public void displayStudent() {
            System.out.println("-----Thông tin sinh viên-----");
            System.out.println("ID: " + StuID);
            System.out.println("Name: " + Name);
            System.out.println("Tổng số sinh viên: " + totalStudent);
            System.out.println("");
        }

        public static void main(String[] args) {
            Student s1, s2, s3;

            s1 = new Student();
            s1.input();
            s1.displayStudent();

            s2 = new Student();
            s2.input();
            s2.displayStudent();

            s3 = new Student();
            s3.input();
            s3.displayStudent();


        }
    }
}
