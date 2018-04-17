package dispatcherservlet;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by lx on 25/03/2018.
 */
//这个类,处理所有控制器额度异常
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = NullPointerException.class)
    public String nullPointExceptionHandle(){
        return "error/null";
    }

}
