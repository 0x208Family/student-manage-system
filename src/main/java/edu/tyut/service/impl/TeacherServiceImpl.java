package edu.tyut.service.impl;

import edu.tyut.bean.mgb.Teacher;
import edu.tyut.bean.mgb.TeacherExample;
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

    @Override
    public Teacher queryById(String teacherId) {
        return teacherMapper.queryById(teacherId);
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
