package SESSION07.SESSION07_02;

public class SESION07_02 {
    //Tạo 1 biến tham chiếu Object Student
    static class Student{
        String name;
        public Student(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = a; //Copy từ a sang b
        b = 20; //Thay đổi b, a không bị ảnh hưởng
        System.out.println("a = " + a);
        System.out.println("b = "+ b);

        //Test object
        Student s1 = new Student("Duy");
        Student s2 = s1;// s2 lưu địa chỉ s1
        //In trực tiếp địa chỉ
        System.out.println("s1: "+ s1);
        System.out.println("s2: "+ s2);

        //Đổi name = Nguyên
        s2.name = "Nguyên";
        //In s1 s2 = Nguyên vì sao chép địa chỉ của s1 nên khi thay đổi s2 nó cùng địa chỉ nên khi in ra s1 s2 đều ra nguyên
        System.out.println("s1: "+ s1.name);
        System.out.println("s2: "+ s2.name);
    }
}
