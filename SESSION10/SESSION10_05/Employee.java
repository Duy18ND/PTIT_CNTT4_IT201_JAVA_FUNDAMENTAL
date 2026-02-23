package SESSION10.SESSION10_05;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Lương cơ bản: " + String.format("%,.0f", baseSalary) + " VNĐ");
    }
}