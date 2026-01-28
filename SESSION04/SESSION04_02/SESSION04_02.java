package SESSION04.SESSION04_02;

public class SESSION04_02 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";
        String key = "Kệ:";
        //Tìm vị trí từ khóa "Kệ"
        int index = description.indexOf(key);

        //Điều kiện khi tìm thấy key
        if(index != -1){
            //Xác định vị tri bắt đầ cuaur mã ngay sau chữ "Kệ"
            int startCodeIndex = index + key.length();
            //Tìm dấu phẩy kế tiếp để biết mã kết thúc ở đâu
            int comaIndex = description.indexOf(",", startCodeIndex);

            String code;
            if(comaIndex != 1){
                code = description.substring(startCodeIndex, comaIndex);
            }else{
                code = description.substring(startCodeIndex);
            }

            //Xóa khoảng trắng mã thừa
            code = code.trim();

            System.out.println("Vị trí tìm thấy: " + code);

            //Thay thế và in mô tả mới
            String newDescription = description.replace(key, "Vị trí lưu trữ:");

            //Tạo dấu chấm cuối câu
            if(!newDescription.endsWith(".")){
                newDescription += ".";
            }
            System.out.println("Mô tả mới: " + newDescription);
        }else{
            System.out.println("Không tìm thấy!");
        }
    }
}
