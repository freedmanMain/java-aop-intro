package base.spring.aop;

import base.spring.aop.model.Library;
import base.spring.aop.util.AnnotationConfigApplicationContextUtil;

public class Main {
    public static void main(String[] args) {
        Library libraryBean = AnnotationConfigApplicationContextUtil
                .getContext()
                .getBean("libraryBean", Library.class);
        libraryBean.getBook();
        libraryBean.insertBook();
        AnnotationConfigApplicationContextUtil.getContext().close();
    }
}
