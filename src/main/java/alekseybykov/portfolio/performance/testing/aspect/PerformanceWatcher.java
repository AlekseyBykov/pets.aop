//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.performance.testing.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-05-30
 */
@Aspect
public class PerformanceWatcher {

    @Around("@annotation(alekseybykov.portfolio.performance.testing.pointcut.WatchedInMillis)")
    public Object watchInMillis(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        long startTime = System.currentTimeMillis();

        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append(proceedingJoinPoint.getSignature().toShortString());
        sb.append(", ");
        sb.append((endTime - startTime));
        sb.append(" ms");

        System.out.println(sb.toString());

        return result;
    }

    @Around("@annotation(alekseybykov.portfolio.performance.testing.pointcut.WatchedInNanos)")
    public Object watchInNanos(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        long startTime = System.nanoTime();

        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        sb.append(proceedingJoinPoint.getSignature().toShortString());
        sb.append(", ");
        sb.append((endTime - startTime));
        sb.append(" ns");

        System.out.println(sb.toString());

        return result;
    }
}
