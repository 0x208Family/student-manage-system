package edu.tyut.dao;

import edu.tyut.bean.mgb.County;
import edu.tyut.bean.mgb.CountyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Mon Jun 01 17:31:13 CST 2020
     */
    long countByExample(CountyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Mon Jun 01 17:31:13 CST 2020
     */
    int deleteByExample(CountyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Mon Jun 01 17:31:13 CST 2020
     */
    int insert(County record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Mon Jun 01 17:31:13 CST 2020
     */
    int insertSelective(County record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Mon Jun 01 17:31:13 CST 2020
     */
    List<County> selectByExample(CountyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Mon Jun 01 17:31:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") County record, @Param("example") CountyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table county
     *
     * @mbg.generated Mon Jun 01 17:31:13 CST 2020
     */
    int updateByExample(@Param("record") County record, @Param("example") CountyExample example);
}