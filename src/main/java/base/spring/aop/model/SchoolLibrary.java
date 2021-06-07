package base.spring.aop.model;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary {
    @Override
    public void getBookFromLibrary(String title) {
        System.out.println("Get book " + title
                + " from the school library.");
    }

    @Override
    public void returnBookIntoLibrary(String book) {
        System.out.println("Return book " + book
                + " into the school library.");
    }

    @PostConstruct
    public void init() {
        System.out.println("SchoolLibrary init() method was called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SchoolLibrary destroy() method was called");
    }
}
