package edu.tyut.bean.mbg;

public class Academy {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column academy.name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column academy.count
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private Integer count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column academy.introduction
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    private String introduction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column academy.name
     *
     * @return the value of academy.name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column academy.name
     *
     * @param name the value for academy.name
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column academy.count
     *
     * @return the value of academy.count
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column academy.count
     *
     * @param count the value for academy.count
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column academy.introduction
     *
     * @return the value of academy.introduction
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column academy.introduction
     *
     * @param introduction the value for academy.introduction
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}