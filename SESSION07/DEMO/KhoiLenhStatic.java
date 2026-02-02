package SESSION07.DEMO;

public class KhoiLenhStatic {
    int n;
    int m;
    static int k;
    static int q;
    static {
        k=50;
        q=90;
//        m=100; không được
    }
    //Khi khai báo trong phương thức thì gắn dc giá trị
    public KhoiLenhStatic(){
        n = 100;
        m = 100;
        k = 100;
        q = 100;
    }

    public void show1(){ //Gọi là phương thức đối tượng, được gọi thông qua biến biến đối tượng
        System.out.println("m = " + n);
        System.out.println("k = "+ m);
    }
    //Hạn chế static chỉ truy cập dc biến static thôi
    public static void show2(){
//        System.out.println("n = " +n); //Không có phép
//        System.out.println("n = " +m);

        System.out.println("n = " +k);
        System.out.println("n = " +q);
    }
}
