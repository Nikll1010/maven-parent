package com.nikll.test;

import com.nikll.dao.StudentDao;
import com.nikll.entity.Student;
import com.nikll.service.StudentService;
import com.nikll.serviceimpl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-mybatis.xml"})
public class StudentDaoTest extends StudentServiceImpl {
//    @Autowired
//    private StudentDao studentDao;

    @Autowired
    private StudentService studentService;

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-mvc.xml");

        Student student = context.getBean("Student",Student.class);


        student.setStudent_id(1);
        student.setName("lala");
        student.setAge(2);
        student.setSex("男");

    }
    @Test
    public void testFindUserById() {
        int id = 1;
        Student student = studentService.getStudent(1);
        System.out.println(student.getId()+student.getAge());
    }



}
