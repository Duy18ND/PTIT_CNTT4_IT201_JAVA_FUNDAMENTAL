package SESSION04.DEMO;

public class DEMO {
    public static void main(String[] args) {
        //[FR3] Kiểm tra chuỗi đối xứng (Valid Palindrome):
        //        Input: Một câu bất kỳ (ví dụ: "A man, a plan, a canal: Panama").
            String title = "A man, a plan, a canal: Panama";
        System.out.println("Chuỗi ban đầu: " + title);
        //        Thuật toán:
        //        1. Sử dụng Regex để loại bỏ tất cả ký tự không phải chữ cái và
        String cleanStr = title.replaceAll("[^a-zA-Z0-9]", "");
        //        2. Chuyển tất cả về chữ thường.
        cleanStr = cleanStr.toLowerCase();
        System.out.println("Chuỗi sau khi làm sạch: " + cleanStr);
        //        3. Kiểm tra xem chuỗi có đọc giống nhau từ hai phía không.
        StringBuilder sb = new StringBuilder(cleanStr);
        String reversedStr = sb.reverse().toString();

        boolean isPalindrome = cleanStr.equals(reversedStr);
        //        Output: Boolean (True/False).
        System.out.println("Kết quả đối xứng (Palindrome): " + isPalindrome);
    }
}
