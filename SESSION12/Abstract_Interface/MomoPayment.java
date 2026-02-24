package SESSION12.Abstract_Interface;

public class MomoPayment extends OnlinePayment{
    public MomoPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    public void pay(double amount) {
        System.out.println("MOMO THANH TOÁN");
        System.out.println("Số tiền thanh toán: "+ String.format("%,.0f", amount) + " VNĐ");
        System.out.println("Mã giao dịch: "+ transactionId);
    }
}
