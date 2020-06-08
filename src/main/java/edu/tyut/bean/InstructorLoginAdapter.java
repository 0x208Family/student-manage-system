package edu.tyut.bean;

import edu.tyut.bean.mbg.Instructor;
import edu.tyut.controller.ConstFlg;

/**
 * @author TYUT_LH
 */
public class InstructorLoginAdapter extends LoginAdapter {

    private String instructorId;

    @Override
    public String homePath() {
        return ConstFlg.INSTRUCTOR_HOME;
    }

    @Override
    public Class<Instructor> loginObject() {
        return Instructor.class;
    }

    @Override
    public String cookieName() {
        return instructorId;
    }

    @Override
    public Object uniqueKey() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }
}
