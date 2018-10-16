package com.youli.core;

import java.util.List;

/**
 * @author fanfuqiang
 * @description
 * @date 2018/10/17 0:48
 * @vesion 1.0
 */
public class Res<T> {
    private static final String SUCESS_CODE = "1";
    private static final String DEFAULT_SUCESS_MSG = "成功";

    private static final String FAIL_CODE = "0";
    private static final String DEFAULT_FAIL_MSG = "失败";

    private String code;
    private String msg;
    private T result;

    private Res() {
    }
    private Res(String code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getResult() {
        return result;
    }

    public static Res sucess(){
        return sucess(DEFAULT_SUCESS_MSG);
    }
    public static Res sucess(String msg){
        return sucess(msg, null);
    }
    public static<T> Res<T> sucess(String msg, T result){
        return new Res(SUCESS_CODE, msg, result);
    }

    public static Res fail(){
        return fail(DEFAULT_FAIL_MSG);
    }
    public static Res fail(String msg){
        return fail(msg, null);
    }
    public static<T> Res<T> fail(String msg, T result){
        return new Res(FAIL_CODE, msg, result);
    }

    public static <T> Res<T> buildRes(String code, String msg, T resut){
        return new Res<>(code, msg, resut);
    }
}
