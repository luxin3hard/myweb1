package dispatcherservlet.config;

import dispatcherservlet.aop.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by lx on 10/04/2018.
 */
@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
    @Bean
    public MyInterceptor interceptor() {
        return new MyInterceptor();
    }
}
