package com.guide.ssm.module.user.mapper;

import com.guide.ssm.module.user.pojo.TbAdvice;
import java.util.List;

public interface TbAdviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_advice
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String adid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_advice
     *
     * @mbggenerated
     */
    int insert(TbAdvice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_advice
     *
     * @mbggenerated
     */
    TbAdvice selectByPrimaryKey(String adid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_advice
     *
     * @mbggenerated
     */
    List<TbAdvice> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_advice
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbAdvice record);
}