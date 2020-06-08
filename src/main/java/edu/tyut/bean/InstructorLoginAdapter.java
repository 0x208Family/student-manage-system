package edu.tyut.bean;

import edu.tyut.bean.mbg.Instructor;
import edu.tyut.controller.ConstFlg;
import edu.tyut.util.SystemUtil;

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
        return ConstFlg.INSTRUCTOR_COOKIE;
    }

    @Override
    public String cookieValue() {
        return SystemUtil.URLEncoder(SystemUtil.serialization(this));
    }

    @Override
    public Object uniqueKey() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorId() {
        return instructorId;
    }
}
