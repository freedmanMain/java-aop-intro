package base.spring.aop.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger logger = LogManager.getLogger();

    @Pointcut("execution(public void base.spring.aop.model.AbstractLibrary.getBookFromLibrary(String))")
    private void getBookFromLibraryPointcut() {
    }

    @Pointcut("execution(public void base.spring.aop.model.AbstractLibrary.returnBookIntoLibrary(String))")
    private void returnBookIntoLibraryPointcut() {
    }

    @Pointcut("getBookFromLibraryPointcut() || returnBookIntoLibraryPointcut()")
    private void getAndReturnBookPointcut() {
    }

    @Before("getBookFromLibraryPointcut()")
    public void beforeGetBookAdvice() {
        logger.info("beforeGetBookAdvice: "
                + "Method getBookFromLibrary was successfully completed.");
    }

    @Before("returnBookIntoLibraryPointcut()")
    public void beforeReturnBookAdvice() {
        logger.info("beforeReturnBookAdvice: "
                + "Method returnBookIntoLibrary was successfully completed.");
    }

    @Before("getAndReturnBookPointcut()")
    private void beforeReturnAndGetBookAdvice() {
        logger.info("beforeReturnAndGetBookAdvice: "
                + "Method getBookFromLibrary or returnBookIntoLibrary was successfully completed.");
    }
}

