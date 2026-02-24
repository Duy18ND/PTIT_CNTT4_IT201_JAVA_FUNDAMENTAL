package SESSION12.Abstract_Interface;

public class Main {
    static void main() {
        OnlinePayment o1 = new MomoPayment("MOMO-12345");
        OnlinePayment o2 = new VNPayPayment("VNPAY-99999");

        o1.pay(500000);

        System.out.println("---------------------------");

        o2.pay(1500000);
    }
}
