package alekseybykov.portfolio.aop.pointcut;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-05-30
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface WatchedInMillis {  }