package com.nikll.dao;

import com.nikll.entity.Student;


import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/12/18 15:41
 * @Description:
 */

public interface StudentDao {
    int getTotal();
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
    Student getStudent(int id);
    List<Student> list(int start, int count);

}
