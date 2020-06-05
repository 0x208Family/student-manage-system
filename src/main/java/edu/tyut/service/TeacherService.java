package edu.tyut.service;

import edu.tyut.bean.mgb.Teacher;

public interface TeacherService {

    int insert(Teacher teacher);

    int delete(String teacherId);

    int update(Teacher teacher);

    Teacher selectById(String teacherId);
}
