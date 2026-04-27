package com.msb.hjycommunity.common.core.domain;

/**
 * 返回相应状态码枚举类
 */
public enum ResultCode {

    SUCCESS("200","操作成功"),
    ERROR("500","操作失败");
    private String code;
    private String message;

    ResultCode(String code, String message) {
        this.message = message;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
