package base.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Pointcut("execution(public void base.spring.aop.model.AbstractLibrary.getBookFromLibrary(String))")
    private void getBookFromLibraryPointcut() {
    }

    @Pointcut("execution(public void base.spring.aop.model.AbstractLibrary.returnBookIntoLibrary(String))")
    private void returnBookIntoLibraryPointcut() {
    }

    @Before("getBookFromLibraryPointcut()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt to get a book.");
    }

    @Before("returnBookIntoLibraryPointcut()")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: attempt to return book.");
    }
}

