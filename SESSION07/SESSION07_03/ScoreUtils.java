package SESSION07.SESSION07_03;

public class ScoreUtils {
        // Phương thức kiểm tra Đạt/Trượt
        public static boolean checkPass(double score) {
            return score >= 5.0;
        }

        // Phương thức tính trung bình cộng
        public static double calculateAverage(double[] scores) {
            //Kiểm tra mảng có rỗng hay không
            if(scores == null || scores.length == 0){
                System.out.println("Mảng rỗng!");
            }
            double total =0;
            for(int i=0; i< scores.length;i++){
                total+= scores[i];
            }
            return total / scores.length;
        }
}
