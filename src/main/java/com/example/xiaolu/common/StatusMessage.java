package com.example.xiaolu.common;

/**
 * @author Lu Yufeng
 * @date 2018/12/4 下午8:57
 */
public enum StatusMessage {
    OK(10000, "OK!"),
    INPUT_ERROR(15001, "输入参数错误"),
    INTERNAL_ERROR(15002, "服务内部错误"),
    EXTERNAL_ERROR(15003, "外部服务错误"),
    UNKNOWN_ERROR(15004, "未知错误");

    private Integer status;
    private String msg;

    StatusMessage(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
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
}
