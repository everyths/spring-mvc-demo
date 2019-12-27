package org.jason.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public Result nullPointException(NullPointerException e) throws IOException {
        return Result.fail(e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public String runtimeException(RuntimeException e) {
        return "exception";
    }
}