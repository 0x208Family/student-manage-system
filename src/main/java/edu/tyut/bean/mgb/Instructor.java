package edu.tyut.bean.mgb;

import java.io.Serializable;

public class Instructor implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.sex
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.academy
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String academy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.id
     *
     * @return the value of instructor.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.id
     *
     * @param id the value for instructor.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.name
     *
     * @return the value of instructor.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.name
     *
     * @param name the value for instructor.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.sex
     *
     * @return the value of instructor.sex
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.sex
     *
     * @param sex the value for instructor.sex
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.academy
     *
     * @return the value of instructor.academy
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getAcademy() {
        return academy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.academy
     *
     * @param academy the value for instructor.academy
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }
}