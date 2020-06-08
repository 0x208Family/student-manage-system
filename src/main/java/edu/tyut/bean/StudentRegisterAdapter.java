package edu.tyut.bean;

import edu.tyut.bean.mbg.Student;

/**
 * @author TYUT_LH
 */
public class StudentRegisterAdapter extends RegisterAdapter {

    private String studentId;

    private static final int THRESHOLD_LENGTH = 10;

    @Override
    public int primaryKeyCheckThresholdLength() {
        return THRESHOLD_LENGTH;
    }

    @Override
    public Class<Student> registerObject() {
        return Student.class;
    }

    @Override
    public Object uniqueKey() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
