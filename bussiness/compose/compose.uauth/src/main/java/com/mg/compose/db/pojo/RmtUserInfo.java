package com.mg.compose.db.pojo;

import java.util.Date;

public class RmtUserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.id
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.userCode
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String usercode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.userName
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.userPassword
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String userpassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.displayName
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String displayname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.userThumb
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String userthumb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.workCode
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String workcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.oganizationID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String oganizationid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.departmentID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String departmentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.userExtendID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String userextendid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.createdTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.createUserID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String createuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.modifyTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private Date modifytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.modifyUserID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String modifyuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.deletedTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private Date deletedtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.deletedUserID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String deleteduserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.deletedFlag
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private Byte deletedflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.limitedTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private Date limitedtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.loginCount
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private Byte logincount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.selectCondition
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private Byte selectcondition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.systemUserFlag
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private Byte systemuserflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.reserved1
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private Integer reserved1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rmt_user_info.reserved2
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    private String reserved2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.id
     *
     * @return the value of rmt_user_info.id
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.id
     *
     * @param id the value for rmt_user_info.id
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.userCode
     *
     * @return the value of rmt_user_info.userCode
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.userCode
     *
     * @param usercode the value for rmt_user_info.userCode
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.userName
     *
     * @return the value of rmt_user_info.userName
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.userName
     *
     * @param username the value for rmt_user_info.userName
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.userPassword
     *
     * @return the value of rmt_user_info.userPassword
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.userPassword
     *
     * @param userpassword the value for rmt_user_info.userPassword
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.displayName
     *
     * @return the value of rmt_user_info.displayName
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.displayName
     *
     * @param displayname the value for rmt_user_info.displayName
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname == null ? null : displayname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.userThumb
     *
     * @return the value of rmt_user_info.userThumb
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getUserthumb() {
        return userthumb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.userThumb
     *
     * @param userthumb the value for rmt_user_info.userThumb
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setUserthumb(String userthumb) {
        this.userthumb = userthumb == null ? null : userthumb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.workCode
     *
     * @return the value of rmt_user_info.workCode
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getWorkcode() {
        return workcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.workCode
     *
     * @param workcode the value for rmt_user_info.workCode
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setWorkcode(String workcode) {
        this.workcode = workcode == null ? null : workcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.oganizationID
     *
     * @return the value of rmt_user_info.oganizationID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getOganizationid() {
        return oganizationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.oganizationID
     *
     * @param oganizationid the value for rmt_user_info.oganizationID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setOganizationid(String oganizationid) {
        this.oganizationid = oganizationid == null ? null : oganizationid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.departmentID
     *
     * @return the value of rmt_user_info.departmentID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.departmentID
     *
     * @param departmentid the value for rmt_user_info.departmentID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.userExtendID
     *
     * @return the value of rmt_user_info.userExtendID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getUserextendid() {
        return userextendid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.userExtendID
     *
     * @param userextendid the value for rmt_user_info.userExtendID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setUserextendid(String userextendid) {
        this.userextendid = userextendid == null ? null : userextendid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.createdTime
     *
     * @return the value of rmt_user_info.createdTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.createdTime
     *
     * @param createdtime the value for rmt_user_info.createdTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.createUserID
     *
     * @return the value of rmt_user_info.createUserID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getCreateuserid() {
        return createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.createUserID
     *
     * @param createuserid the value for rmt_user_info.createUserID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.modifyTime
     *
     * @return the value of rmt_user_info.modifyTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.modifyTime
     *
     * @param modifytime the value for rmt_user_info.modifyTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.modifyUserID
     *
     * @return the value of rmt_user_info.modifyUserID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getModifyuserid() {
        return modifyuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.modifyUserID
     *
     * @param modifyuserid the value for rmt_user_info.modifyUserID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setModifyuserid(String modifyuserid) {
        this.modifyuserid = modifyuserid == null ? null : modifyuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.deletedTime
     *
     * @return the value of rmt_user_info.deletedTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public Date getDeletedtime() {
        return deletedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.deletedTime
     *
     * @param deletedtime the value for rmt_user_info.deletedTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setDeletedtime(Date deletedtime) {
        this.deletedtime = deletedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.deletedUserID
     *
     * @return the value of rmt_user_info.deletedUserID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getDeleteduserid() {
        return deleteduserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.deletedUserID
     *
     * @param deleteduserid the value for rmt_user_info.deletedUserID
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setDeleteduserid(String deleteduserid) {
        this.deleteduserid = deleteduserid == null ? null : deleteduserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.deletedFlag
     *
     * @return the value of rmt_user_info.deletedFlag
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public Byte getDeletedflag() {
        return deletedflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.deletedFlag
     *
     * @param deletedflag the value for rmt_user_info.deletedFlag
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setDeletedflag(Byte deletedflag) {
        this.deletedflag = deletedflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.limitedTime
     *
     * @return the value of rmt_user_info.limitedTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public Date getLimitedtime() {
        return limitedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.limitedTime
     *
     * @param limitedtime the value for rmt_user_info.limitedTime
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setLimitedtime(Date limitedtime) {
        this.limitedtime = limitedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.loginCount
     *
     * @return the value of rmt_user_info.loginCount
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public Byte getLogincount() {
        return logincount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.loginCount
     *
     * @param logincount the value for rmt_user_info.loginCount
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setLogincount(Byte logincount) {
        this.logincount = logincount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.selectCondition
     *
     * @return the value of rmt_user_info.selectCondition
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public Byte getSelectcondition() {
        return selectcondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.selectCondition
     *
     * @param selectcondition the value for rmt_user_info.selectCondition
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setSelectcondition(Byte selectcondition) {
        this.selectcondition = selectcondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.systemUserFlag
     *
     * @return the value of rmt_user_info.systemUserFlag
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public Byte getSystemuserflag() {
        return systemuserflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.systemUserFlag
     *
     * @param systemuserflag the value for rmt_user_info.systemUserFlag
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setSystemuserflag(Byte systemuserflag) {
        this.systemuserflag = systemuserflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.reserved1
     *
     * @return the value of rmt_user_info.reserved1
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public Integer getReserved1() {
        return reserved1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.reserved1
     *
     * @param reserved1 the value for rmt_user_info.reserved1
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setReserved1(Integer reserved1) {
        this.reserved1 = reserved1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rmt_user_info.reserved2
     *
     * @return the value of rmt_user_info.reserved2
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rmt_user_info.reserved2
     *
     * @param reserved2 the value for rmt_user_info.reserved2
     *
     * @mbggenerated Mon Dec 02 11:28:06 CST 2019
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
    }
}