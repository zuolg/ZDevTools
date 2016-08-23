package com.z.zdev.bean;

/**
 * Created by Zz on 2016/3/28.
 */
public class BaseBean {
    /** 返回状态码 */
    private String code;

    /** 返回状态 */
    private String operationStatus;

    /** 消息 */
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
