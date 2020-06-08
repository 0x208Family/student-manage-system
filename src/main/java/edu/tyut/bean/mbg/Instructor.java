package edu.tyut.bean.mbg;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.tyut.bean.SubjectEntity;
import lombok.ToString;

@ToString
public class Instructor implements SubjectEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.instructor_id
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    private String instructorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.name
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.identity_num
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String identityNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.sex
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.academy
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String academy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.political_status
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String politicalStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.nation
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String nation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.password
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.phone
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.ethnic
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String ethnic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.province
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.city
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.county
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String county;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column instructor.address_detail
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    @JsonIgnore
    private String addressDetail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.instructor_id
     *
     * @return the value of instructor.instructor_id
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String getInstructorId() {
        return instructorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.instructor_id
     *
     * @param instructorId the value for instructor.instructor_id
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId == null ? null : instructorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.name
     *
     * @return the value of instructor.name
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
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
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.identity_num
     *
     * @return the value of instructor.identity_num
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String getIdentityNum() {
        return identityNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.identity_num
     *
     * @param identityNum the value for instructor.identity_num
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum == null ? null : identityNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.sex
     *
     * @return the value of instructor.sex
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
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
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
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
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
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
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.political_status
     *
     * @return the value of instructor.political_status
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.political_status
     *
     * @param politicalStatus the value for instructor.political_status
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.nation
     *
     * @return the value of instructor.nation
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String getNation() {
        return nation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.nation
     *
     * @param nation the value for instructor.nation
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    @Override
    public String uniqueKey() {
        return instructorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.password
     *
     * @return the value of instructor.password
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String password() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.password
     *
     * @param password the value for instructor.password
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.phone
     *
     * @return the value of instructor.phone
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.phone
     *
     * @param phone the value for instructor.phone
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.ethnic
     *
     * @return the value of instructor.ethnic
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String getEthnic() {
        return ethnic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.ethnic
     *
     * @param ethnic the value for instructor.ethnic
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setEthnic(String ethnic) {
        this.ethnic = ethnic == null ? null : ethnic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.province
     *
     * @return the value of instructor.province
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.province
     *
     * @param province the value for instructor.province
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.city
     *
     * @return the value of instructor.city
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.city
     *
     * @param city the value for instructor.city
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.county
     *
     * @return the value of instructor.county
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.county
     *
     * @param county the value for instructor.county
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column instructor.address_detail
     *
     * @return the value of instructor.address_detail
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column instructor.address_detail
     *
     * @param addressDetail the value for instructor.address_detail
     *
     * @mbg.generated Sat Jun 06 21:20:14 CST 2020
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }
}