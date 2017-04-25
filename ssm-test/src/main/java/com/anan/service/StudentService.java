package com.anan.service;

import com.anan.dao.IStudent;
import com.anan.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by James on 17/4/24.
 */
public interface StudentService {

   Student retrieve(int id);

    void createStudent(Student student);
}
