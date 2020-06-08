package edu.tyut.bean;

import edu.tyut.bean.mbg.Student;
import edu.tyut.controller.ConstFlg;

/**
 * @author TYUT_LH
 */
public class StudentLoginAdapter extends LoginAdapter {

    private String studentId;

    @Override
    public String homePath() {
        return ConstFlg.STUDENT_HOME;
    }

    @Override
    public Class<Student> loginObject() {
        return Student.class;
    }

    @Override
    public String cookieName() {
        return studentId;
    }

    @Override
    public Object uniqueKey() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
