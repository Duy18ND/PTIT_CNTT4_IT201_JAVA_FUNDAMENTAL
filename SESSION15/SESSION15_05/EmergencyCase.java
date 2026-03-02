package SESSION15.SESSION15_05;

import SESSION15.SESSION15_06.Patient;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
    }

    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            return steps.pop();
        }
        return null;
    }

    public void displaySteps() {
        System.out.println("--- CÁC BƯỚC ĐIỀU TRỊ ---");
        System.out.println("Bệnh nhân: " + patient.getName());

        if (steps.isEmpty()) {
            System.out.println("(Chưa có bước điều trị nào)");
            return;
        }

        for (TreatmentStep step : steps) {
            System.out.println(step.toString());
        }
        System.out.println("-------------------------");
    }
}