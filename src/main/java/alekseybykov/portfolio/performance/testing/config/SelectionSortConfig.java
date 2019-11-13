package alekseybykov.portfolio.performance.testing.config;

import alekseybykov.portfolio.performance.testing.algorithms.sort.Sort;
import alekseybykov.portfolio.performance.testing.algorithms.sort.impl.SelectionSort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("alekseybykov.portfolio.performance.testing")
public class SelectionSortConfig {
    @Bean
    public Sort selectionSort1000() {
        return new SelectionSort(new int[1000]);
    }

    @Bean
    public Sort selectionSort10_000() {
        return new SelectionSort(new int[10_000]);
    }

    @Bean
    public Sort selectionSort100_000() {
        return new SelectionSort(new int[100_000]);
    }
}
