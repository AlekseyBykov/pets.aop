//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.performance.testing.config;

import alekseybykov.portfolio.performance.testing.algorithms.sort.Sort;
import alekseybykov.portfolio.performance.testing.algorithms.sort.impl.SelectionSort;
import alekseybykov.portfolio.performance.testing.aspect.PerformanceWatcher;
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
    public PerformanceWatcher performanceWatcher() {
        return new PerformanceWatcher();
    }

    @Bean
    public Sort selectionSort1000() {
        return new SelectionSort(new int[1000]);
    }

    @Bean
    public Sort selectionSort10000() {
        return new SelectionSort(new int[10000]);
    }

    @Bean
    public Sort selectionSort100000() {
        return new SelectionSort(new int[100000]);
    }
}
