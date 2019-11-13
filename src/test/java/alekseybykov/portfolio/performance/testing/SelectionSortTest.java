package alekseybykov.portfolio.performance.testing;

import alekseybykov.portfolio.performance.testing.algorithms.sort.Sort;
import alekseybykov.portfolio.performance.testing.config.PerformanceWatcherConfig;
import alekseybykov.portfolio.performance.testing.config.SelectionSortConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("Testing the selection sorting algorithm, O(n^2)")
@SpringBootTest(classes = {SelectionSortConfig.class, PerformanceWatcherConfig.class})
class SelectionSortTest {

    @Autowired
    protected Sort selectionSort1000;

    @Autowired
    protected Sort selectionSort10_000;

    @Autowired
    protected Sort selectionSort100_000;

    @Test
    void testSelectionSorting() {
        selectionSort1000.sort(); // 7 ms
        selectionSort10_000.sort(); // 25 ms
        selectionSort100_000.sort(); // 1758 ms
    }
}
