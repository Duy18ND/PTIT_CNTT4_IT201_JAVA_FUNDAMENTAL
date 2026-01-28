package SESSION04.SESSION04_04;

public class SESSION04_04 {
    public static void main(String[] args) {
        String cardID = "TV202412345";
        //Cắt và kiểm tra tiền tố (2 ký tự đầu)
        String prefix = cardID.substring(0,2);
        if(!prefix.matches("[A-Z]{2}")){
            System.out.println("Thiếu tiền tố TV!!!");
            return;
        }

        //Cắt và kiểm tra chữ số năm vào học (VD: 2023)
        String yearStr = cardID.substring(2,6);
        if(!yearStr.matches("\\d{4}")){
            System.out.println("Năm học phải là 4 chữ số!!!");
            return;
        }
        //Kiểm tra logic năm học không vượt quá 2000 và trên 2026
        int year = Integer.parseInt(yearStr);
        if(year < 2000 || year > 2026){
            System.out.println("Năm học " + year + " không hợp lệ!!!");
            return;
        }

        //Kết thúc = 5 ký tự ngẫu nhiên
        String suffix = cardID.substring(6);

        if(!suffix.matches("\\d{5}")){
            System.out.println("5 ký tự cuối phải là số ngẫu nhiên!!!");
            return;
        }

        //Hợp lệ!
        System.out.println("Mã hợp lệ!");
    }
}
