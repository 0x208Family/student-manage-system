package edu.tyut.service;

import edu.tyut.bean.mbg.Student;
import edu.tyut.service.helper.CriteriaHelper;
import edu.tyut.service.helper.LoginHelper;

public interface StudentService extends CriteriaHelper, LoginHelper {

    int insert(Student student);

    int delete(String studentId);

    int update(Student student);

    Student queryById(String studentId);

    @Override
    default Class<Student> serviceFor() {
        return Student.class;
    }
}
