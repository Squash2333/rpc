package com.squash.common.uitils;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author Squash
 * @Data 2021/11/8 10:10
 */
@Data
public class ServiceResult<T> implements Serializable {
    private static final long serialVersionUID = -6565470294998251152L;
    protected Boolean success;
    protected String errorCode;
    protected String errorMsg;
    protected T result;
    protected Object[] arguments;

    public Boolean isSuccess() {
        return this.success;
    }

    public static <T> ServiceResult<T> getSucessResult(T v) {
        ServiceResult<T> result = new ServiceResult<>();
        result.setResult(v);
        result.setSuccess(true);
        return result;
    }

    public static <T> ServiceResult<T> getFailureResult(String errorCode, String errorMsg) {
        ServiceResult<T> result = new ServiceResult<>();
        result.setSuccess(false);
        result.setErrorCode(errorCode);
        result.setErrorMsg(errorMsg);
        return result;
    }
}
