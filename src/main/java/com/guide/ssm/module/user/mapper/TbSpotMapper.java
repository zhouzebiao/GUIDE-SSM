package com.guide.ssm.module.user.mapper;

import com.guide.ssm.module.user.pojo.TbSpot;
import java.util.List;

public interface TbSpotMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    int insert(TbSpot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    TbSpot selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    List<TbSpot> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_spot
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbSpot record);
}