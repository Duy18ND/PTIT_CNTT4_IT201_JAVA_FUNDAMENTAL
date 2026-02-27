package SESSION14.DEMO;

import java.util.HashSet;
import java.util.Set;

public class DanhSachDoiTuong {
    // Hàm main chuẩn của Java
    public static void main(String[] args) {
        // Tạo một chiếc thùng chỉ chứa đối tượng Student, cơ chế chống trùng lặp
        Set<Student> list = new HashSet<>();

        // Đưa sinh viên vào list bằng cách khởi tạo (new) đối tượng
        list.add(new Student(1, "Cntt4"));
        list.add(new Student(2, "Cntt5"));

        // Cố tình thêm một sinh viên giống hệt số 1 để xem Set có chống trùng được không
        list.add(new Student(1, "Cntt4"));

        System.out.println("DANH SÁCH SINH VIÊN:");
        for (Student s : list) {
            System.out.println(s.toString());
        }
    }
}