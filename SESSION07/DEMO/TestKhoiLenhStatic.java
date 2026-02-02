package SESSION07.DEMO;

public class TestKhoiLenhStatic {
    public static void main(String[] args) {
        //Gọi show1() ?
        //KhoiLenhStatic.show1() // Không cho phép

        //Show1
        KhoiLenhStatic obj = new KhoiLenhStatic();
        obj.show1();

        //Show 2
        KhoiLenhStatic.show2();
    }
}
