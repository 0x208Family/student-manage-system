package edu.tyut.dao;

import edu.tyut.bean.mgb.ElectiveScore;
import edu.tyut.bean.mgb.ElectiveScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElectiveScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table elective_score
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    long countByExample(ElectiveScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table elective_score
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int deleteByExample(ElectiveScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table elective_score
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int insert(ElectiveScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table elective_score
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int insertSelective(ElectiveScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table elective_score
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    List<ElectiveScore> selectByExample(ElectiveScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table elective_score
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") ElectiveScore record, @Param("example") ElectiveScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table elective_score
     *
     * @mbg.generated Mon Jun 01 14:23:16 CST 2020
     */
    int updateByExample(@Param("record") ElectiveScore record, @Param("example") ElectiveScoreExample example);
}