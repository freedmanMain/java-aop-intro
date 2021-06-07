package base.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class LoggingPointcut {
    @Pointcut("execution(public void base.spring.aop.model.AbstractLibrary.getBookFromLibrary(String))")
    public void getBookFromLibraryPointcut() {
    }

    @Pointcut("execution(public void base.spring.aop.model.AbstractLibrary.returnBookIntoLibrary(String))")
    public void returnBookIntoLibraryPointcut() {
    }

    @Pointcut("getBookFromLibraryPointcut() || returnBookIntoLibraryPointcut()")
    public void getAndReturnBookPointcut() {
    }
}
