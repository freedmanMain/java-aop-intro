package base.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt to get a book.");
    }

    @Before("execution(public void insertBook())")
    public void beforeInsertBookAdvice() {
        System.out.println("beforeInsertBookAdvice: attempt to insert a book.");
    }
}

