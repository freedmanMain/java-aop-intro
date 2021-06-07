package base.spring.aop.model;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("universityLibraryBean")
public class UniversityLibrary extends AbstractLibrary {
    @Override
    public void getBookFromLibrary(String title) {
        System.out.println("Get book " + title
                + " from the university library.");
    }

    @Override
    public void returnBookIntoLibrary(String book) {
        System.out.println("Return book " + book
                + " into the university library.");
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
