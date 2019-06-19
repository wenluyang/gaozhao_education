package com.gaozhao.sys_manage.pojo.domain;
public class SysUser {
    private Long id;
    private java.util.Date updateTime;//更新时间
    private Long creatorFkcode;//创建者的fk_code
    private java.util.Date createTime;//创建时间
    private Integer identity;//用户的身份(1学生，2校长，3教职工，4教育局用户,5学校管理员,6超级管理员)
    private String userAccount;//用户账号
    private Integer delStatus;//删除状态
    private Long byFkcode;//用户所属于的教育局和学校
    private Long fkCode;//用户关联的用户fk_code(这里可以是教职工，学生，后期还可以是家长)
    private String pwd;//用户密码
    public SysUser() {
        super();
    }
    public SysUser(Long id,java.util.Date updateTime,Long creatorFkcode,java.util.Date createTime,Integer identity,String userAccount,Integer delStatus,Long byFkcode,Long fkCode,String pwd) {
        super();
        this.id = id;
        this.updateTime = updateTime;
        this.creatorFkcode = creatorFkcode;
        this.createTime = createTime;
        this.identity = identity;
        this.userAccount = userAccount;
        this.delStatus = delStatus;
        this.byFkcode = byFkcode;
        this.fkCode = fkCode;
        this.pwd = pwd;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreatorFkcode() {
        return this.creatorFkcode;
    }

    public void setCreatorFkcode(Long creatorFkcode) {
        this.creatorFkcode = creatorFkcode;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIdentity() {
        return this.identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Integer getDelStatus() {
        return this.delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Long getByFkcode() {
        return this.byFkcode;
    }

    public void setByFkcode(Long byFkcode) {
        this.byFkcode = byFkcode;
    }

    public Long getFkCode() {
        return this.fkCode;
    }

    public void setFkCode(Long fkCode) {
        this.fkCode = fkCode;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
