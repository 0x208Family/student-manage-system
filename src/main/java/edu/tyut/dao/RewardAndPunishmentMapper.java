package edu.tyut.dao;

import edu.tyut.bean.mgb.RewardAndPunishment;
import edu.tyut.bean.mgb.RewardAndPunishmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardAndPunishmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward_and_punishment
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    long countByExample(RewardAndPunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward_and_punishment
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int deleteByExample(RewardAndPunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward_and_punishment
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int insert(RewardAndPunishment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward_and_punishment
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int insertSelective(RewardAndPunishment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward_and_punishment
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    List<RewardAndPunishment> selectByExample(RewardAndPunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward_and_punishment
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int updateByExampleSelective(@Param("record") RewardAndPunishment record, @Param("example") RewardAndPunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reward_and_punishment
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int updateByExample(@Param("record") RewardAndPunishment record, @Param("example") RewardAndPunishmentExample example);
}