package com.imooc.bilibili.domain;

import java.util.Stack;

public class JsonResponse<T> {
    //返回的状态码
    private String code;
    //返回的提示语
    private String msg;

    private T data;

    public JsonResponse(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public JsonResponse(T data){
        this.data = data;
        msg = "成功";
        code = "0";
    }

    //不需要返回给前端但是请求成功的场景
    public static JsonResponse<String> success(){
        return new JsonResponse<>(null);
    }

    //需要给前端返回参数且参数是字符串类型的
    public static JsonResponse<String> success(String data){
        return new JsonResponse<>(data);
    }

    public static JsonResponse<String> fail(){
        return new JsonResponse<>("1","失败");
    }

    //用于需要返回特定的状态码和返回给前端的提示信息的情况
    public static JsonResponse<String> fail(String code,String msg){
        return new JsonResponse<>(code,msg);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
