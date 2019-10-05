//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.performance.testing;

import alekseybykov.portfolio.performance.testing.algorithms.sort.Sort;
import alekseybykov.portfolio.performance.testing.config.AppConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-05-10
 */
@DisplayName("Testing the selection sorting algorithm, O(n^2)")
@SpringBootTest(classes = AppConfiguration.class)
class SelectionSortPerformanceTest {

    @Autowired
    protected Sort selectionSort1000;

    @Autowired
    protected Sort selectionSort10000;

    @Autowired
    protected Sort selectionSort100000;

    @Test
    void testSelectionSorting() {
        selectionSort1000.sort(); // 7 ms
        selectionSort10000.sort(); // 25 ms
        selectionSort100000.sort(); // 1758 ms
    }
}
