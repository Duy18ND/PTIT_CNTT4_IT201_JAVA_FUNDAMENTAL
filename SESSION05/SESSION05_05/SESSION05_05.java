package SESSION05.SESSION05_05;

public class SESSION05_05 {
    static class Book {
        private int bookId;
        private String title;
        private String author;
        private double price;

        public Book(int bookId, String title, String author, double price) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.price = price;
        }
        public String getAllBook(){
            return "ID: " + bookId + "\nTitle: " + title + "\nAuthor: " + author + "\nPrice: " + price;
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book(101, "Lập trình Java", "Duy18nd", 200000);
        System.out.println(b1.getAllBook());
    }
}
