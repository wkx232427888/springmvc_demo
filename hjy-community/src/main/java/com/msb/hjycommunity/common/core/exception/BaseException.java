package com.msb.hjycommunity.common.core.exception;

public class BaseException extends RuntimeException {
    /**
     * 异常错误码
     */
    private String code;
    /*错误消息*/
    private String defaultMessage;

    public BaseException() {
    }
    public BaseException(String code, String defaultMessage) {
        super(defaultMessage);
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }

    public String getCode() {
        return code;
    }
}
