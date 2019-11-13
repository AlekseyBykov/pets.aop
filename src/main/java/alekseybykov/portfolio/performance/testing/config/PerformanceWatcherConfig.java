package alekseybykov.portfolio.performance.testing.config;

import alekseybykov.portfolio.performance.testing.aspect.PerformanceWatcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("alekseybykov.portfolio.performance.testing")
public class PerformanceWatcherConfig {
    @Bean
    public PerformanceWatcher performanceWatcher() {
        return new PerformanceWatcher();
    }
}
