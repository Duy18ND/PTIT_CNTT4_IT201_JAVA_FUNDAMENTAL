package SESSION07.SESSION07_03;

public class SESION07_03 {
    public static void main(String[] args) {
        double[] Score = {6.5,8.0,4.5};

        System.out.println(String.format("%.2f", ScoreUtils.calculateAverage(Score)));
        System.out.println(ScoreUtils.checkPass(Score[0])? "Đặt" : "Trượt");
        System.out.println(ScoreUtils.checkPass(Score[1])? "Đặt" : "Trượt");
        System.out.println(ScoreUtils.checkPass(Score[2])? "Đặt" : "Trượt");
    }
}
