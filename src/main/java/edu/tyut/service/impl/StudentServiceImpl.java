package edu.tyut.service.impl;

import edu.tyut.bean.mgb.Student;
import edu.tyut.bean.mgb.StudentExample;
import edu.tyut.dao.StudentMapper;
import edu.tyut.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Student selectById(String studentId) {
        sc.andStudentIdEqualTo(studentId);
        List<Student> res = studentMapper.selectByExample(se);
        if (res.size() != 0) {
            return res.get(0);
        }
        return null;
    }

    @Override
    public void clearCriteria() {
        System.out.println("执行清理工作");
        se.clear();
    }

    @Override
    public void createCriteria() {
        System.out.println("创建Criteria");
        sc = se.createCriteria();
    }
}
