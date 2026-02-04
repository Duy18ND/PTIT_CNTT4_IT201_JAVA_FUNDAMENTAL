package SESSION09.DEMO;

public class DaHinhThoiGianChay {
    public static void main(String[] args) {
        Person p;

        p = new Student();

        if(p instanceof Student){
            System.out.println("Đây là Student");
        } else if(p instanceof Person){
            System.out.println("Đây là Person");
        }
    }
}