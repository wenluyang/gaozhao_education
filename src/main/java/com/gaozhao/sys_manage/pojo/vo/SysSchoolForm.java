package com.gaozhao.sys_manage.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel
public class SysSchoolForm {
    @ApiModelProperty(value = "学校名称",required = true)
    private String schoolName;
    @ApiModelProperty(value = "学校所在省份代码",required = true)
    private Integer provinceCode;
    @ApiModelProperty(value = "学校所在城市代码",required = true)
    private Integer cityCode;
    @ApiModelProperty(value = "学校所在地区代码",required = true)
    private Integer districtCode;
    @ApiModelProperty(value = "学校服务开始时间",required = true)
    private String validStartTime;//服务开始时间
    @ApiModelProperty(value = "学校服务结束时间",required = true)
    private String validEndTime;//服务结束时间
    @ApiModelProperty(value = "学校电话")
    private String schoolTel;//学校电话
    @ApiModelProperty(value = "学校所属教育局",required = true)
    private Long eduBureauFkcode;//教育局(Sys_Edu_Bureau)外键唯一标识

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public String getValidStartTime() {
        return validStartTime;
    }

    public void setValidStartTime(String validStartTime) {
        this.validStartTime = validStartTime;
    }

    public String getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(String validEndTime) {
        this.validEndTime = validEndTime;
    }

    public String getSchoolTel() {
        return schoolTel;
    }

    public void setSchoolTel(String schoolTel) {
        this.schoolTel = schoolTel;
    }

    public Long getEduBureauFkcode() {
        return eduBureauFkcode;
    }

    public void setEduBureauFkcode(Long eduBureauFkcode) {
        this.eduBureauFkcode = eduBureauFkcode;
    }
}
