package SESSION09.SESSION09_05;

public class OfficeEmployee extends Employee {
    private double baseSalary;

    public OfficeEmployee() {
        super();
    }

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return String.format("%s (Office) - Lương: %,.0f", getName(), calculateSalary());
    }
}
