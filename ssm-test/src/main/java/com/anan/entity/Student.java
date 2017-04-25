package com.anan.entity;

/**
 * Created by James on 17/4/24.
 */
public class Student {
    private int stuId;

    private String stuName;

    private int stuAge;

    private Teacher teacher;

    public Student() {
    }

    public Student(String stuName, int stuId, int stuAge) {
        this.stuName = stuName;
        this.stuId = stuId;
        this.stuAge = stuAge;
    }

    public Student(int stuAge, int stuId, String stuName, Teacher teacher) {
        this(stuName, stuId, stuAge);
        this.teacher = teacher;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuAge=" + stuAge +
                ", stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}

