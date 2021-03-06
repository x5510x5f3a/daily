package com.kidoo.daily.domain.sec;

import java.util.Date;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_role.role_id
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_role.role_name
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_role.created_time
     *
     * @mbggenerated
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sec_role.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_role
     *
     * @mbggenerated
     */
    public Role(Integer roleId, String roleName, Date createdTime, Date updateTime) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_role
     *
     * @mbggenerated
     */
    public Role() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_role.role_id
     *
     * @return the value of sec_role.role_id
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_role.role_id
     *
     * @param roleId the value for sec_role.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_role.role_name
     *
     * @return the value of sec_role.role_name
     *
     * @mbggenerated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_role.role_name
     *
     * @param roleName the value for sec_role.role_name
     *
     * @mbggenerated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_role.created_time
     *
     * @return the value of sec_role.created_time
     *
     * @mbggenerated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_role.created_time
     *
     * @param createdTime the value for sec_role.created_time
     *
     * @mbggenerated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sec_role.update_time
     *
     * @return the value of sec_role.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sec_role.update_time
     *
     * @param updateTime the value for sec_role.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}