package SESSION05.SESSION05_04;

public class SESSION06_04 {
    static class Employee{
        int empID;
        String empName;
        double empSalary;

        public Employee(){};

        public Employee(int empID, String empName, double empSalary) {
            this.empID = empID;
            this.empName = empName;
            this.empSalary = empSalary;
        }

        public Employee(int empID, String empName){
            this.empID = empID;
            this.empName = empName;
            this.empSalary = 0;
        }
        public String getAllEmployee(){
            return "\nempID: "+ (empID) + "\nempName: " + (empName == null || empName.trim().isEmpty() ? "userName###" : empName) + "\nempSalary: " + empSalary + "VNĐ";
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(1, "Đoàn Mạnh Duy");
        Employee e3 = new Employee(2, "Đoàn Mạnh Duy",20000 );

        System.out.println(e1.getAllEmployee());
        System.out.println(e2.getAllEmployee());
        System.out.println(e3.getAllEmployee());
    }
}
