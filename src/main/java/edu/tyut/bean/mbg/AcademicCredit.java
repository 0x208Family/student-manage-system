package edu.tyut.bean.mbg;

public class AcademicCredit {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column academic_credit.student_id
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private String studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column academic_credit.student_name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private String studentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column academic_credit.credit
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private Integer credit;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column academic_credit.student_id
     *
     * @return the value of academic_credit.student_id
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column academic_credit.student_id
     *
     * @param studentId the value for academic_credit.student_id
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column academic_credit.student_name
     *
     * @return the value of academic_credit.student_name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column academic_credit.student_name
     *
     * @param studentName the value for academic_credit.student_name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column academic_credit.credit
     *
     * @return the value of academic_credit.credit
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column academic_credit.credit
     *
     * @param credit the value for academic_credit.credit
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}