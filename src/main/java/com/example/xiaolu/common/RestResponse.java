package com.example.xiaolu.common;

import com.alibaba.fastjson.JSON;

/**
 * @author Lu Yufeng
 * @date 2018/12/4 下午8:56
 */
public class RestResponse<T> {
    private Integer status;
    private String msg;
    private T data;


    public RestResponse(){

    }
    public RestResponse(T data,int status,String msg){
        this.data=data;
        this.status=status;
        this.msg=msg;
    }



    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public static <T> RestResponse<T> result(T data,StatusMessage statusMsg){

        return new RestResponse<T>(data,statusMsg.getStatus(),statusMsg.getMsg());
    }


    public static <T> RestResponse<T> result(T data,int status,String msg){

        return new RestResponse<T>(data,status,msg);
    }
}
