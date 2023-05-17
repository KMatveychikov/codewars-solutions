import java.util.Set;

public class RGBToHEXConversion {

    public static void main(String[] args) {
        //System.out.println(convertRGBToString(-174, 175, 12));

        Book book1 = new Book(1997);
        Book book2 = new Book(1998);
        Book book3 = new Book(1999);
        Book book4 = new Book(1998);
        Book book5 = new Book(1997);


        Set<Book> books = Set.of(book1, book2, book3, book4, book5);

        System.out.println(Book.groupByYear(books));



    }




    public static String convertRGBToString(int r, int g, int b) {
        return (intToHex(r) + intToHex(g) + intToHex(b)).toUpperCase();
    }

    public static String intToHex(int i) {
        if (i < 0) i = 0;
        if (i > 255) i = 255;
        return Integer.toHexString(i / 16) + Integer.toHexString(i % 16);

    }

}
