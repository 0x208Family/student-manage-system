package edu.tyut.dao;

import edu.tyut.bean.mbg.Province;
import edu.tyut.bean.example.ProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvinceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    long countByExample(ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int deleteByExample(ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int insert(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int insertSelective(Province record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    List<Province> selectByExample(ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table province
     *
     * @mbg.generated Fri Jun 05 21:19:30 CST 2020
     */
    int updateByExample(@Param("record") Province record, @Param("example") ProvinceExample example);
}