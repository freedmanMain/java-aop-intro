package base.spring.aop.model;

public abstract class AbstractLibrary {
    public abstract void getBookFromLibrary(String title);

    public abstract void returnBookIntoLibrary(String book);
}
