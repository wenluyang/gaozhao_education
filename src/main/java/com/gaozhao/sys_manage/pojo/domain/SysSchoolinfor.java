package com.gaozhao.sys_manage.pojo.domain;
public class SysSchoolinfor {
    private Long id;
    private Long fkCode;//外键唯一标识
    private java.util.Date setupTime;//学校创建时间
    private String schoolEnglishAme;//学校英文名称
    private java.util.Date validStartTime;//服务开始时间
    private Long schoolArea;//学校面积
    private java.util.Date createTime;//创建时间
    private String schoolProfile;//学校简介
    private String schoolName;//学校名称
    private Integer cityCode;//学校所属城市代码
    private Long eduBureauFkcode;//教育局(Sys_Edu_Bureau)外键唯一标识
    private Integer delStatus;//删除状态
    private String schoolImage;//学校的图片URL
    private Integer provinceCode;//学校所属省份编号
    private String schoolLatlng;//学校经纬度，格式(22，113)
    private java.util.Date updateTime;//更新时间
    private Integer districtCode;//所在地区编号
    private String schoolAddress;//学校地址
    private String schoolMotto;//学校校训
    private String schoolFax;//学校传真
    private java.util.Date validEndTime;//服务结束时间
    private String schoolTel;//学校电话
    private Integer schoolPostcode;//学校邮编
    private Integer schoolNature;//学校办学性质(1公办，2私立)
    public SysSchoolinfor() {
        super();
    }
    public SysSchoolinfor(Long id,Long fkCode,java.util.Date setupTime,String schoolEnglishAme,java.util.Date validStartTime,Long schoolArea,java.util.Date createTime,String schoolProfile,String schoolName,Integer cityCode,Long eduBureauFkcode,Integer delStatus,String schoolImage,Integer provinceCode,String schoolLatlng,java.util.Date updateTime,Integer districtCode,String schoolAddress,String schoolMotto,String schoolFax,java.util.Date validEndTime,String schoolTel,Integer schoolPostcode,Integer schoolNature) {
        super();
        this.id = id;
        this.fkCode = fkCode;
        this.setupTime = setupTime;
        this.schoolEnglishAme = schoolEnglishAme;
        this.validStartTime = validStartTime;
        this.schoolArea = schoolArea;
        this.createTime = createTime;
        this.schoolProfile = schoolProfile;
        this.schoolName = schoolName;
        this.cityCode = cityCode;
        this.eduBureauFkcode = eduBureauFkcode;
        this.delStatus = delStatus;
        this.schoolImage = schoolImage;
        this.provinceCode = provinceCode;
        this.schoolLatlng = schoolLatlng;
        this.updateTime = updateTime;
        this.districtCode = districtCode;
        this.schoolAddress = schoolAddress;
        this.schoolMotto = schoolMotto;
        this.schoolFax = schoolFax;
        this.validEndTime = validEndTime;
        this.schoolTel = schoolTel;
        this.schoolPostcode = schoolPostcode;
        this.schoolNature = schoolNature;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkCode() {
        return this.fkCode;
    }

    public void setFkCode(Long fkCode) {
        this.fkCode = fkCode;
    }

    public java.util.Date getSetupTime() {
        return this.setupTime;
    }

    public void setSetupTime(java.util.Date setupTime) {
        this.setupTime = setupTime;
    }

    public String getSchoolEnglishAme() {
        return this.schoolEnglishAme;
    }

    public void setSchoolEnglishAme(String schoolEnglishAme) {
        this.schoolEnglishAme = schoolEnglishAme;
    }

    public java.util.Date getValidStartTime() {
        return this.validStartTime;
    }

    public void setValidStartTime(java.util.Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    public Long getSchoolArea() {
        return this.schoolArea;
    }

    public void setSchoolArea(Long schoolArea) {
        this.schoolArea = schoolArea;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public String getSchoolProfile() {
        return this.schoolProfile;
    }

    public void setSchoolProfile(String schoolProfile) {
        this.schoolProfile = schoolProfile;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Long getEduBureauFkcode() {
        return this.eduBureauFkcode;
    }

    public void setEduBureauFkcode(Long eduBureauFkcode) {
        this.eduBureauFkcode = eduBureauFkcode;
    }

    public Integer getDelStatus() {
        return this.delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public String getSchoolImage() {
        return this.schoolImage;
    }

    public void setSchoolImage(String schoolImage) {
        this.schoolImage = schoolImage;
    }

    public Integer getProvinceCode() {
        return this.provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getSchoolLatlng() {
        return this.schoolLatlng;
    }

    public void setSchoolLatlng(String schoolLatlng) {
        this.schoolLatlng = schoolLatlng;
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

    public String getSchoolAddress() {
        return this.schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolMotto() {
        return this.schoolMotto;
    }

    public void setSchoolMotto(String schoolMotto) {
        this.schoolMotto = schoolMotto;
    }

    public String getSchoolFax() {
        return this.schoolFax;
    }

    public void setSchoolFax(String schoolFax) {
        this.schoolFax = schoolFax;
    }

    public java.util.Date getValidEndTime() {
        return this.validEndTime;
    }

    public void setValidEndTime(java.util.Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    public String getSchoolTel() {
        return this.schoolTel;
    }

    public void setSchoolTel(String schoolTel) {
        this.schoolTel = schoolTel;
    }

    public Integer getSchoolPostcode() {
        return this.schoolPostcode;
    }

    public void setSchoolPostcode(Integer schoolPostcode) {
        this.schoolPostcode = schoolPostcode;
    }

    public Integer getSchoolNature() {
        return this.schoolNature;
    }

    public void setSchoolNature(Integer schoolNature) {
        this.schoolNature = schoolNature;
    }

}
