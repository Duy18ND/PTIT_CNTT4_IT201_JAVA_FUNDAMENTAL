package SESSION01.SESSION01_03;

public class SESSION01_03 {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Puthon Intro";

        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);
        //B1: Gắn Temp = book1
        String temp = book1;
        //B2: Gắn giá trị của book1 = book2
        book1 = book2;
        //B3: Gắn giá trị book2 = temp
        book2 = temp;

        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);
    }
}
