package dispatcherservlet;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

/**
 * Created by lx on 17/03/2018.
 */
@Controller
public class HomeController implements BeanNameAware {

    @Override
    public void setBeanName(String s) {
        System.out.println("bean name is" + s);
    }

    @PostConstruct
    public void init() {
        System.out.println("HomeController init success");
    }

    @RequestMapping(value = "/mytest", method = RequestMethod.GET)
    public String home() {
        return "success";
    }

    @RequestMapping(value = "/getname/{name}", method = RequestMethod.GET)
    public String getName(@PathVariable String name) {
        throw new MyNameNotFoundException();
    }


    /**
     * 处理这个controller里面全部的 空指针异常
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    private String nullPointerExceptionHandle() {
        return "error/nullpointer";
    }

}
