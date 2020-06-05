package edu.tyut.service.impl;

import edu.tyut.bean.mgb.Student;
import edu.tyut.bean.mgb.StudentExample;
import edu.tyut.dao.StudentMapper;
import edu.tyut.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;

    private StudentExample se = new StudentExample();

    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }


    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int delete(String studentId) {
        se.clear();
        StudentExample.Criteria sc = se.createCriteria();
        sc.andStudentIdEqualTo(studentId);
        return studentMapper.deleteByExample(se);
    }

    @Override
    public int update(Student student) {
        se.clear();
        StudentExample.Criteria sc = se.createCriteria();
        sc.andStudentIdEqualTo(student.getStudentId());
        return studentMapper.updateByExample(student, se);
    }

    @Override
    public Student selectById(String studentId) {
        se.clear();
        StudentExample.Criteria sc = se.createCriteria();
        sc.andStudentIdEqualTo(studentId);
        List<Student> res = studentMapper.selectByExample(se);
        if (res.size() != 0) {
            return res.get(0);
        }
        return null;
    }
}
