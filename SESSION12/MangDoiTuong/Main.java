package SESSION12.MangDoiTuong;

public class Main {
    static void main() {
        Book b1 = new Book(1, "Conan", "Đoàn", 20000);
        Book b2 = new Book(2, "Shin", "Huy", 23000);
        Book b3 = new Book(3, "Doraemon", "Duy", 15000);
        Book[] bookList = {b1, b2, b3};
        Book maxPrice = bookList[0];

//        for (int i = 0; i < bookList.length; i++) {
//            if (bookList[i].getPrice() > maxPrice.getPrice()) {
//                maxPrice = bookList[i];
//            }
//        }

        for(Book b : bookList){
            if(b.getPrice() > maxPrice.getPrice()){
                maxPrice = b;
            }
        }
        System.out.println("Book có giá cao nhất");
        System.out.println("ID: "+ maxPrice.getId());
        System.out.println("ID: "+ maxPrice.getAuthor());
        System.out.println("ID: "+ maxPrice.getTile());
        System.out.println("ID: "+ maxPrice.getPrice());
    }
}
