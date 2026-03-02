package SESSION15.SESSION15_06;

public class Ticket {
    private int ticketNumber;
    private String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    public int getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(int ticketNumber) { this.ticketNumber = ticketNumber; }
    public String getIssuedTime() { return issuedTime; }
    public void setIssuedTime(String issuedTime) { this.issuedTime = issuedTime; }

    @Override
    public String toString() {
        return "Số: " + ticketNumber + " (Cấp lúc: " + issuedTime + ")";
    }
}