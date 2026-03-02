package SESSION15.SESSION15_06;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {
    private Queue<Ticket> ticketQueue;
    private int currentNumber;

    public TicketSystem() {
        this.ticketQueue = new LinkedList<>();
        this.currentNumber = 0;
    }

    public Ticket issueTicket(String time) {
        currentNumber++;
        Ticket newTicket = new Ticket(currentNumber, time);
        ticketQueue.offer(newTicket);
        return newTicket;
    }

    public Ticket callNextTicket() {
        return ticketQueue.poll();
    }
}