package com.nikll.service;

import com.nikll.entity.Student;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/12/18 15:44
 * @Description:
 */
public interface StudentService {

    /**
     * 获取到 Student 的总数
     * @return
     */
    int getTotal();

    /**
     * 增加一条数据
     * @param student
     */
    void addStudent(Student student);

    /**
     * 删除一条数据
     * @param id
     */
    void deleteStudent(int id);

    /**
     * 更新一条数据
     * @param student
     */
    void updateStudent(Student student);

    /**
     * 找到一条数据
     * @param id
     * @return
     */
    Student getStudent(int id);

    /**
     * 列举出从 start 位置开始的 count 条数据
     * @param start
     * @param count
     * @return
     */
    List<Student> list(int start, int count);

}
