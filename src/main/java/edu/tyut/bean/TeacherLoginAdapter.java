package edu.tyut.bean;

import edu.tyut.bean.mbg.Teacher;
import edu.tyut.controller.ConstFlg;

/**
 * @author TYUT_LH
 */
public class TeacherLoginAdapter extends LoginAdapter {

    private String teacherId;

    @Override
    public String homePath() {
        return ConstFlg.TEACHER_HOME;
    }

    @Override
    public Class<Teacher> loginObject() {
        return Teacher.class;
    }

    @Override
    public String cookieName() {
        return ConstFlg.TEACHER_HOME;
    }

    @Override
    public Object uniqueKey() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
