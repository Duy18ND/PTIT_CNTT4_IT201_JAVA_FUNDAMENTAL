package SESSION14.DEMO.SapXepDanhSach;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private Integer id;
    private String name;
    private Date year;
    private Double price;

    public Product(Integer id, String name, Date year, Double price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        NumberFormat number = NumberFormat.getNumberInstance();

        return String.format("ID: %-3d | Tên: %-10s | Ngày: %s | Giá: %s VNĐ",
                id, name, sdf.format(year), number.format(price));
    }

}
