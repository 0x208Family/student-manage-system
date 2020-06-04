package edu.tyut.bean.mgb;

import java.io.Serializable;

public class Course implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_time
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private Integer courseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.academy
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String academy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.profession
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String profession;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.teacher
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String teacher;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.name
     *
     * @return the value of course.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.name
     *
     * @param name the value for course.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_time
     *
     * @return the value of course.course_time
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public Integer getCourseTime() {
        return courseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_time
     *
     * @param courseTime the value for course.course_time
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setCourseTime(Integer courseTime) {
        this.courseTime = courseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.academy
     *
     * @return the value of course.academy
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getAcademy() {
        return academy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.academy
     *
     * @param academy the value for course.academy
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.profession
     *
     * @return the value of course.profession
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getProfession() {
        return profession;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.profession
     *
     * @param profession the value for course.profession
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.teacher
     *
     * @return the value of course.teacher
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.teacher
     *
     * @param teacher the value for course.teacher
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }
}