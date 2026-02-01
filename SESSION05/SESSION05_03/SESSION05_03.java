package SESSION05.SESSION05_03;

public class SESSION05_03 {
    //    Thuộc tính private: mã SP, tên SP, giá bán
//    Tạo getter/setter:
//    Setter giá phải kiểm tra giá > 0
//    Phương thức hiển thị thông tin sản phẩm
//    Thử set giá không hợp lệ và quan sát kết quả
//3. Kết quả mong muốn
//    Không truy cập trực tiếp thuộc tính từ bên ngoài
//    Setter kiểm soát được dữ liệu
//    Hiểu rõ ý nghĩa của đóng gói
    static class Product{
       private int proID;
       private String proName;
       private double price;

        public Product(int proID, String proName, double price){
            this.proID = proID;
            this.proName = proName;
            setPrice(price);
        }

        public void setPrice(double price) {
            if(price > 0){
            this.price = price;
            }else{
                this.price = 0;
                System.out.println("Price phải lơn hơn 0!!!");
            }
        }
        public String getAllProduct(){
            return "proID:" + proID + "\nName: " + proName + "\nPrice: " + price;
        }
}

    public static void main(String[] args) {
        Product p1 = new Product(101, "iPhone 15", 2500000);
        System.out.println(p1.getAllProduct());

        //test set price < 0
        p1.setPrice(-500);
        System.out.println(p1.getAllProduct());
    }
}
