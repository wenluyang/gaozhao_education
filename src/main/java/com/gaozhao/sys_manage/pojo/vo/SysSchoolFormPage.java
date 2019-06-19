package com.gaozhao.sys_manage.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class SysSchoolFormPage {
    @ApiModelProperty(value = "当前页", dataType = "Long", required = true)
    private Long pageNo;// 当前页
    @ApiModelProperty(value = "每页记录数", dataType = "Long", required = true)
    private Long pageSize;// 每页记录数
    @ApiModelProperty(value = "学校名称", dataType = "String", required = false)
    private String schoolName;//学校名称
    @ApiModelProperty(value = "学校所在省份", dataType = "String", required = false)
    private String provinceCode;//学校所在省份
    @ApiModelProperty(value = "学校所在城市编号", dataType = "String", required = false)
    private String cityCode;//学校所在城市编号
    @ApiModelProperty(value = "学校所在地区编号", dataType = "String", required = false)
    private String districtCode;//学校所在地区编号
    @ApiModelProperty(value = "学校服务开始时间")
    private String validStartTime;//学校服务开始时间
    @ApiModelProperty(value = "学校服务结束时间")
    private String validEndTime; //学校服务结束时间
    @ApiModelProperty(value = "学校状态")
    private String state;

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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
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
}
