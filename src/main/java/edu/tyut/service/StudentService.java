package edu.tyut.service;

import edu.tyut.bean.mgb.Student;

import java.util.List;

public interface StudentService {

    int insert(Student student);

    int delete(String studentId);

    int update(Student student);

    Student selectById(String studentId);

}
