package base.spring.aop.model;

import base.spring.aop.storage.BookStorage;
import java.util.NoSuchElementException;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("universityLibraryBean")
public class UniversityLibrary extends AbstractLibrary {
    @Override
    public Book getBookFromLibrary(String title) {
        return BookStorage.books.stream()
                .filter(b -> b.getTitle().equals(title))
                .findFirst()
                .orElseThrow(() ->
                        new NoSuchElementException("Can't get book by title " + title));
    }

    @Override
    public void returnBookIntoLibrary(Book book) {
        BookStorage.books.add(book);
    }

    @PostConstruct
    @Override
    public void init() {
        System.out.println("UniversityLibrary init() method was called");
    }

    @PreDestroy
    @Override
    public void destroy() {
        System.out.println("UniversityLibrary destroy() method was called");
    }
}
