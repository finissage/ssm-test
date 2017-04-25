package com.anan.service.impl;

import com.anan.dao.IStudent;
import com.anan.entity.Student;
import com.anan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by James on 17/4/24.
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private IStudent iStudent;

    public Student retrieve(int id) {
        return iStudent.retrieveStudent(id);
    }

    public void createStudent(Student student) {
        iStudent.createStudent(student);
    }
}
