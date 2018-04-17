package dispatcherservlet;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by lx on 25/03/2018.
 */
//当遇到这种异常的时候,会自动映射到404这个状态码上
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "name not found.")
public class MyNameNotFoundException extends RuntimeException {
}
