package edu.tyut.dao;

import edu.tyut.bean.mgb.Instructor;
import edu.tyut.bean.mgb.InstructorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstructorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table instructor
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    long countByExample(InstructorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table instructor
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int deleteByExample(InstructorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table instructor
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int insert(Instructor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table instructor
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int insertSelective(Instructor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table instructor
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    List<Instructor> selectByExample(InstructorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table instructor
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") Instructor record, @Param("example") InstructorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table instructor
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int updateByExample(@Param("record") Instructor record, @Param("example") InstructorExample example);
}