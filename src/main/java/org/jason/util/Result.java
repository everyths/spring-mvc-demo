package org.jason.util;

import lombok.Data;

/**
 * //TODO
 *
 * @author: linhj
 * @Date: 2019/12/24 23:09
 */
@Data
public class Result<T> {
    private static final Integer SUCCESS_CODE = 1;
    private static final Integer ERROR_CODE = 0;
    //状态码，0-失败，1-成功
    private Integer code;
    //提示消息
    private String msg;
    //真正响应实体类
    private T t;

    public static<B> Result<B> success(B t, String msg) {
        Result<B> result = new Result<B>();
        result.setCode(SUCCESS_CODE);
        result.setMsg(msg);
        result.setT(t);
        return result;
    }

    public static Result fail(String msg) {
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setMsg(msg);
        return result;
    }

}