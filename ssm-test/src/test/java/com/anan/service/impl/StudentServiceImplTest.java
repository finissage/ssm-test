package com.anan.service.impl;

import com.anan.entity.Student;
import com.anan.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * Created by James on 17/4/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml","classpath:spring/spring-servlet.xml"})
//@Transactional
public class StudentServiceImplTest {

    @Autowired
    private StudentService studentService;

    @Before
    public void initDate() {
//        Student student = new Student(11, 11, "asdf");
//        studentService.createStudent(student);
    }

    @Test
    public void retrieve() throws Exception {
        Student retrieve = studentService.retrieve(11);
        System.out.println(retrieve);
    }

    @Test
    public void createStudent() throws Exception {
//        Student student = new Student(20, 10, "瑞文");
//        studentService.createStudent(student);

        Student retrieve = studentService.retrieve(10);
        System.out.println(retrieve);
    }
}