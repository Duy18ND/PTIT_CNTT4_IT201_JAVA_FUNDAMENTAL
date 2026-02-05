package SESSION09.SESSION09_05;

public class ProductionEmployee extends Employee{
    private int numOfProducts;
    private double price;

    public ProductionEmployee() {
    }

    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }

    @Override
    public String toString() {
        return String.format("%s (Production) - Lương: %,.0f (%d sản phẩm * %,.0f)",
                getName(), calculateSalary(), numOfProducts, price);
    }
}
