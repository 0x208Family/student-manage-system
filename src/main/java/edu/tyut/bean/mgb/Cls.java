package edu.tyut.bean.mgb;

public class Cls {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cls.name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cls.count
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private Integer count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cls.instructor_id
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private Integer instructorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cls.name
     *
     * @return the value of cls.name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cls.name
     *
     * @param name the value for cls.name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cls.count
     *
     * @return the value of cls.count
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cls.count
     *
     * @param count the value for cls.count
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cls.instructor_id
     *
     * @return the value of cls.instructor_id
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public Integer getInstructorId() {
        return instructorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cls.instructor_id
     *
     * @param instructorId the value for cls.instructor_id
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
    }
}