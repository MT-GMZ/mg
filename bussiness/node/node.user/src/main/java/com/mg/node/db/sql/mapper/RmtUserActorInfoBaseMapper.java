package com.mg.node.db.sql.mapper;

import com.mg.node.db.sql.pojo.RmtUserActorInfo;

public interface RmtUserActorInfoBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_user_actor_info
     *
     * @mbggenerated Tue Jun 02 11:46:37 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_user_actor_info
     *
     * @mbggenerated Tue Jun 02 11:46:37 CST 2020
     */
    int insert(RmtUserActorInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_user_actor_info
     *
     * @mbggenerated Tue Jun 02 11:46:37 CST 2020
     */
    int insertSelective(RmtUserActorInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_user_actor_info
     *
     * @mbggenerated Tue Jun 02 11:46:37 CST 2020
     */
    RmtUserActorInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_user_actor_info
     *
     * @mbggenerated Tue Jun 02 11:46:37 CST 2020
     */
    int updateByPrimaryKeySelective(RmtUserActorInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmt_user_actor_info
     *
     * @mbggenerated Tue Jun 02 11:46:37 CST 2020
     */
    int updateByPrimaryKey(RmtUserActorInfo record);
}