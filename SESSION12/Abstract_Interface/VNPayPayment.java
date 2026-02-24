package SESSION12.Abstract_Interface;

public class VNPayPayment extends OnlinePayment {
    public VNPayPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    public void pay(double amount) {
        System.out.println("VNPAY THANH TOÁN");
        System.out.println("Số tiền thanh toán: "+ String.format("%,.0f", amount) + " VNĐ");
        System.out.println("Mã giao dịch: "+ transactionId);
    }
}
