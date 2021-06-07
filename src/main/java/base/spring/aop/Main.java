package base.spring.aop;

import base.spring.aop.model.Library;
import base.spring.aop.util.AnnotationConfigApplicationContextUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            AnnotationConfigApplicationContextUtil.getContext();

    public static void main(String[] args) {
        Library libraryBean = context
                .getBean("libraryBean", Library.class);
        libraryBean.getBook();
        libraryBean.insertBook();
        context.close();
    }
}
