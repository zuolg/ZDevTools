package com.z.zdev.bean;

/**
 * Created by Zz on 2016/3/28.
 */
public class UserChilBean {

    /**
     * id
     */
    public Integer id;
    /**
     * 创建时间
     */
    public String createTime;
    /**
     * 类型，0=法人单位；1=个人
     */
    public Integer ownerType;
    /**
     * 手机，11位数字
     */
    public String phone;
    /**
     * 邮箱
     */
    public String email;
    /**
     * 真实姓名
     */
    public String realname;
    /**
     * 身份证号
     */
    public String idcard;
    /**
     * 死亡日期
     */
    private String deathtime;
    /**
     * 地址
     */
    public String address;
    /**
     * 单位名称
     */
    public String orgName;
    /**
     * 组织机构代码
     */
    public String orgCode;
    /**
     * 税务登记号
     */
    public String taxid;
    /**
     * 营业执照编号
     */
    public String bizCode;
    /**
     * 联系人
     */
    public String contacts;
    /**
     * 联系人电话
     */
    public String contactsPhone;
    /**
     * 持证人
     */
    public String holderName;
    /**
     * 持证人身份证号码
     */
    public String holderIdcode;
    /**
     * 法人姓名
     */
    public String legalName;
    /**
     * 法人身份证号码
     */
    public String legalIdcard;
    /**
     * 公司地址
     */
    public String orgAddress;
    /** */
    public String username;
    /**
     * 省
     */
    public String province;
    /**
     * 市
     */
    public String city;
    /**
     * 区
     */
    public String district;
    /**
     * 省/自治区/直辖市名 名字
     */
    public String provinceName;
    /**
     * 州/市名 名字
     */
    public String cityName;
    /**
     * 县/区名 名字
     */
    public String districtName;
    /**
     * 权属人是否可用(0不可用，1可用)
     */
    private Integer canuse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getDeathtime() {
        return deathtime;
    }

    public void setDeathtime(String deathtime) {
        this.deathtime = deathtime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getTaxid() {
        return taxid;
    }

    public void setTaxid(String taxid) {
        this.taxid = taxid;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderIdcode() {
        return holderIdcode;
    }

    public void setHolderIdcode(String holderIdcode) {
        this.holderIdcode = holderIdcode;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalIdcard() {
        return legalIdcard;
    }

    public void setLegalIdcard(String legalIdcard) {
        this.legalIdcard = legalIdcard;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Integer getCanuse() {
        return canuse;
    }

    public void setCanuse(Integer canuse) {
        this.canuse = canuse;
    }
}
