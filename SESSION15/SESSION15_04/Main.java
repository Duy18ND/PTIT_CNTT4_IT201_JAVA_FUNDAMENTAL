package SESSION15.SESSION15_04;

public class Main {
    static void main(String[] args) {
     EmergencyQueue queue = new EmergencyQueue();
     queue.addPatient(new EmergencyPatient("BN01", "Đỗ Văn A", 2));
     queue.addPatient(new EmergencyPatient("BN02", "Nguyễn Văn B", 1));
     queue.addPatient(new EmergencyPatient("BN03", "Đỗ Văn D", 3));
     queue.addPatient(new EmergencyPatient("BN04", "Nguyễn Văn C", 1));


     //Hiển thị
        queue.displayQueue();
        EmergencyPatient p1 = queue.callNextPatient();
        if (p1 != null) System.out.println("Mời: " + p1.toString());

        EmergencyPatient p2 = queue.callNextPatient();
        if (p2 != null) System.out.println("Mời: " + p2.toString());

        EmergencyPatient p3 = queue.callNextPatient();
        if (p3 != null) System.out.println("Mời: " + p3.toString());
    }
}
