package dispatcherservlet;


import dispatcherservlet.config.RootConfig;
import dispatcherservlet.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;


/**
 * Created by lx on 01/03/2018.
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //设置映射规则,将dispatcher映射到/
        return new String[]{"/"};
    }

    /**
     * 设置servlet的诸多属性,如设置是否是支持multipart的请求和上传
     *
     * @param registration
     */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {

        registration.setLoadOnStartup(0);
        registration.setMultipartConfig(new MultipartConfigElement("tmp/uploads"));

    }
}
