package base.spring.aop.util;

import base.spring.aop.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextUtil {
    private static final AnnotationConfigApplicationContext context;

    static {
        try {
            context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        } catch (Exception e) {
            throw new RuntimeException("Can't create AnnotationConfigApplicationContext object.", e);
        }
    }

    public static AnnotationConfigApplicationContext getContext() {
        return context;
    }
}
