package SESSION16.ThucHanh;

public class ElectronicProduct extends Product{
    private int warrantyMonths;

    public ElectronicProduct() {super();}

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    double calculateFinalPrice() {
        if(warrantyMonths > 12){
            return getPrice() + 1000000;
        }
        return getPrice();
    }

    @Override
    void displayInfo() {
        System.out.println("ID: "+ getId());
        System.out.println("Name: "+ getName());
        System.out.println("Price: "+ getPrice());
        System.out.println("WarrantyMonths: "+ getWarrantyMonths());
    }
}
