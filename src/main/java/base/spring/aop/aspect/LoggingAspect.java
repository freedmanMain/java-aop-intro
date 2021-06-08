package base.spring.aop.aspect;

import base.spring.aop.model.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger logger = LogManager.getLogger();

    @AfterReturning(pointcut = "base.spring.aop.aspect.LoggingPointcut.getBookFromLibraryPointcut()",
            returning = "book")
    public void afterReturningGetBookAdvice(JoinPoint joinPoint, Book book) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.info("The " + book + " was borrowed from the library.");
    }

    @AfterThrowing(pointcut = "base.spring.aop.aspect.LoggingPointcut.getBookFromLibraryPointcut()",
            throwing = "exception")
    public void afterThrowingGetBookAdvice(JoinPoint joinPoint, NoSuchElementException exception) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.error(signature.getName() + " method throw an exception. Message: " + exception.getMessage(), exception);
    }
}

