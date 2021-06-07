package base.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void base.spring.aop.model.AbstractLibrary.getBookFromLibrary(String))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt to get a book.");
    }

    @Before("execution(public void base.spring.aop.model.AbstractLibrary.returnBookIntoLibrary(String))")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: attempt to return book.");
    }
}

