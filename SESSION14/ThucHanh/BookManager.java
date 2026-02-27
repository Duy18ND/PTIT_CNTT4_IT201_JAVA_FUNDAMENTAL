package SESSION14.ThucHanh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookManager {
    public static void main(String[] args) throws ParseException {
        List<Book> listBook = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        listBook.add(new Book(1, "Doraemon", "Duy", sdf.parse("21/02/2025"), sdf.parse("21/02/2026"), 40, 26000));
        listBook.add(new Book(2, "Dragon Ball Z", "Hung", sdf.parse("28/05/2019"), sdf.parse("21/02/2023"), 34, 10000));
        listBook.add(new Book(3, "One Piece", "Oda", sdf.parse("29/04/2013"), sdf.parse("29/04/2015"), 23, 14000));
        listBook.add(new Book(4, "Dragon Ball Saga", "Hung", sdf.parse("01/12/2023"), sdf.parse("01/12/2024"), 28, 18000));

        System.out.println("\nDANH SÁCH BAN ĐẦU");
        for(Book b: listBook){
            System.out.println(b.toString());
        }

        System.out.println("Sắp xếp danh sách tăng dần theo tên");
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNameBook().compareTo(o2.getNameBook());
            }
        };
        listBook.sort(comparator);
        for(Book b: listBook){
            System.out.println(b.toString());
        }

        System.out.println("Sắp xếp danh sách giảm dần theo giá tiền");
        Comparator<Book> comparator1 = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getNameBook().compareTo(o1.getNameBook());
            }
        };
        listBook.sort(comparator1);
        for(Book b: listBook){
            System.out.println(b.toString());
        }
    }
}
