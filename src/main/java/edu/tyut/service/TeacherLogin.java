package edu.tyut.service;

import edu.tyut.bean.mbg.Teacher;
import edu.tyut.service.helper.CriteriaHelper;
import edu.tyut.service.helper.LoginHelper;

public interface TeacherLogin extends CriteriaHelper, LoginHelper {

    int insert(Teacher teacher);

    int delete(String teacherId);

    int update(Teacher teacher);

    Teacher queryById(String teacherId);

    @Override
    default Class<Teacher> serviceFor() {
        return Teacher.class;
    }
}
