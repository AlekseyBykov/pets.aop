//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.performance.testing.datastructures;

import alekseybykov.portfolio.performance.testing.pointcut.WatchedInNanos;

import java.util.Arrays;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-05-30
 */
public class Array {

    private long[] array;
    private int n;

    public Array(Integer max) {
        array = new long[max];
        n = max-1;
        fillArray();
    }

    private void fillArray() {
        Arrays.fill(array, 0);
    }

    public boolean find(long searchKey) {
        int j;
        for(j = 0; j < n; j++) {
            if(array[j] == searchKey)
                break;
        }

        return j != n;
    }

    public void insert(long value) {
        array[n] = value;
        n++;
    }

    public boolean delete(long value) {
        int j;

        for(j = 0; j < n; j++) {
            if(value == array[j])
                break;
        }

        if(j == n) {
            return false;
        } else {
            for(int k = j; k < n; k++) {
                array[k] = array[k + 1];
            }
            n--;
            return true;
        }
    }

    @WatchedInNanos
    public void swapElements(int i, int j) {
        long temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
