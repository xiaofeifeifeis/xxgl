package com.mf.demo.system.model;

public class MfCourseTime {
    private String timeId;

    private String timeNo;

    private String timeName;

    public String getTimeId() {
        return timeId;
    }

    public void setTimeId(String timeId) {
        this.timeId = timeId == null ? null : timeId.trim();
    }

    public String getTimeNo() {
        return timeNo;
    }

    public void setTimeNo(String timeNo) {
        this.timeNo = timeNo == null ? null : timeNo.trim();
    }

    public String getTimeName() {
        return timeName;
    }

    public void setTimeName(String timeName) {
        this.timeName = timeName == null ? null : timeName.trim();
    }
}