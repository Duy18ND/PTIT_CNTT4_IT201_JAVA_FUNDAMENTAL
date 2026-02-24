package SESSION12.DaHinh;

public class Main {
    static void main() {
        Employee[] empList = new Employee[3];
        empList[0] = new FullTimeEmployee("Đoàn Mạnh Duy", 500000, 23000);
        empList[1] = new PartTimeEmployee("Bùi Trần Mạnh Hùng", 200000, 23, 23000);
        empList[2] = new FullTimeEmployee("Cao Văn A", 300000, 23000);

        //Hiển thị
        System.out.println("BẢNG LƯƠNG THÁNG 3");
        for(Employee e : empList){
            System.out.println("Tên: "+ e.getName());
            System.out.println("Lương: "+ e.calculateSalary());
            System.out.println("---------------------------------------");
        }
    }
}
