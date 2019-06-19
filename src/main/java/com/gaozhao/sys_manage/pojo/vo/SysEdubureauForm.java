package com.gaozhao.sys_manage.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class SysEdubureauForm {
    @ApiModelProperty(value = "ID",hidden = true)
    private  String id;

	@ApiModelProperty(value = "教育机构编码")
	private String eduCode;//教育机构编号

	@ApiModelProperty(value = "服务开始时间")
    private String validStartTime;//服务开始时间

    @ApiModelProperty(value = "城市ID")
    private Integer cityCode;//城市ID

    @ApiModelProperty(value = "省份ID")
    private Integer provinceCode;//省份ID

    @ApiModelProperty(value = "教育局名称")
    private String eduName;//教育局名称

    @ApiModelProperty(value = "地区ID")
    private Integer districtCode;//地区ID

    @ApiModelProperty(value = "服务结束时间")
    private String validEndTime;//服务结束时间

    @ApiModelProperty(value = "电话")
    private String tel;//电话

    public String getEduCode() {
        return eduCode;
    }

    public void setEduCode(String eduCode) {
        this.eduCode = eduCode;
    }

    public String getValidStartTime() {
        return validStartTime;
    }

    public void setValidStartTime(String validStartTime) {
        this.validStartTime = validStartTime;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getEduName() {
        return eduName;
    }

    public void setEduName(String eduName) {
        this.eduName = eduName;
    }

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public String getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(String validEndTime) {
        this.validEndTime = validEndTime;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
