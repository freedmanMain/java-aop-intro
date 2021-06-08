package base.spring.aop.model;

public abstract class AbstractLibrary {
    public abstract Book getBookFromLibrary(String title);

    public abstract void returnBookIntoLibrary(Book book);

    protected abstract void init();

    protected abstract void destroy();
}
