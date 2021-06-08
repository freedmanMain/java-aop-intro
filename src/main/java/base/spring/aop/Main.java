package base.spring.aop;

import base.spring.aop.model.AbstractLibrary;
import base.spring.aop.model.Book;
import base.spring.aop.util.AnnotationConfigApplicationContextUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            AnnotationConfigApplicationContextUtil.getContext();

    public static void main(String[] args) {
        AbstractLibrary universityLibraryBean =
                context.getBean("universityLibraryBean", AbstractLibrary.class);

        Book harryPotterAndPhilosophersStone =
                universityLibraryBean.getBookFromLibrary("Harry Potter and philosopher's stone");

        AbstractLibrary schoolLibraryBean =
                context.getBean("schoolLibraryBean", AbstractLibrary.class);

        Book geometryAndAlgebraForNewbies =
                schoolLibraryBean.getBookFromLibrary("Basic Economics Theory");

        context.close();
    }
}
