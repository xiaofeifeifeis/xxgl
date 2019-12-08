package com.mf.demo.system.model;

public class MfTeacherMessage {
    private String teacherId;

    private String teacherNo;

    private String teacherName;

    private String phone;

    private String secondContactt;

    private Byte teacherStatus;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo == null ? null : teacherNo.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSecondContactt() {
        return secondContactt;
    }

    public void setSecondContactt(String secondContactt) {
        this.secondContactt = secondContactt == null ? null : secondContactt.trim();
    }

    public Byte getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(Byte teacherStatus) {
        this.teacherStatus = teacherStatus;
    }
}