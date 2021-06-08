package base.spring.aop.aspect;

import base.spring.aop.util.AnnotationConfigApplicationContextUtil;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class CloseContextAspect {
    @AfterThrowing(pointcut = "base.spring.aop.aspect.LoggingPointcut.getBookFromLibraryPointcut()")
    public void afterThrowingCloseContextAdvice() {
        AnnotationConfigApplicationContextUtil.getContext().close();
    }
}
