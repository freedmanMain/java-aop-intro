package base.spring.aop.model;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("libraryBean")
public class Library {
    public void insertBook() {
        System.out.println("Inserted the book");
    }
    public void getBook() {
        System.out.println("Got the book");
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
