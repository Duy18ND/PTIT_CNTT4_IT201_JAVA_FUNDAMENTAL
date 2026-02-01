package SESSION05.SESSION05_01;

public class SESSION05_01 {
   static class Student {
        int StuID;
        String name;
        String email;

        public Student(){};
        public Student(int stuID, String name, String email) {
            StuID = stuID;
            this.name = name;
            this.email = email;
        }



        public String getALlStudent() {
            return "ID: " + StuID + "\nName: " + name + "\nEmail: " + email;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"Doan Manh Duy", "duy@gmail.com");
        System.out.println(s1.getALlStudent());
        Student s2 = new Student(2,"Nguyen Van A", "NguyenVanA@gmail.com");
        System.out.println(s2.getALlStudent());
    }
}
