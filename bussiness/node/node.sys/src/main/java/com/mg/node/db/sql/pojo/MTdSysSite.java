package com.mg.node.db.sql.pojo;

import java.util.Date;

public class MTdSysSite {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_td_sys_site.id
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_td_sys_site.siteName
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    private String siteName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_td_sys_site.password
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_td_sys_site.displayName
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    private String displayName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_td_sys_site.siteType
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    private Integer siteType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_td_sys_site.timeCreated
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    private Date timeCreated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_td_sys_site.id
     *
     * @return the value of m_td_sys_site.id
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_td_sys_site.id
     *
     * @param id the value for m_td_sys_site.id
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_td_sys_site.siteName
     *
     * @return the value of m_td_sys_site.siteName
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_td_sys_site.siteName
     *
     * @param siteName the value for m_td_sys_site.siteName
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_td_sys_site.password
     *
     * @return the value of m_td_sys_site.password
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_td_sys_site.password
     *
     * @param password the value for m_td_sys_site.password
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_td_sys_site.displayName
     *
     * @return the value of m_td_sys_site.displayName
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_td_sys_site.displayName
     *
     * @param displayName the value for m_td_sys_site.displayName
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_td_sys_site.siteType
     *
     * @return the value of m_td_sys_site.siteType
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public Integer getSiteType() {
        return siteType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_td_sys_site.siteType
     *
     * @param siteType the value for m_td_sys_site.siteType
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public void setSiteType(Integer siteType) {
        this.siteType = siteType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_td_sys_site.timeCreated
     *
     * @return the value of m_td_sys_site.timeCreated
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_td_sys_site.timeCreated
     *
     * @param timeCreated the value for m_td_sys_site.timeCreated
     *
     * @mbggenerated Tue Aug 18 21:06:41 GMT+08:00 2020
     */
    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
}