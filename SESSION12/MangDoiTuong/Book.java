package SESSION12.MangDoiTuong;

public class Book {
    private int id;
    private String tile;
    private String author;;
    private double price;

    public Book(){};

    public Book(int id, String tile, String author, double price) {
        this.id = id;
        this.tile = tile;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
