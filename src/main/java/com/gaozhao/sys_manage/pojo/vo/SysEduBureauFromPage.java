package com.gaozhao.sys_manage.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class SysEduBureauFromPage {
    @ApiModelProperty(value = "当前页", dataType = "Long", required = true)
    private Long pageNo;// 当前页
    @ApiModelProperty(value = "每页记录数", dataType = "Long", required = true)
    private Long pageSize;// 每页记录数
    @ApiModelProperty(value="教育局编码 ",dataType="String")
    private String eduCode;// 教育局编码
    @ApiModelProperty(value="教育局所属省代码 ",dataType="Long")
    private String provinceCode;//教育局所属省代码
    @ApiModelProperty(value="服务开始时间",dataType="Date")
    private java.util.Date validStartTime;// 服务开始时间
    @ApiModelProperty(value="服务结束时间 ",dataType="Date")
    private java.util.Date validEndTime;// 服务结束时间
    @ApiModelProperty(value="教育局名称 ",dataType="String")
    private String eduName;// 教育局名称
    @ApiModelProperty(value="教育局所属城市代码 ",dataType="Long")
    private String cityCode;//教育局所属城市代码
    @ApiModelProperty(value="教育局所属地区代码 ",dataType="Long")
    private String districtCode;//教育局所属地区代码
    @ApiModelProperty(value="状态",dataType="String")
    private String state;//状态


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public String getEduCode() {
        return eduCode;
    }

    public void setEduCode(String eduCode) {
        this.eduCode = eduCode;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Date getValidStartTime() {
        return validStartTime;
    }

    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    public String getEduName() {
        return eduName;
    }

    public void setEduName(String eduName) {
        this.eduName = eduName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
}
