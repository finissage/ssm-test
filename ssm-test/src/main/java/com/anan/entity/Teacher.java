package com.anan.entity;

import java.util.Date;

public class Teacher {
    private int teaId;

    private String teaName;

    private int teaAge;

    private Date createTime;

    public Teacher() {
    }

    public Teacher(Date createTime, int teaAge, int teaId, String teaName) {
        this.createTime = createTime;
        this.teaAge = teaAge;
        this.teaId = teaId;
        this.teaName = teaName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(int teaAge) {
        this.teaAge = teaAge;
    }

    public int getTeaId() {
        return teaId;
    }

    public void setTeaId(int teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "createTime=" + createTime +
                ", teaId=" + teaId +
                ", teaName='" + teaName + '\'' +
                ", teaAge=" + teaAge +
                '}';
    }
}
