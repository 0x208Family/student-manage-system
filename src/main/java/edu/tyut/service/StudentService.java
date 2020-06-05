package edu.tyut.service;

import edu.tyut.bean.mgb.Student;

public interface StudentService extends CriteriaHelper {

    int insert(Student student);

    int delete(String studentId);

    int update(Student student);

    Student selectById(String studentId);

}
