//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.performance.testing.config;

import alekseybykov.portfolio.performance.testing.datastructures.Array;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-05
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("alekseybykov.portfolio.performance.testing")
public class ArrayConfig {

    @Bean
    public Array array1000() {
        return new Array(1000);
    }

    @Bean
    public Array array10_000() {
        return new Array(10_000);
    }

    @Bean
    public Array array100_000() {
        return new Array(100_000);
    }

    @Bean
    public Array array1000_000() {
        return new Array(1000_000);
    }
}
