package SESSION09.SESSION09_05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new OfficeEmployee("Nguyen Van A", 10000000));
        employeeList.add(new ProductionEmployee("Tran Thi B", 300, 20000));
        employeeList.add(new ProductionEmployee("Le Van C", 150, 30000));
        employeeList.add(new OfficeEmployee("Pham Thi D", 15000000));

        System.out.println("Danh sách sinh viên");
        double totalSalary = 0;
        int index = 1;

        for(int i=0; i < employeeList.size(); i++){
            Employee emp = employeeList.get(i);

            System.out.println((i+1) + ". " + emp.toString());
            totalSalary += emp.calculateSalary();
        }

        System.out.println("\nTổng lương công ty: "+ totalSalary);
    }
}
