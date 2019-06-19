package com.gaozhao.sys_manage.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel
public class SysUserFormPage {
    @ApiModelProperty(value = "当前页", dataType = "Long", required = true)
    private Long pageNo;// 当前页
    @ApiModelProperty(value = "每页记录数", dataType = "Long", required = true)
    private Long pageSize;// 每页记录数
    @ApiModelProperty(value = "所在省份代码", dataType = "String")
    private String provinceCode; //所在省份代码
    @ApiModelProperty(value = "所在城市代码", dataType = "String")
    private String cityCode;//所在城市代码
    @ApiModelProperty(value = "所在区域代码", dataType = "String")
    private String districtCode;//所在区域代码
    @ApiModelProperty(value = "用户名或者姓名", dataType = "String")
    private String name;//用户名或者姓名
    @ApiModelProperty(value = "用户级别",required = true)
    private String identity; //用户级别

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
