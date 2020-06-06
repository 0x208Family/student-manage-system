package edu.tyut.service;

import edu.tyut.bean.mbg.Teacher;
import edu.tyut.service.aspect.CriteriaHelper;

public interface TeacherService extends CriteriaHelper {

    int insert(Teacher teacher);

    int delete(String teacherId);

    int update(Teacher teacher);

    Teacher queryById(String teacherId);

    boolean loginHelper(String teacherId, String password);
}
