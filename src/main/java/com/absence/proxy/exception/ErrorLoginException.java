package com.absence.proxy.exception;

public class ErrorLoginException extends Exception {
    protected final String status;
    protected final String[] params;

    public ErrorLoginException(String status, String[] params) {
        this.status = status;
        this.params = params;
    }

    public ErrorLoginException(String status, String[] params, String message) {
        super(message);
        this.status = status;
        this.params = params;
    }

    public String getStatus() {
        return status;
    }

    public String[] getParams() {
        return params;
    }
}
