package SESSION12.DaHinh;

public class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return bonus + baseSalary;
    }
}
