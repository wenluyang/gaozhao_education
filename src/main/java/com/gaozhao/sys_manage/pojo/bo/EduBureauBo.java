package com.gaozhao.sys_manage.pojo.bo;

import java.util.Date;

public class EduBureauBo {
    private String id;
    private String fkcode;//教育局外键
    private String eduName;//教育局名字
    private String provinceCode;//教育局省代码
    private String cityCode;//教育局市代码
    private String districtCode;//教育局区代码
    private String eduCode;// 教育局编号
    private String tel;//教育局电话
    private Date validStartTime;//服务有效开始时间
    private Date validEndTime;//服务开始结束时间
    private String state;//状态
    private String eduLocus;//教育局在地

    public String getEduLocus() {
        return eduLocus;
    }

    public void setEduLocus(String eduLocus) {
        this.eduLocus = eduLocus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFkcode() {
        return fkcode;
    }

    public void setFkcode(String fkcode) {
        this.fkcode = fkcode;
    }

    public String getEduName() {
        return eduName;
    }

    public void setEduName(String eduName) {
        this.eduName = eduName;
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

    public String getEduCode() {
        return eduCode;
    }

    public void setEduCode(String eduCode) {
        this.eduCode = eduCode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
