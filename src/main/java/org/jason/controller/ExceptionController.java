package org.jason.controller;

import org.jason.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionController {

//    @ExceptionHandler({NullPointerException.class, RuntimeException.class})
//    public Object handlerNullPointException(Exception e) {
//        return "exception";
//    }

    //返回json格式数据
    @RequestMapping("/null")
    @ResponseBody
    public Result nullPointException() {
        throw new NullPointerException("未找到你要的资源");
    }

    //返回视图文件
    @RequestMapping("/runtime")
    public String rumtime() {
        throw new RuntimeException("运行时异常");
    }

}