package com.guide.ssm.module.user.pojo;

public class TbLine {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_line.Lid
     *
     * @mbggenerated
     */
    private String lid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_line.Line
     *
     * @mbggenerated
     */
    private String line;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_line.Time
     *
     * @mbggenerated
     */
    private Boolean time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_line.Style
     *
     * @mbggenerated
     */
    private String style;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_line
     *
     * @mbggenerated
     */
    public TbLine(String lid, String line, Boolean time, String style) {
        this.lid = lid;
        this.line = line;
        this.time = time;
        this.style = style;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_line.Lid
     *
     * @return the value of tb_line.Lid
     *
     * @mbggenerated
     */
    public String getLid() {
        return lid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_line.Line
     *
     * @return the value of tb_line.Line
     *
     * @mbggenerated
     */
    public String getLine() {
        return line;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_line.Time
     *
     * @return the value of tb_line.Time
     *
     * @mbggenerated
     */
    public Boolean getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_line.Style
     *
     * @return the value of tb_line.Style
     *
     * @mbggenerated
     */
    public String getStyle() {
        return style;
    }
}