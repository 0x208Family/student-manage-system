package edu.tyut.service.impl;

import edu.tyut.annotation.AOPIgnore;
import edu.tyut.bean.mbg.Teacher;
import edu.tyut.bean.mbg.TeacherExample;
import edu.tyut.dao.TeacherMapper;
import edu.tyut.service.TeacherService;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    private final TeacherMapper teacherMapper;

    private final TeacherExample te = new TeacherExample();

    private TeacherExample.Criteria tc;

    public TeacherServiceImpl(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @AOPIgnore
    @Override
    public int insert(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public int delete(String teacherId) {
        tc.andTeacherIdEqualTo(teacherId);
        return teacherMapper.deleteByExample(te);
    }

    @Override
    public int update(Teacher teacher) {
        tc.andTeacherIdEqualTo(teacher.getTeacherId());
        return teacherMapper.updateByExample(teacher, te);
    }

    @AOPIgnore
    @Override
    public Teacher queryById(String teacherId) {
        return teacherMapper.queryById(teacherId);
    }

    @Override
    public boolean loginHelper(String teacherId, String password) {
        tc.andTeacherIdEqualTo(teacherId);
        tc.andPasswordEqualTo(password);
        return teacherMapper.selectByExample(te).size() != 0;
    }

    @Override
    public void clearCriteria() {
        te.clear();
    }

    @Override
    public void createCriteria() {
        tc = te.createCriteria();
    }
}
