package dispatcherservlet.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by lx on 16/03/2018.
 */
@Configuration
//加载bean @ComponentScan("dispatcherservlet") 等同于@ComponentScan(basePackages = {"dispatcherservlet"}}
//rootConfig和webConfig的区别
//https://blog.csdn.net/crazylzxlzx/article/details/53668016
@ComponentScan(basePackages = {"dispatcherservlet"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {EnableWebMvc.class,EnableAspectJAutoProxy.class})})
public class RootConfig {
}
