package edu.tyut.bean;

import edu.tyut.bean.mbg.Teacher;

/**
 * @author TYUT_LH
 */
public class TeacherRegisterAdapter extends RegisterAdapter {

    private String teacherId;

    private static final int THRESHOLD_LENGTH = 10;

    @Override
    public int primaryKeyCheckThresholdLength() {
        return THRESHOLD_LENGTH;
    }

    @Override
    public Class<Teacher> registerObject() {
        return Teacher.class;
    }

    @Override
    public Object uniqueKey() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
