//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.performance.testing.config;

import alekseybykov.portfolio.performance.testing.aspect.PerformanceWatcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-05
 */
@Configuration
@ComponentScan("alekseybykov.portfolio.performance.testing")
public class PerformanceWatcherConfig {
    @Bean
    public PerformanceWatcher performanceWatcher() {
        return new PerformanceWatcher();
    }
}
