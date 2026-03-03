package SESSION16.ThucHanh;

public class FoodProduct extends Product{
    private int discountPercent;

    public FoodProduct() {super();}

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    double calculateFinalPrice() {
        return getPrice() - (getPrice() * discountPercent / 100);
    }

    @Override
    void displayInfo() {
        System.out.println("ID: "+ getId());
        System.out.println("Name: "+ getName());
        System.out.println("Price: "+ getPrice());
        System.out.println("DiscountPercent: "+ discountPercent);
    }
}
