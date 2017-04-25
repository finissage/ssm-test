package com.anan.dao;

import com.anan.entity.Student;

import java.util.List;

/**
 * Created by James on 17/4/24.
 */
public interface IStudent {
    Student retrieveStudent(int stuId);

    void createStudent(Student student);

    List<Student> retrieveAll();

    void deleteStudent(int stuId);
}
