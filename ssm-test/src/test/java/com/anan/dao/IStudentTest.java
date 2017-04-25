package com.anan.dao;

import com.anan.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by James on 17/4/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-dao.xml"})
public class IStudentTest {

    @Autowired
    private IStudent iStudent;

    @Test
    public void initData() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");
        System.out.println(applicationContext.getBean("sqlSessionFactory"));
    }

    @Test
    public void testRetrieve() {
        System.out.println(iStudent.retrieveStudent(2));
    }

    @Test
    public void testCreateStudent() {
//        Student student = new Student(10, 0, "李白");
//        iStudent.createStudent(student);
    }

    @Test
    public void testRetrieveStudent() {
        List<Student> retrieve = iStudent.retrieveAll();
        System.out.println(retrieve);
    }

    @Test
    public void testDeleteStudent() {
        iStudent.deleteStudent(1);
        System.out.println(iStudent.retrieveStudent(1));
    }
}