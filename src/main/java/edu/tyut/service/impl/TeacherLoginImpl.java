package edu.tyut.service.impl;

import edu.tyut.annotation.AOPIgnore;
import edu.tyut.bean.Entity;
import edu.tyut.bean.SubjectEntity;
import edu.tyut.bean.mbg.Teacher;
import edu.tyut.bean.example.TeacherExample;
import edu.tyut.dao.TeacherMapper;
import edu.tyut.service.TeacherLogin;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherLoginImpl implements TeacherLogin {

    private final TeacherMapper teacherMapper;

    private final TeacherExample te = new TeacherExample();

    private TeacherExample.Criteria tc;

    public TeacherLoginImpl(TeacherMapper teacherMapper) {
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
    public boolean loginChecker(SubjectEntity obj) {
        tc.andTeacherIdEqualTo((String) obj.uniqueKey());
        tc.andPasswordEqualTo(obj.password());
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
