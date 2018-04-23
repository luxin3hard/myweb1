package dispatcherservlet.aop;

import dispatcherservlet.MyService;
import dispatcherservlet.config.JavaConfig;
import dispatcherservlet.config.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by luxin on 2018/4/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebConfig.class)
public class MyInterceptorTest {

    @Test
    public void myInterceptorTest() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WebConfig.class);

        MyService myService = applicationContext.getBean("myService", MyService.class);
        myService.move();
    }


}