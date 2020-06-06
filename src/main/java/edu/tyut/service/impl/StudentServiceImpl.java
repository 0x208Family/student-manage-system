package edu.tyut.service.impl;

import edu.tyut.bean.mgb.Student;
import edu.tyut.bean.mgb.StudentExample;
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
    public Student queryById(String studentId) {
        return studentMapper.queryById(studentId);
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
