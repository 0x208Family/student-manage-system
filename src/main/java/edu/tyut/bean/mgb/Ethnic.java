package edu.tyut.bean.mgb;

import java.io.Serializable;

public class Ethnic implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ethnic.ethnic_id
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private Integer ethnicId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ethnic.ethnic_name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private String ethnicName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ethnic.ethnic_id
     *
     * @return the value of ethnic.ethnic_id
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public Integer getEthnicId() {
        return ethnicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ethnic.ethnic_id
     *
     * @param ethnicId the value for ethnic.ethnic_id
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setEthnicId(Integer ethnicId) {
        this.ethnicId = ethnicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ethnic.ethnic_name
     *
     * @return the value of ethnic.ethnic_name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public String getEthnicName() {
        return ethnicName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ethnic.ethnic_name
     *
     * @param ethnicName the value for ethnic.ethnic_name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setEthnicName(String ethnicName) {
        this.ethnicName = ethnicName == null ? null : ethnicName.trim();
    }
}