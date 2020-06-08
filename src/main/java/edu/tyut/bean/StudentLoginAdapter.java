package edu.tyut.bean;

import edu.tyut.bean.mbg.Student;
import edu.tyut.controller.ConstFlg;
import edu.tyut.util.SystemUtil;

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
        return ConstFlg.STUDENT_COOKIE;
    }

    @Override
    public String cookieValue() {
        return SystemUtil.URLEncoder(SystemUtil.serialization(this));
    }

    @Override
    public Object uniqueKey() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}
