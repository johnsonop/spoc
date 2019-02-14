package com.edu.spoc.controller;


import com.edu.spoc.base.model.ErrorResult;
import com.edu.spoc.base.model.Result;
import com.edu.spoc.base.model.SuccessResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 基础controller类
 *
 * @author wjc
 */
public abstract class BaseController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected Result success() {
        return new SuccessResult();
    }

    protected Result success(Object data) {
        return new SuccessResult(data);
    }

    protected Result success(String msg) {
        return new SuccessResult(msg);
    }

    protected Result success(String msg, Object data) {
        return new SuccessResult(msg, data);
    }

    protected Result error() {
        return new ErrorResult();
    }

    protected Result error(int code) {
        return new ErrorResult(code);
    }

    protected Result error(Object data) {
        return new ErrorResult(data);
    }

    protected Result error(int code, Object data) {
        return new ErrorResult(code, data);
    }

    protected Result error(int code, String msg, Object data) {
        return new ErrorResult(code, msg, data);
    }

}
