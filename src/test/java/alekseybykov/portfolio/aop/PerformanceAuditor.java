package alekseybykov.portfolio.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import static java.lang.String.format;

/**
 * @author Aleksey Bykov
 * @since 19.05.2020
 */
@Aspect
public class PerformanceAuditor {

	/**
	 * Performance tracking for all the methods marked with @Test.
	 * As JUnit tests are not Spring beans we need pure AspectJ and load-time weaver.
	 */
	@Around("execution(* *(..)) && @annotation(org.junit.Test)")
	public Object auditJUnitTests(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		System.out.println(format("Performance tracking: %s, %d ms", joinPoint, timeTaken));
		return result;
	}
}
