package SESSION15.SESSION15_06;

import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {
    private Queue<Patient> waitingQueue;
    private int totalPatients;

    public PatientWaitingQueue() {
        this.waitingQueue = new LinkedList<>();
        this.totalPatients = 0;
    }

    public void addPatient(Patient patient) {
        waitingQueue.offer(patient);
        totalPatients++;
    }

    public Patient callNextPatient() {
        if (!waitingQueue.isEmpty()) {
            totalPatients--;
            return waitingQueue.poll();
        }
        return null;
    }

    public int getTotalPatients() {
        return totalPatients;
    }
}