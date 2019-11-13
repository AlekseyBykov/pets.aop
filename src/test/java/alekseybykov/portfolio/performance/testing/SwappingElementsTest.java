package alekseybykov.portfolio.performance.testing;

import alekseybykov.portfolio.performance.testing.config.ArrayConfig;
import alekseybykov.portfolio.performance.testing.config.PerformanceWatcherConfig;
import alekseybykov.portfolio.performance.testing.datastructures.Array;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("Testing the swapping elements in array, O(1)")
@SpringBootTest(classes = {ArrayConfig.class, PerformanceWatcherConfig.class})
public class SwappingElementsTest {

    @Autowired
    protected Array array1000;

    @Autowired
    protected Array array10_000;

    @Autowired
    protected Array array100_000;

    @Autowired
    protected Array array1000_000;

    @Test
    void testSwappingElements() {
        array1000.swapElements(0, 999); // ...
        array10_000.swapElements(0, 9999); // 9900 ns
        array100_000.swapElements(0, 99999); // 7000 ns
        array1000_000.swapElements(0, 999999); // 6600 ns
    }
}
