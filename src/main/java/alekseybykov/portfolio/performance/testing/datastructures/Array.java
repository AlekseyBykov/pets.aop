//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.performance.testing.datastructures;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-05-30
 */
public class Array {

    private long[] arr;
    private int n;

    public Array(Integer max) {
        arr = new long[max];
        n = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for(j = 0; j < n; j++) {
            if(arr[j] == searchKey)
                break;
        }

        return j != n;
    }

    public void insert(long value) {
        arr[n] = value;
        n++;
    }

    public boolean delete(long value) {
        int j;

        for(j = 0; j < n; j++) {
            if(value == arr[j])
                break;
        }

        if(j == n) {
            return false;
        } else {
            for(int k = j; k < n; k++) {
                arr[k] = arr[k + 1];
            }
            n--;
            return true;
        }
    }
}
