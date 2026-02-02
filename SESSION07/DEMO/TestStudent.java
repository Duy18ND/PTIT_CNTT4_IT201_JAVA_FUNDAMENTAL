package SESSION07.DEMO;

public class TestStudent {
    public static void main(String[] args) {
        Student.schoolName = "Học viện bưu chính PTIT";
        Student.totalStudents = 0;

        //Student.id = 1 // Không thể truy cập thẳng qua tên lớp
        //Truy cập qua new Student
        Student obj = new Student();
        obj.id = 1;
        obj.fullName = "Đoàn mạnh duy";
        obj.className = "CNTT4";



    }
}
