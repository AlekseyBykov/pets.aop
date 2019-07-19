package alekseybykov.portfolio.aop.config;

import alekseybykov.portfolio.aop.aspect.PerformanceWatcher;
import alekseybykov.portfolio.aop.data.Array;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-05-30
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("alekseybykov.portfolio.aop")
public class AppConfiguration {

    @Bean
    public Array array() {
        return new Array(100);
    }

    @Bean
    public PerformanceWatcher performanceWatcher() {
        return new PerformanceWatcher();
    }
}