package SESSION07.SESSION07_04;
public class ClassRoom {
    public static double classFund = 0;

    private String Name;
    private double monneyPaid;
;
    public ClassRoom(String Name, double monneyPaid){
        this.Name = Name;
        this.monneyPaid = monneyPaid;
        DongTienQuy(monneyPaid);
    };

    public void DongTienQuy(double monney){
        if(monney > 0){
            classFund += monney;
            System.out.println("Name: "+ Name);
            System.out.println("Tiền đã đóng: "+ monneyPaid);
        }else{
            System.out.println("Số tiền đóng quỹ phải lớn hơn 0");
        }
    }

    public static void displayClassFund(){
        System.out.print("Tổng Tiền Quỹ: " + classFund + " VNĐ");
    }
}
