package com.alekseybykov.examples.aop.config;

import com.alekseybykov.examples.aop.aspect.PerformanceWatcher;
import com.alekseybykov.examples.aop.data.Array;
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
@ComponentScan("com.alekseybykov.examples.aop")
public class AppConfig {

    @Bean
    public Array array() {
        return new Array(100);
    }

    @Bean
    public PerformanceWatcher performanceWatcher() {
        return new PerformanceWatcher();
    }
}