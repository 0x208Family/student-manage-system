package edu.tyut.dao;

import edu.tyut.bean.mgb.Cls;
import edu.tyut.bean.mgb.ClsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cls
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    long countByExample(ClsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cls
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int deleteByExample(ClsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cls
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int insert(Cls record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cls
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int insertSelective(Cls record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cls
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    List<Cls> selectByExample(ClsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cls
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") Cls record, @Param("example") ClsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cls
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int updateByExample(@Param("record") Cls record, @Param("example") ClsExample example);
}