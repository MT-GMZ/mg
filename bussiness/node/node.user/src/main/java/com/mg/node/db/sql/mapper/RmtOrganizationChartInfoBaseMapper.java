package com.mg.node.db.sql.mapper;

import com.mg.node.db.sql.pojo.RmtOrganizationChartInfo;

public interface RmtOrganizationChartInfoBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_organization_chart_info
     *
     * @mbggenerated Wed May 20 15:46:04 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_organization_chart_info
     *
     * @mbggenerated Wed May 20 15:46:04 CST 2020
     */
    int insert(RmtOrganizationChartInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_organization_chart_info
     *
     * @mbggenerated Wed May 20 15:46:04 CST 2020
     */
    int insertSelective(RmtOrganizationChartInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_organization_chart_info
     *
     * @mbggenerated Wed May 20 15:46:04 CST 2020
     */
    RmtOrganizationChartInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_organization_chart_info
     *
     * @mbggenerated Wed May 20 15:46:04 CST 2020
     */
    int updateByPrimaryKeySelective(RmtOrganizationChartInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_organization_chart_info
     *
     * @mbggenerated Wed May 20 15:46:04 CST 2020
     */
    int updateByPrimaryKey(RmtOrganizationChartInfo record);
}