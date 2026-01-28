package SESSION04.SESSION04_06;

public class SESSION04_06 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";

        review = review.replaceAll("tệ", "*****");

        String result = review.substring(0,41) + "...";

        System.out.println("Review sau khi xử lý: " + result);
    }
}
