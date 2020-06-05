package edu.tyut.service;

import edu.tyut.bean.mgb.Student;
import edu.tyut.service.aspect.CriteriaHelper;

public interface StudentService extends CriteriaHelper {

    int insert(Student student);

    int delete(String studentId);

    int update(Student student);

    Student queryById(String studentId);
}
