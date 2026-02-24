package SESSION12.DaHinh;

public class PartTimeEmployee extends Employee{
    private int workHours;
    private int hourlyRate;

    public PartTimeEmployee(String name, double baseSalary, int workHours, int hourlyRate) {
        super(name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }
}
