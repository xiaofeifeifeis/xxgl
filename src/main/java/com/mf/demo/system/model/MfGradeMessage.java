package com.mf.demo.system.model;

public class MfGradeMessage {
    private String gradeId;

    private String gradeNo;

    private String gradeName;

    private String gradeAttribute;

    private Byte graduationStatus;

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId == null ? null : gradeId.trim();
    }

    public String getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(String gradeNo) {
        this.gradeNo = gradeNo == null ? null : gradeNo.trim();
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public String getGradeAttribute() {
        return gradeAttribute;
    }

    public void setGradeAttribute(String gradeAttribute) {
        this.gradeAttribute = gradeAttribute == null ? null : gradeAttribute.trim();
    }

    public Byte getGraduationStatus() {
        return graduationStatus;
    }

    public void setGraduationStatus(Byte graduationStatus) {
        this.graduationStatus = graduationStatus;
    }
}