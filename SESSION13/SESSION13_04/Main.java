package SESSION13.SESSION13_04;

import java.util.LinkedList;

public class Main {
    private LinkedList<String> patientQueue;

    public Main() {
        patientQueue = new LinkedList<>();
    }
    public void patientCheckIn(String name) {
        patientQueue.addLast("Đang khám: " + name);
        System.out.println("Đã tiếp nhận bệnh nhân thường: " + name);
    }

    public void emergencyCheckIn(String name) {
        patientQueue.addFirst("Đang cấp cứu: " + name);
        System.out.println("!! CẢNH BÁO: Đã chèn ca nguy kịch " + name + " vào đầu danh sách !!");
    }

    public void treatPatient() {
        if (patientQueue.isEmpty()) {
            System.out.println("Phòng chờ đang trống, bác sĩ có thể nghỉ ngơi.");
            return;
        }

        String patientToTreat = patientQueue.removeFirst();
        System.out.println(patientToTreat);
    }

    public static void main(String[] args) {
        Main er = new Main();

        System.out.println("--- QUÁ TRÌNH TIẾP NHẬN ---");
        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        System.out.println("\n--- BÁC SĨ BẮT ĐẦU LÀM VIỆC ---");
        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}