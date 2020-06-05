package edu.tyut.service.impl;

import edu.tyut.bean.mgb.Teacher;
import edu.tyut.bean.mgb.TeacherExample;
import edu.tyut.dao.TeacherMapper;
import edu.tyut.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    private TeacherMapper teacherMapper;

    private TeacherExample te = new TeacherExample();

    public TeacherServiceImpl(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }


    @Override
    public int insert(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public int delete(String teacherId) {
        te.clear();
        TeacherExample.Criteria tc = te.createCriteria();
        tc.andTeacherIdEqualTo(teacherId);
        return teacherMapper.deleteByExample(te);
    }

    @Override
    public int update(Teacher teacher) {
        te.clear();
        TeacherExample.Criteria tc = te.createCriteria();
        tc.andTeacherIdEqualTo(teacher.getTeacherId());
        return teacherMapper.updateByExample(teacher, te);
    }

    @Override
    public Teacher selectById(String teacherId) {
        te.clear();
        TeacherExample.Criteria tc = te.createCriteria();
        List<Teacher> res = teacherMapper.selectByExample(te);
        if (res.size() != 0) {
            return res.get(0);
        }
        return null;
    }
}
