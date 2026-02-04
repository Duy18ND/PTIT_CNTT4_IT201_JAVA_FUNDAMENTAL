package SESSION09.TongHop;

import java.util.Scanner;

public class Employee {
    private String empName;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String empName, double basicSalary) {
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        empName = sc.nextLine();

        System.out.print("Nhập lương cơ bản: ");
        basicSalary = sc.nextDouble();

        sc.nextLine();
    }
    public void display() {
        System.out.println("Tên nhân viên: " + empName);
        System.out.printf("Lương cơ bản: %.2f\n", basicSalary);
        System.out.printf("Tổng lương thực nhận: %.2f\n", calSalary());
    }

    public double calSalary() {
        return this.basicSalary;
    }
}
