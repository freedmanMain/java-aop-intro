package base.spring.aop.aspect;

import base.spring.aop.util.AnnotationConfigApplicationContextUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    private static final Logger logger = LogManager.getLogger();

    @Around("base.spring.aop.aspect.LoggingPointcut.getBookFromLibraryPointcut()")
    public Object afterThrowingGetBookAdvice(ProceedingJoinPoint point)
            throws Throwable {
        Object targetMethodResult = null;
        try {
            targetMethodResult = point.proceed();
            logger.info("The " + targetMethodResult + " was borrowed from the library.");
        } catch (Exception e) {
            logger.error(point.getSignature().getName() + "method throw an exception.", e);
            AnnotationConfigApplicationContextUtil.getContext().close();
            throw new RuntimeException("Error! Can't find this book in storage" + e);
        }
        return targetMethodResult;
    }
}

