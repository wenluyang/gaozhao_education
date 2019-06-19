package com.gaozhao.sys_manage.pojo.domain;
public class SysEdubureau {
    private Long id;
    private String eduCode;//教育机构编号
    private java.util.Date validStartTime;//服务开始时间
    private java.util.Date createTime;//创建时间
    private Integer cityCode;//城市ID
    private Integer delStatus;//删除状态
    private Integer provinceCode;//省份ID
    private String eduName;//教育局名称
    private java.util.Date updateTime;//更新时间
    private Integer districtCode;//地区ID
    private java.util.Date validEndTime;//服务结束时间
    private String tel;//电话
    private Long fkCode;//唯一外键标识符
    public SysEdubureau() {
        super();
    }
    public SysEdubureau(Long id,String eduCode,java.util.Date validStartTime,java.util.Date createTime,Integer cityCode,Integer delStatus,Integer provinceCode,String eduName,java.util.Date updateTime,Integer districtCode,java.util.Date validEndTime,String tel,Long fkCode) {
        super();
        this.id = id;
        this.eduCode = eduCode;
        this.validStartTime = validStartTime;
        this.createTime = createTime;
        this.cityCode = cityCode;
        this.delStatus = delStatus;
        this.provinceCode = provinceCode;
        this.eduName = eduName;
        this.updateTime = updateTime;
        this.districtCode = districtCode;
        this.validEndTime = validEndTime;
        this.tel = tel;
        this.fkCode = fkCode;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEduCode() {
        return this.eduCode;
    }

    public void setEduCode(String eduCode) {
        this.eduCode = eduCode;
    }

    public java.util.Date getValidStartTime() {
        return this.validStartTime;
    }

    public void setValidStartTime(java.util.Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getDelStatus() {
        return this.delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Integer getProvinceCode() {
        return this.provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getEduName() {
        return this.eduName;
    }

    public void setEduName(String eduName) {
        this.eduName = eduName;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDistrictCode() {
        return this.districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public java.util.Date getValidEndTime() {
        return this.validEndTime;
    }

    public void setValidEndTime(java.util.Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Long getFkCode() {
        return this.fkCode;
    }

    public void setFkCode(Long fkCode) {
        this.fkCode = fkCode;
    }

}
