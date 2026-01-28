package SESSION04.SESSION04_01;

import java.util.StringTokenizer;
public class SESSION04_01 {
    public static String Text(String text){
        //B1: Kiểm tra chuỗi có rỗng hay không??
        if(text == null || text.trim().isEmpty()){
            return "Chuỗi rỗng!";
        }

        //B2: Chuyển chuỗi ký tự thành chữ thường
        text = text.toLowerCase();

        //B3: Gọi StringTokenizer -> lọc rác như "    ", cắt chuỗi
        StringTokenizer stk = new StringTokenizer(text);

        //B4: đưa text về rỗng
        text = "";

        //B5: sử dụng while để tách từng chuỗi ký tự
        while(stk.hasMoreTokens()){
            //B5.1: Lấy từng chuỗi ký tự con như: "Lập"
            String word = stk.nextToken();

            //B5.2: Tách chuỗi ký tự con -> ký tự đơn lẻ "L", "ậ", "p"
            String Head = word.substring(0,1).toUpperCase();
            String End = word.substring(1);

            //B5.3: Gắn ký tự thành 1 chuỗi ký tự sau khi đã chuẩn hóa đặt tên
            text += Head + End + " ";
        }
        //Sau khi gắn thành 1 chuỗi thì return;
        return text;
    }
    public static void main(String[] args) {
        String title = "    Lập TRÌNH java CƠ        bản    ";
        String author = "nguyễn văn a";
        //B6: In
        System.out.printf("[%s] - Tác giả: %s",Text(title).toUpperCase(), Text(author));
    }
}