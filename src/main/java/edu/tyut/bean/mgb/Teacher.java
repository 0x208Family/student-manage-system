package edu.tyut.bean.mgb;

import edu.tyut.bean.LoginInformation;
import edu.tyut.bean.RegisterInformation;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@ToString
public class Teacher implements RegisterInformation, LoginInformation, Serializable {

    private static final int KEY_LENGTH = 10;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @NotBlank
    @Length(min = 10, max = 10, message = "教师编号不能为空")
    private String teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @NotBlank
    @Length(min = 2, max = 4, message = "用户名错误")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.identity_num
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @Length(min = 18, max = 18, message = "请输入18位有效身份证")
    @Pattern(regexp = "(^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|" +
            "(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)", message = "无效的身份证号码")
    private String identityNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.sex
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @NotBlank
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.academy
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @NotBlank
    private String academy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.political_status
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @NotBlank
    private String politicalStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.nation
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @NotBlank
    private String nation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.password
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @Length(min = 8, max = 16, message = "密码长度必须在8-16位")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]{8,16}$", message = "密码必须由大写字母，小写字母和数字组成")
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.phone
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @Length(min = 11, max = 11)
    @Pattern(regexp = " ((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8}" +
            ")-(\\d{4}|\\d{3}|\\d{2}|\\d)|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d))$)", message = "无效的手机号")
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.ethnic
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @NotBlank
    private String ethnic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.province
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @NotBlank
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.city
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    @NotBlank
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.county
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String county;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.address_detail
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String addressDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.register_captcha
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.id
     *
     * @return the value of teacher.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.id
     *
     * @param id the value for teacher.id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_id
     *
     * @return the value of teacher.teacher_id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_id
     *
     * @param teacherId the value for teacher.teacher_id
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.name
     *
     * @return the value of teacher.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.name
     *
     * @param name the value for teacher.name
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.identity_num
     *
     * @return the value of teacher.identity_num
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getIdentityNum() {
        return identityNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.identity_num
     *
     * @param identityNum the value for teacher.identity_num
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum == null ? null : identityNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.sex
     *
     * @return the value of teacher.sex
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.sex
     *
     * @param sex the value for teacher.sex
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.academy
     *
     * @return the value of teacher.academy
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getAcademy() {
        return academy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.academy
     *
     * @param academy the value for teacher.academy
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.political_status
     *
     * @return the value of teacher.political_status
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.political_status
     *
     * @param politicalStatus the value for teacher.political_status
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.nation
     *
     * @return the value of teacher.nation
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getNation() {
        return nation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.nation
     *
     * @param nation the value for teacher.nation
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    @Override
    public String getIdentityKey() {
        return this.teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.password
     *
     * @return the value of teacher.password
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.password
     *
     * @param password the value for teacher.password
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.phone
     *
     * @return the value of teacher.phone
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.phone
     *
     * @param phone the value for teacher.phone
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.ethnic
     *
     * @return the value of teacher.ethnic
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getEthnic() {
        return ethnic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.ethnic
     *
     * @param ethnic the value for teacher.ethnic
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setEthnic(String ethnic) {
        this.ethnic = ethnic == null ? null : ethnic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.province
     *
     * @return the value of teacher.province
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.province
     *
     * @param province the value for teacher.province
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.city
     *
     * @return the value of teacher.city
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.city
     *
     * @param city the value for teacher.city
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.county
     *
     * @return the value of teacher.county
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.county
     *
     * @param county the value for teacher.county
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.address_detail
     *
     * @return the value of teacher.address_detail
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.address_detail
     *
     * @param addressDetail the value for teacher.address_detail
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.register_captcha
     *
     * @return the value of teacher.register_captcha
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.register_captcha
     *
     * @param remark the value for teacher.register_captcha
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String getKey() {
        return this.teacherId;
    }

    @Override
    public int keyLength() {
        return KEY_LENGTH;
    }
}