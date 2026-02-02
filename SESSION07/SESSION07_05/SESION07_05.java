package SESSION07.SESSION07_05;

public class SESION07_05 {
    public static void main(String[] args) {
        double myScore = 8.5;

        if(myScore <= Config.MAX_SCORE && myScore >= Config.MIN_SCORE) System.out.println("Điểm hợp lệ!");
        //Bị báo đỏ do biến Final không thể thay đổi được biến khi đã gán
        //LỖI: Cannot assign a value to final variable 'MAX_SCORE'
        //Config.MAX_SCORE = 11.0;
    }
}
