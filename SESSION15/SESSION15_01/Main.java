package SESSION15.SESSION15_01;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory record = new MedicalRecordHistory();

        record.addEdit(new EditAction("Cập nhật chẩn đoán: Cúm mùa", "08:00"));
        record.addEdit(new EditAction("Kê đơn thuốc: Paracetamol", "08:15"));
        record.addEdit(new EditAction("Chỉ định: Xét nghiệm máu", "08:30"));

        System.out.println("\n--- TRƯỚC KHI UNDO ---");
        record.displayHistory();


        record.undoEdit();
        System.out.println("\n--- SAU KHI UNDO ---");
        record.displayHistory();

        System.out.println("\nThao tác trên cùng hiện tại là: " + record.getLatestEdit().getDescription());
    }
}