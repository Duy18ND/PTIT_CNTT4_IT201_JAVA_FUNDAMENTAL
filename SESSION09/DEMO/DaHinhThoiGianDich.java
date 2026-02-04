package SESSION09.DEMO;

public class DaHinhThoiGianDich {
    // Hàm 1: Cộng 2 số
    public static int cong(int a, int b){
        return a + b;
    }

    // Hàm 2: Vẫn tên là "cong" nhưng cộng 3 số -> Đây mới là Overloading
    public static int cong(int a, int b, int c){
        return a + b + c;
    }

    public void display(){
        // Máy tính tự nhìn số lượng tham số để biết gọi hàm nào
        System.out.println("a + b = " + cong(1, 2));       // Gọi hàm 1
        System.out.println("a + b + c = " + cong(2, 3, 4)); // Gọi hàm 2
    }
}