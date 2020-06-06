package edu.tyut.bean.mgb;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.tyut.bean.LoginInformation;
import edu.tyut.bean.RegisterInformation;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@ToString
public class Student implements LoginInformation, RegisterInformation {

    private static final int KEY_LENGTH = 10;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.student_id
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @NotBlank(message = "学号不能为空")
    @Length(min = 10, max = 10, message = "学号不正确")
    private String studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.name
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "姓名不能为空")
    @Length(min = 2, max = 4, message = "姓名不正确")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sex
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "性别不能为空")
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.political_status
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "政治状态不能为空")
    private String politicalStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.nation
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "籍贯不能为空")
    private String nation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.identity_num
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @Length(min = 15, max = 18, message = "身份证错误")
    @NotBlank(message = "身份证不能为空")
    @Pattern(regexp = "^[1-9]\\d{5}(18|19|20|(3\\d))\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$",
            message = "无效的身份证号码")
    private String identityNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.instructor_name
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "辅导也姓名不能为空")
    @Length(min = 2, max = 4, message = "错误的姓名")
    private String instructorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.password
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @NotBlank(message = "密码不能为空")
    @Length(min = 8, max = 16, message = "密码长度必须在8-16位")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]{8,16}$",
            message = "密码长度必须在8-16位，且必须至少包含一个大写字母，一个小写字母和一个数字")
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.birth
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    private Date birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.ethnic
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "民族不能为空")
    private String ethnic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.admission_date
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    private Date admissionDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.academy
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "学院不能为空")
    private String academy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.cls
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "班级不能为空")
    private String cls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.dormitory_id
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "宿舍号不能为空")
    private String dormitoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.personal_phone
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "号码不能为空")
    @Length(max = 11)
    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$",
            message = "号码错误")
    private String personalPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.parent_phone
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "号码不能为空")
    @Length(max = 11)
    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$",
            message = "号码错误")
    private String parentPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.province
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "省份不能为空")
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.city
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    @NotBlank(message = "城市不能为空")
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.county
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    private String county;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.address_detail
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    private String addressDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.remark
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    @JsonIgnore
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.student_id
     *
     * @return the value of student.student_id
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.student_id
     *
     * @param studentId the value for student.student_id
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.name
     *
     * @return the value of student.name
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.name
     *
     * @param name the value for student.name
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sex
     *
     * @return the value of student.sex
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sex
     *
     * @param sex the value for student.sex
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.political_status
     *
     * @return the value of student.political_status
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    @Override
    public String getKey() {
        return studentId;
    }

    @Override
    public int keyLength() {
        return KEY_LENGTH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.political_status
     *
     * @param politicalStatus the value for student.political_status
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.nation
     *
     * @return the value of student.nation
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getNation() {
        return nation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.nation
     *
     * @param nation the value for student.nation
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.identity_num
     *
     * @return the value of student.identity_num
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getIdentityNum() {
        return identityNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.identity_num
     *
     * @param identityNum the value for student.identity_num
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum == null ? null : identityNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.instructor_name
     *
     * @return the value of student.instructor_name
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getInstructorName() {
        return instructorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.instructor_name
     *
     * @param instructorName the value for student.instructor_name
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName == null ? null : instructorName.trim();
    }

    @Override
    public String getIdentityKey() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.password
     *
     * @return the value of student.password
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.password
     *
     * @param password the value for student.password
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.birth
     *
     * @return the value of student.birth
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.birth
     *
     * @param birth the value for student.birth
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.ethnic
     *
     * @return the value of student.ethnic
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getEthnic() {
        return ethnic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.ethnic
     *
     * @param ethnic the value for student.ethnic
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setEthnic(String ethnic) {
        this.ethnic = ethnic == null ? null : ethnic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.admission_date
     *
     * @return the value of student.admission_date
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public Date getAdmissionDate() {
        return admissionDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.admission_date
     *
     * @param admissionDate the value for student.admission_date
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.academy
     *
     * @return the value of student.academy
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getAcademy() {
        return academy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.academy
     *
     * @param academy the value for student.academy
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.cls
     *
     * @return the value of student.cls
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getCls() {
        return cls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.cls
     *
     * @param cls the value for student.cls
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setCls(String cls) {
        this.cls = cls == null ? null : cls.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.dormitory_id
     *
     * @return the value of student.dormitory_id
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getDormitoryId() {
        return dormitoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.dormitory_id
     *
     * @param dormitoryId the value for student.dormitory_id
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setDormitoryId(String dormitoryId) {
        this.dormitoryId = dormitoryId == null ? null : dormitoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.personal_phone
     *
     * @return the value of student.personal_phone
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getPersonalPhone() {
        return personalPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.personal_phone
     *
     * @param personalPhone the value for student.personal_phone
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone == null ? null : personalPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.parent_phone
     *
     * @return the value of student.parent_phone
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getParentPhone() {
        return parentPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.parent_phone
     *
     * @param parentPhone the value for student.parent_phone
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone == null ? null : parentPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.province
     *
     * @return the value of student.province
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.province
     *
     * @param province the value for student.province
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.city
     *
     * @return the value of student.city
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.city
     *
     * @param city the value for student.city
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.county
     *
     * @return the value of student.county
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.county
     *
     * @param county the value for student.county
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.address_detail
     *
     * @return the value of student.address_detail
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.address_detail
     *
     * @param addressDetail the value for student.address_detail
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.remark
     *
     * @return the value of student.remark
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.remark
     *
     * @param remark the value for student.remark
     *
     * @mbg.generated Fri Jun 05 22:25:24 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}