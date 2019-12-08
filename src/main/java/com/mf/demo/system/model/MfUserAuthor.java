package com.mf.demo.system.model;

public class MfUserAuthor {
    private String authorId;

    private String funcId;

    private String funcName;

    private Byte funcEnabled;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId == null ? null : funcId.trim();
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    public Byte getFuncEnabled() {
        return funcEnabled;
    }

    public void setFuncEnabled(Byte funcEnabled) {
        this.funcEnabled = funcEnabled;
    }
}