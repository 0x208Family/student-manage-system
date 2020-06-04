package edu.tyut.bean.mgb;

import edu.tyut.bean.LoginInformation;

import java.io.Serializable;

public class Manager implements LoginInformation, Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager_login.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager_login.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager_login.password
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manager_login.root
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String root;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager_login.id
     *
     * @return the value of manager_login.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager_login.id
     *
     * @param id the value for manager_login.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager_login.name
     *
     * @return the value of manager_login.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager_login.name
     *
     * @param name the value for manager_login.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String getIdentityKey() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager_login.password
     *
     * @return the value of manager_login.password
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager_login.password
     *
     * @param password the value for manager_login.password
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manager_login.root
     *
     * @return the value of manager_login.root
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getRoot() {
        return root;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manager_login.root
     *
     * @param root the value for manager_login.root
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setRoot(String root) {
        this.root = root == null ? null : root.trim();
    }
}