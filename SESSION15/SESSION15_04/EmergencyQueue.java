package SESSION15.SESSION15_04;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {
    private Queue<EmergencyPatient> emergencyQueue;
    private Queue<EmergencyPatient> normalQueue;

    public EmergencyQueue() {
        this.emergencyQueue = new LinkedList<>();
        this.normalQueue = new LinkedList<>();
    }

    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQueue.offer(p);
        } else {
            normalQueue.offer(p);
        }
    }

    public EmergencyPatient callNextPatient() {
        if (!emergencyQueue.isEmpty()) {
            return emergencyQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            return normalQueue.poll();
        }
        return null;
    }

    public void displayQueue() {
        System.out.println("--- BỆNH NHÂN CẤP CỨU ĐANG CHỜ ---");
        if (emergencyQueue.isEmpty()) {
            System.out.println("(Trống)");
        } else {
            for (EmergencyPatient p : emergencyQueue) {
                System.out.println(p.toString());
            }
        }

        System.out.println("--- BỆNH NHÂN THÔNG THƯỜNG ĐANG CHỜ ---");
        if (normalQueue.isEmpty()) {
            System.out.println("(Trống)");
        } else {
            for (EmergencyPatient p : normalQueue) {
                System.out.println(p.toString());
            }
        }
        System.out.println("--------------------------------------");
    }
}
