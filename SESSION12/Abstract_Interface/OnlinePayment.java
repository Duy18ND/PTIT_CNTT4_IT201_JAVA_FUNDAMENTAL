package SESSION12.Abstract_Interface;

public abstract class OnlinePayment implements IPayment {
    protected String transactionId;

    public OnlinePayment(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
