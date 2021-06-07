package base.spring.aop.aspect;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    private static final Logger logger = LogManager.getLogger();
    private static final String EMPTY_LINE = System.lineSeparator();

    @Before("base.spring.aop.aspect.LoggingPointcut.getBookFromLibraryPointcut()")
    public void beforeGetBookAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.info("method=" + signature.getName() + " prepare to call");
        logger.info("method signature=" + signature);
        logger.info("method params=" + Arrays.toString(signature.getParameterNames()) + EMPTY_LINE);
    }

    @Before("base.spring.aop.aspect.LoggingPointcut.returnBookIntoLibraryPointcut()")
    public void beforeReturnBookAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.info("method=" + signature.getName() + " prepare to call");
        logger.info("method signature=" + signature);
        logger.info("method params=" + Arrays.toString(signature.getParameterNames()) + EMPTY_LINE);
    }

    /*
    @Before("base.spring.aop.aspect.LoggingPointcut.getAndReturnBookPointcut()")
    public void beforeReturnAndGetBookAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.info("method=" + signature.getName() + " was called");
        logger.info("method signature=" + signature);
        logger.info("method params=" + Arrays.toString(signature.getParameterNames()));
    }
    */

    @After("base.spring.aop.aspect.LoggingPointcut.getBookFromLibraryPointcut()")
    public void afterGetBookAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.info("method=" + signature.getName() + " was successfully completed.");
        logger.info("method signature=" + signature);
        logger.info("method params=" + Arrays.toString(signature.getParameterNames()) + EMPTY_LINE);
    }

    @After("base.spring.aop.aspect.LoggingPointcut.returnBookIntoLibraryPointcut()()")
    public void afterReturnBookAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.info("method=" + signature.getName() + " was successfully completed.");
        logger.info("method signature=" + signature);
        logger.info("method params=" + Arrays.toString(signature.getParameterNames()) + EMPTY_LINE);
    }

    /*
    @After("base.spring.aop.aspect.LoggingPointcut.getAndReturnBookPointcut()")
    private void afterReturnAndGetBookAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        logger.info("method=" + signature.getName() + " was successfully completed.");
        logger.info("method signature=" + signature);
        logger.info("method params=" + Arrays.toString(signature.getParameterNames()));
    }
   */
}

