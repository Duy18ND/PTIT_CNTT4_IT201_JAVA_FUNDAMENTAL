package SESSION14.ThucHanh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private Integer id;
    private String nameBook;
    private String author;
    private Date firstDate;
    private Date endDate;
    private int page;
    private double price;

    public Book() {}
    public Book(Integer id, String nameBook, String author, Date firstDate, Date endDate, int page, double price) {
        this.id = id;
        this.nameBook = nameBook;
        this.author = author;
        this.firstDate = firstDate;
        this.endDate = endDate;
        this.page = page;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "\nID: "+ id +
                "\nName: "+ nameBook +
                "\nAuthor: " + author +
                "\nFirstDate: "+ sdf.format(firstDate) +
                "\nEndDate: "+ sdf.format(endDate) +
                "\nPage: "+ page +
                "\nPrice: "+price + "\n";
    }
}
