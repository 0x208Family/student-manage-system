package edu.tyut.service.impl;

import edu.tyut.annotation.AOPIgnore;
import edu.tyut.bean.LoginInformation;
import edu.tyut.bean.mbg.Student;
import edu.tyut.bean.mbg.StudentExample;
import edu.tyut.dao.StudentMapper;
import edu.tyut.service.StudentService;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    private final StudentExample se = new StudentExample();

    private StudentExample.Criteria sc;

    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @AOPIgnore
    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int delete(String studentId) {
        sc.andStudentIdEqualTo(studentId);
        return studentMapper.deleteByExample(se);
    }

    @Override
    public int update(Student student) {
        sc.andStudentIdEqualTo(student.getStudentId());
        return studentMapper.updateByExample(student, se);
    }

    @Override
    @AOPIgnore
    public Student queryById(String studentId) {
        return studentMapper.queryById(studentId);
    }

    @Override
    public boolean loginChecker(LoginInformation l) {
        sc.andStudentIdEqualTo(l.getLoginKey());
        sc.andPasswordEqualTo(l.getPassword());
        return studentMapper.selectByExample(se).size() != 0;
    }

    @Override
    public void clearCriteria() {
        se.clear();
    }

    @Override
    public void createCriteria() {
        sc = se.createCriteria();
    }
}
