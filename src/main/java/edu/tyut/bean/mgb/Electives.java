package edu.tyut.bean.mgb;

import java.io.Serializable;

public class Electives implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column electives.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column electives.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column electives.course_time
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private Integer courseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column electives.credit
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private Integer credit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column electives.total_count
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private Integer totalCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column electives.current_count
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private Integer currentCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electives.id
     *
     * @return the value of electives.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electives.id
     *
     * @param id the value for electives.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electives.name
     *
     * @return the value of electives.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electives.name
     *
     * @param name the value for electives.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electives.course_time
     *
     * @return the value of electives.course_time
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public Integer getCourseTime() {
        return courseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electives.course_time
     *
     * @param courseTime the value for electives.course_time
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setCourseTime(Integer courseTime) {
        this.courseTime = courseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electives.credit
     *
     * @return the value of electives.credit
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electives.credit
     *
     * @param credit the value for electives.credit
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electives.total_count
     *
     * @return the value of electives.total_count
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electives.total_count
     *
     * @param totalCount the value for electives.total_count
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column electives.current_count
     *
     * @return the value of electives.current_count
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column electives.current_count
     *
     * @param currentCount the value for electives.current_count
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }
}