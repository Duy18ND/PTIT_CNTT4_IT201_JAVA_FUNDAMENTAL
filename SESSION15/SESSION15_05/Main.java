package SESSION15.SESSION15_05;

import SESSION15.SESSION15_06.Patient;

public class Main {
    public static void main(String[] args) {
        EmergencyCaseQueue erQueue = new EmergencyCaseQueue();

        Patient p1 = new Patient("BN01", "Nguyễn Văn A", 30, "Nam");
        EmergencyCase case1 = new EmergencyCase(p1);

        case1.addStep(new TreatmentStep("Đo huyết áp, nhịp tim", "09:00"));
        case1.addStep(new TreatmentStep("Truyền nước biển", "09:05"));

        erQueue.addCase(case1);

        EmergencyCase activeCase = erQueue.getNextCase();

        if (activeCase != null) {
            activeCase.displaySteps();

            System.out.println("\n=> Bác sĩ chỉ định hủy bước truyền nước (Undo)...");
            activeCase.undoStep();

            System.out.println("\n=> Cập nhật lại:");
            activeCase.displaySteps();
        }
    }
}