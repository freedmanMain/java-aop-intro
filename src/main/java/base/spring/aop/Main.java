package base.spring.aop;

import base.spring.aop.model.AbstractLibrary;
import base.spring.aop.util.AnnotationConfigApplicationContextUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            AnnotationConfigApplicationContextUtil.getContext();

    public static void main(String[] args) {
        AbstractLibrary universityLibraryBean = context.getBean("universityLibraryBean", AbstractLibrary.class);
        AbstractLibrary schoolLibraryBean = context.getBean("schoolLibraryBean", AbstractLibrary.class);

        universityLibraryBean.getBookFromLibrary("Harry Potter and philosopher's stone");
        universityLibraryBean.returnBookIntoLibrary("Master and Margarita");
        schoolLibraryBean.getBookFromLibrary("Biology for children");
        schoolLibraryBean.returnBookIntoLibrary("Geometry and algebra for newbies");

        context.close();
    }
}
