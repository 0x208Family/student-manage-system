package edu.tyut.dao;

import edu.tyut.bean.mgb.TransferInformation;
import edu.tyut.bean.mgb.TransferInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_information
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    long countByExample(TransferInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_information
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int deleteByExample(TransferInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_information
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int insert(TransferInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_information
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int insertSelective(TransferInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_information
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    List<TransferInformation> selectByExample(TransferInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_information
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int updateByExampleSelective(@Param("record") TransferInformation record, @Param("example") TransferInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transfer_information
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int updateByExample(@Param("record") TransferInformation record, @Param("example") TransferInformationExample example);
}