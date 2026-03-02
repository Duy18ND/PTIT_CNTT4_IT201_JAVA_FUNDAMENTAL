package SESSION15.SESSION15_02;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        this.queue = new LinkedList<>();
    }

    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Lễ tân: Đã nhận bệnh nhân [" + p.getName() + "] vào hàng đợi.");
    }

    public Patient callNextPatient() {
        //Kiểm tra danh sách
        if(isEmpty()){
            System.out.println("Danh sách rỗng!");
            return null;
        }
        Patient p = queue.poll();
        return p;
    }

    public Patient peekNextPatient(){
        // Kiểm tra rỗng
        if(isEmpty()){
            System.out.println("Danh sách rỗng!");
            return null;
        }
        Patient p = queue.peek();
        return p;

    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.println("Danh sách bệnh nhân");
        for(Patient p: queue){
            System.out.println("ID: "+ p.getId()+ " - Name: "+ p.getName()+ " - Age: "+ p.getAge());
        }
    }
}
