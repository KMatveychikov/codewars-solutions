import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Book {
    public Book(int year) {
        this.year = year;
    }

    private int year;
        private List<String> authors;



    public static Map<Integer, List<Book>> groupByYear(Set<Book> books) {
        Map<Integer, List<Book>> map;
        map = books.stream().collect(Collectors.groupingBy(Book::getYear));
        return map;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}



