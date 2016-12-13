package com.guide.ssm.module.user.mapper;

import com.guide.ssm.module.user.pojo.TbVisitor;
import com.guide.ssm.module.user.pojo.TbVisitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TbVisitorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    int countByExample(TbVisitorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    int deleteByExample(TbVisitorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    @Delete({
        "delete from tb_visitor",
        "where Vid = #{vid,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String vid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    @Insert({
        "insert into tb_visitor (Vid, Visitor, ",
        "Password, Gender, Telephone, ",
        "Email, Lockstate)",
        "values (#{vid,jdbcType=CHAR}, #{visitor,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{gender,jdbcType=BIT}, #{telephone,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{lockstate,jdbcType=BIT})"
    })
    int insert(TbVisitor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    int insertSelective(TbVisitor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    List<TbVisitor> selectByExample(TbVisitorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "Vid, Visitor, Password, Gender, Telephone, Email, Lockstate",
        "from tb_visitor",
        "where Vid = #{vid,jdbcType=CHAR}"
    })
    @ResultMap("BaseResultMap")
    TbVisitor selectByPrimaryKey(String vid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbVisitor record, @Param("example") TbVisitorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbVisitor record, @Param("example") TbVisitorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbVisitor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_visitor
     *
     * @mbggenerated
     */
    @Update({
        "update tb_visitor",
        "set Visitor = #{visitor,jdbcType=VARCHAR},",
          "Password = #{password,jdbcType=VARCHAR},",
          "Gender = #{gender,jdbcType=BIT},",
          "Telephone = #{telephone,jdbcType=VARCHAR},",
          "Email = #{email,jdbcType=VARCHAR},",
          "Lockstate = #{lockstate,jdbcType=BIT}",
        "where Vid = #{vid,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(TbVisitor record);
}