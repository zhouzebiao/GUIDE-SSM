package com.guide.ssm.module.user.mapper;

import com.guide.ssm.module.user.pojo.TbProvince;
import java.util.List;

public interface TbProvinceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_province
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_province
     *
     * @mbggenerated
     */
    int insert(TbProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_province
     *
     * @mbggenerated
     */
    TbProvince selectByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_province
     *
     * @mbggenerated
     */
    List<TbProvince> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_province
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbProvince record);
}