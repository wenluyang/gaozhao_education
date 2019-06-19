package com.gaozhao.sys_manage.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class SysSchoolUserForm {
    @ApiModelProperty(value = "用户名",required = true)
    private String userAccount;
    @ApiModelProperty(value = "密码",required = true)
    private String pwd;
    @ApiModelProperty(value = "从属于教育局还是学校")
    private Long byFkcode;
    @ApiModelProperty(value = "用户等级")
    private Integer Identity;
    @ApiModelProperty(value = "创建者的标识符")
    private Long creatorFkCode;

    public Long getCreatorFkCode() {
        return creatorFkCode;
    }

    public void setCreatorFkCode(Long creatorFkCode) {
        this.creatorFkCode = creatorFkCode;
    }

    public Integer getIdentity() {
        return Identity;
    }

    public void setIdentity(Integer identity) {
        Identity = identity;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Long getByFkcode() {
        return byFkcode;
    }

    public void setByFkcode(Long byFkcode) {
        this.byFkcode = byFkcode;
    }
}
