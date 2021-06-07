package base.spring.aop.model;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void insertBook() {
        System.out.println("Inserted the book");
    }
    public void getBook() {
        System.out.println("Got the book");
    }
}
