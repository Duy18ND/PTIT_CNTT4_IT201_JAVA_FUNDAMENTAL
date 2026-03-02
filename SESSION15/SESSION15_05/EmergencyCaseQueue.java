package SESSION15.SESSION15_05;
import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        this.cases = new LinkedList<>();
    }

    public void addCase(EmergencyCase c) {
        cases.offer(c);
    }

    public EmergencyCase getNextCase() {
        return cases.poll();
    }
}