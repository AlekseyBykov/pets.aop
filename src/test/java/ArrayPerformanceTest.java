import com.alekseybykov.examples.aop.config.AppConfig;
import com.alekseybykov.examples.aop.data.Array;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ArrayPerformanceTest {

    ApplicationContext context;

    Array array;

    @BeforeSuite
    public void setUp() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        array = context.getBean(Array.class);
    }

    @Test
    public void insert() {
        array.insert(76);
    }

}
