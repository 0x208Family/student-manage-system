package edu.tyut.service;

import edu.tyut.bean.mgb.Teacher;
import edu.tyut.service.aspect.CriteriaHelper;

public interface TeacherService extends CriteriaHelper {

    int insert(Teacher teacher);

    int delete(String teacherId);

    int update(Teacher teacher);

    Teacher selectById(String teacherId);
}
