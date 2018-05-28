package cn.web.ajdatasynweb.entity;

import java.io.Serializable;
import java.util.Date;

public class SysRegisterTemp implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3885192704424524309L;

	private Integer id;

    private String sysRegisterUniqueId;

    private String phoneNumber;

    private String password;

    private String operatorName;

    private String operatorCardNumber;

    private String cardFrontImg;

    private String cardBackImg;

    private String companyName;

    private String certificateSocialCode;

    private String companyLicenseImg;

    private String legalName;

    private String legalCardNumber;

    private String legalPhone;

    private String legalFrontImg;

    private String legalBackImg;

    private String letterBookModel;

    private Integer isCheckLegal;

    private Integer registerType;

    private String brandApartmentLogo;

    private String brandApartmentName;

    private Integer brandApartmentModel;

    private String brandApartmentTotal;

    private String apartmentManagementImg;

    private String apartmentManagementName;

    private String apartmentManagementProvince;

    private String apartmentManagementCity;

    private String apartmentManagementArea;

    private String apartmentManagementUrl;

    private String apartmentManagementTotal;

    private Date createTime;

    private Date updateTime;

    private Integer checkType;

    private Date checkTime;

    private String checkFalseTotal;

    private String sysElectronicOfficialSeal;

    private String enterpriseOpenName;

    private String bankCardNumber;

    private String bankCardAddress;

    private Integer isCompany;

    private String openProvince;

    private String openCity;

    private Date backupsTime;

    private Integer isBackups;

    private String depositBank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSysRegisterUniqueId() {
        return sysRegisterUniqueId;
    }

    public void setSysRegisterUniqueId(String sysRegisterUniqueId) {
        this.sysRegisterUniqueId = sysRegisterUniqueId == null ? null : sysRegisterUniqueId.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public String getOperatorCardNumber() {
        return operatorCardNumber;
    }

    public void setOperatorCardNumber(String operatorCardNumber) {
        this.operatorCardNumber = operatorCardNumber == null ? null : operatorCardNumber.trim();
    }

    public String getCardFrontImg() {
        return cardFrontImg;
    }

    public void setCardFrontImg(String cardFrontImg) {
        this.cardFrontImg = cardFrontImg == null ? null : cardFrontImg.trim();
    }

    public String getCardBackImg() {
        return cardBackImg;
    }

    public void setCardBackImg(String cardBackImg) {
        this.cardBackImg = cardBackImg == null ? null : cardBackImg.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCertificateSocialCode() {
        return certificateSocialCode;
    }

    public void setCertificateSocialCode(String certificateSocialCode) {
        this.certificateSocialCode = certificateSocialCode == null ? null : certificateSocialCode.trim();
    }

    public String getCompanyLicenseImg() {
        return companyLicenseImg;
    }

    public void setCompanyLicenseImg(String companyLicenseImg) {
        this.companyLicenseImg = companyLicenseImg == null ? null : companyLicenseImg.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalCardNumber() {
        return legalCardNumber;
    }

    public void setLegalCardNumber(String legalCardNumber) {
        this.legalCardNumber = legalCardNumber == null ? null : legalCardNumber.trim();
    }

    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone == null ? null : legalPhone.trim();
    }

    public String getLegalFrontImg() {
        return legalFrontImg;
    }

    public void setLegalFrontImg(String legalFrontImg) {
        this.legalFrontImg = legalFrontImg == null ? null : legalFrontImg.trim();
    }

    public String getLegalBackImg() {
        return legalBackImg;
    }

    public void setLegalBackImg(String legalBackImg) {
        this.legalBackImg = legalBackImg == null ? null : legalBackImg.trim();
    }

    public String getLetterBookModel() {
        return letterBookModel;
    }

    public void setLetterBookModel(String letterBookModel) {
        this.letterBookModel = letterBookModel == null ? null : letterBookModel.trim();
    }

    public Integer getIsCheckLegal() {
        return isCheckLegal;
    }

    public void setIsCheckLegal(Integer isCheckLegal) {
        this.isCheckLegal = isCheckLegal;
    }

    public Integer getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Integer registerType) {
        this.registerType = registerType;
    }

    public String getBrandApartmentLogo() {
        return brandApartmentLogo;
    }

    public void setBrandApartmentLogo(String brandApartmentLogo) {
        this.brandApartmentLogo = brandApartmentLogo == null ? null : brandApartmentLogo.trim();
    }

    public String getBrandApartmentName() {
        return brandApartmentName;
    }

    public void setBrandApartmentName(String brandApartmentName) {
        this.brandApartmentName = brandApartmentName == null ? null : brandApartmentName.trim();
    }

    public Integer getBrandApartmentModel() {
        return brandApartmentModel;
    }

    public void setBrandApartmentModel(Integer brandApartmentModel) {
        this.brandApartmentModel = brandApartmentModel;
    }

    public String getBrandApartmentTotal() {
        return brandApartmentTotal;
    }

    public void setBrandApartmentTotal(String brandApartmentTotal) {
        this.brandApartmentTotal = brandApartmentTotal == null ? null : brandApartmentTotal.trim();
    }

    public String getApartmentManagementImg() {
        return apartmentManagementImg;
    }

    public void setApartmentManagementImg(String apartmentManagementImg) {
        this.apartmentManagementImg = apartmentManagementImg == null ? null : apartmentManagementImg.trim();
    }

    public String getApartmentManagementName() {
        return apartmentManagementName;
    }

    public void setApartmentManagementName(String apartmentManagementName) {
        this.apartmentManagementName = apartmentManagementName == null ? null : apartmentManagementName.trim();
    }

    public String getApartmentManagementProvince() {
        return apartmentManagementProvince;
    }

    public void setApartmentManagementProvince(String apartmentManagementProvince) {
        this.apartmentManagementProvince = apartmentManagementProvince == null ? null : apartmentManagementProvince.trim();
    }

    public String getApartmentManagementCity() {
        return apartmentManagementCity;
    }

    public void setApartmentManagementCity(String apartmentManagementCity) {
        this.apartmentManagementCity = apartmentManagementCity == null ? null : apartmentManagementCity.trim();
    }

    public String getApartmentManagementArea() {
        return apartmentManagementArea;
    }

    public void setApartmentManagementArea(String apartmentManagementArea) {
        this.apartmentManagementArea = apartmentManagementArea == null ? null : apartmentManagementArea.trim();
    }

    public String getApartmentManagementUrl() {
        return apartmentManagementUrl;
    }

    public void setApartmentManagementUrl(String apartmentManagementUrl) {
        this.apartmentManagementUrl = apartmentManagementUrl == null ? null : apartmentManagementUrl.trim();
    }

    public String getApartmentManagementTotal() {
        return apartmentManagementTotal;
    }

    public void setApartmentManagementTotal(String apartmentManagementTotal) {
        this.apartmentManagementTotal = apartmentManagementTotal == null ? null : apartmentManagementTotal.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckFalseTotal() {
        return checkFalseTotal;
    }

    public void setCheckFalseTotal(String checkFalseTotal) {
        this.checkFalseTotal = checkFalseTotal == null ? null : checkFalseTotal.trim();
    }

    public String getSysElectronicOfficialSeal() {
        return sysElectronicOfficialSeal;
    }

    public void setSysElectronicOfficialSeal(String sysElectronicOfficialSeal) {
        this.sysElectronicOfficialSeal = sysElectronicOfficialSeal == null ? null : sysElectronicOfficialSeal.trim();
    }

    public String getEnterpriseOpenName() {
        return enterpriseOpenName;
    }

    public void setEnterpriseOpenName(String enterpriseOpenName) {
        this.enterpriseOpenName = enterpriseOpenName == null ? null : enterpriseOpenName.trim();
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber == null ? null : bankCardNumber.trim();
    }

    public String getBankCardAddress() {
        return bankCardAddress;
    }

    public void setBankCardAddress(String bankCardAddress) {
        this.bankCardAddress = bankCardAddress == null ? null : bankCardAddress.trim();
    }

    public Integer getIsCompany() {
        return isCompany;
    }

    public void setIsCompany(Integer isCompany) {
        this.isCompany = isCompany;
    }

    public String getOpenProvince() {
        return openProvince;
    }

    public void setOpenProvince(String openProvince) {
        this.openProvince = openProvince == null ? null : openProvince.trim();
    }

    public String getOpenCity() {
        return openCity;
    }

    public void setOpenCity(String openCity) {
        this.openCity = openCity == null ? null : openCity.trim();
    }

    public Date getBackupsTime() {
        return backupsTime;
    }

    public void setBackupsTime(Date backupsTime) {
        this.backupsTime = backupsTime;
    }

    public Integer getIsBackups() {
        return isBackups;
    }

    public void setIsBackups(Integer isBackups) {
        this.isBackups = isBackups;
    }

    public String getDepositBank() {
        return depositBank;
    }

    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank == null ? null : depositBank.trim();
    }

	@Override
	public String toString() {
		return "SysRegisterTemp [id=" + id + ", sysRegisterUniqueId=" + sysRegisterUniqueId + ", phoneNumber="
				+ phoneNumber + ", password=" + password + ", operatorName=" + operatorName + ", operatorCardNumber="
				+ operatorCardNumber + ", cardFrontImg=" + cardFrontImg + ", cardBackImg=" + cardBackImg
				+ ", companyName=" + companyName + ", certificateSocialCode=" + certificateSocialCode
				+ ", companyLicenseImg=" + companyLicenseImg + ", legalName=" + legalName + ", legalCardNumber="
				+ legalCardNumber + ", legalPhone=" + legalPhone + ", legalFrontImg=" + legalFrontImg
				+ ", legalBackImg=" + legalBackImg + ", letterBookModel=" + letterBookModel + ", isCheckLegal="
				+ isCheckLegal + ", registerType=" + registerType + ", brandApartmentLogo=" + brandApartmentLogo
				+ ", brandApartmentName=" + brandApartmentName + ", brandApartmentModel=" + brandApartmentModel
				+ ", brandApartmentTotal=" + brandApartmentTotal + ", apartmentManagementImg=" + apartmentManagementImg
				+ ", apartmentManagementName=" + apartmentManagementName + ", apartmentManagementProvince="
				+ apartmentManagementProvince + ", apartmentManagementCity=" + apartmentManagementCity
				+ ", apartmentManagementArea=" + apartmentManagementArea + ", apartmentManagementUrl="
				+ apartmentManagementUrl + ", apartmentManagementTotal=" + apartmentManagementTotal + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", checkType=" + checkType + ", checkTime=" + checkTime
				+ ", checkFalseTotal=" + checkFalseTotal + ", sysElectronicOfficialSeal=" + sysElectronicOfficialSeal
				+ ", enterpriseOpenName=" + enterpriseOpenName + ", bankCardNumber=" + bankCardNumber
				+ ", bankCardAddress=" + bankCardAddress + ", isCompany=" + isCompany + ", openProvince=" + openProvince
				+ ", openCity=" + openCity + ", backupsTime=" + backupsTime + ", isBackups=" + isBackups
				+ ", depositBank=" + depositBank + "]";
	}
   
}