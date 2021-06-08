package base.spring.aop.storage;

import java.util.ArrayList;
import java.util.List;
import base.spring.aop.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookStorage {
    public static final List<Book> books;

    static {
        books = new ArrayList<>();
        books.add(new Book("Harry Potter and philosopher's stone"));
        books.add(new Book("Master and Margarita"));
        books.add(new Book("Biology for children"));
        books.add(new Book("Geometry and algebra for newbies"));
    }
}
