//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.aop;

import alekseybykov.portfolio.aop.config.AppConfiguration;
import alekseybykov.portfolio.aop.data.Array;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-05-30
 */
public class ArrayPerformanceTest {

    ApplicationContext context;

    Array array;

    @BeforeSuite
    public void setUp() {
        context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        array = context.getBean(Array.class);
    }

    @Test
    public void insert() {
        array.insert(76);
    }
}
