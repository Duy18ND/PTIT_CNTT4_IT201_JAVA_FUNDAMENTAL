package SESSION15.SESSION15_06;

public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();
        PatientWaitingQueue waitingQueue = new PatientWaitingQueue();
        UndoManager undoManager = new UndoManager(5);
        MedicalRecordHistory recordHistory = new MedicalRecordHistory("BA001");

        System.out.println("=== 1. HỆ THỐNG PHÁT SỐ VÀ XẾP HÀNG ===");
        Ticket t1 = ticketSystem.issueTicket("08:00");
        System.out.println("Cấp phát " + t1.toString());

        Patient p1 = new Patient("BN01", "Nguyễn Vă A", 30, "Nam");
        waitingQueue.addPatient(p1);
        System.out.println("Đã thêm bệnh nhân vào hàng đợi. Đang chờ: " + waitingQueue.getTotalPatients() + " người");

        System.out.println("\n=== 2. GỌI BỆNH NHÂN VÀO KHÁM ===");
        Ticket currentTicket = ticketSystem.callNextTicket();
        Patient currentPatient = waitingQueue.callNextPatient();
        System.out.println("Đang gọi " + currentTicket.toString() + " | Bệnh nhân: " + currentPatient.toString());

        System.out.println("\n=== 3. HỆ THỐNG NHẬP LIỆU (PHÁT HIỆN LỖI VÀ UNDO) ===");
        System.out.println("Thông tin ban đầu: " + currentPatient.toString());

        InputAction fixNameAction = new InputAction("name", "Nguyễn Vă A", "Nguyễn Văn A", "08:05");
        undoManager.recordAction(fixNameAction);
        currentPatient.setName("Nguyễn Văn A");
        System.out.println("Lễ tân sửa lỗi chính tả tên: " + currentPatient.toString());

        InputAction wrongAgeAction = new InputAction("age", "30", "300", "08:06");
        undoManager.recordAction(wrongAgeAction);
        currentPatient.setAge(300);
        System.out.println("Lễ tân lỡ tay gõ nhầm tuổi: " + currentPatient.toString());

        System.out.println("--- Thực hiện Undo thao tác gõ nhầm ---");
        InputAction undoneAction = undoManager.undo();
        if (undoneAction != null) {
            currentPatient.setAge(Integer.parseInt(undoneAction.getOldValue()));
            System.out.println("Khôi phục thành công! Thông tin chuẩn: " + currentPatient.toString());
        }

        System.out.println("\n=== 4. BÁC SĨ GHI NHẬN LỊCH SỬ BỆNH ÁN ===");
        EditAction action1 = new EditAction("Đo huyết áp: 120/80", "BS.Hùng", "08:10");
        recordHistory.addEdit(action1);
        System.out.println("Lưu lịch sử: " + action1.toString());

        EditAction action2 = new EditAction("Kê đơn: Paracetamol", "BS.Hùng", "08:15");
        recordHistory.addEdit(action2);
        System.out.println("Lưu lịch sử: " + action2.toString());
    }
}