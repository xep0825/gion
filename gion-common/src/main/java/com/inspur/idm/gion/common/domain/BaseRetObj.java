package com.inspur.idm.gion.common.domain;

public class BaseRetObj {

    private boolean status;

    private String errcode;

    private String errmsg;

    private Object data;

    public BaseRetObj(boolean status, String errcode, String errmsg) {
        this.status = status;
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.data = null;
    }

    public BaseRetObj(boolean status, String errcode, String errmsg, Object data) {
        this.status = status;
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
