package SESSION14.DEMO;

import java.util.Objects;

public class Student {
    private int id;
    private String className;

    public Student(int id, String className) {
        this.id = id;
        this.className = className;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    // 1. Ghi đè hashCode: Báo cho HashSet biết sinh viên này nằm ở "khu vực" nào trong bộ nhớ
    @Override
    public int hashCode() {
        // Cách hiện đại và an toàn nhất từ Java 7 trở lên
        return Objects.hash(id, className);
    }

    // 2. Ghi đè equals: So sánh chi tiết xem 2 sinh viên có thực sự là một không
    @Override
    public boolean equals(Object obj) {
      Student s = (Student)obj;
      return id == s.id;
    }

    // 3. Ghi đè toString: Để lúc in ra màn hình thấy được dữ liệu thay vì địa chỉ bộ nhớ
    @Override
    public String toString() {
        return "Student { id=" + id + ", className='" + className + "' }";
    }
}