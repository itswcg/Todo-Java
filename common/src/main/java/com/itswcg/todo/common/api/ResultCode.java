package com.itswcg.todo.common.api;

public enum ResultCode implements ErrorCode {
    SUCCESS(0, "Ok"),
    FAILED(1, "Failed"),
    VALIDATE_FAILED(2, "Parameter error"),
    UNAUTHORIZED(3, "Not auth");

    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
