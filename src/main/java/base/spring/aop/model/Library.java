package base.spring.aop.model;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("libraryBean")
public class Library {
    public void insertBook() {
        System.out.println("Insert book to the shelf.");
    }
    public void getBook() {
        System.out.println("Get the book from the shelf.");
    }

    @PostConstruct
    public void init() {
        System.out.println("Library init() method was called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Library destroy() method was called");
    }
}
