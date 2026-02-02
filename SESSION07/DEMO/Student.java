package SESSION07.DEMO;

public class Student {
    //Không có static không cho phép truy cập qua tên lớp
     int id; // Biến thể hiện - hoặc biến đối tượng (còn gọi là instance variable)
     String fullName;
     String className;

    //Biến static truy cập thẳng Student.school
    //Giá trị giống nhau
    public static String schoolName; //Gọi là biến lớp (gọi là variable)
    public static int totalStudents; //Giá trị giống nhau qua tất cả các thể
}
