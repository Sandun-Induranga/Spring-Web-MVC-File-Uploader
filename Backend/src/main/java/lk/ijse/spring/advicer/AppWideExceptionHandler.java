package lk.ijse.spring.advicer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {
    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void handleMyExceptions(RuntimeException e){
        System.out.println(e.getMessage());
//        return new ResponseUtil("Error", e.getMessage(), "");
    }

}
