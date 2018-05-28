package cn.web.ajdatasynweb.entity;

import java.io.Serializable;
import java.util.Date;

public class HouseApartmentTemp implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1838000579040390103L;

	private Integer id;

    private String projectId;

    private String projectnmae;

    private String roomTypeId;

    private String city;

    private String district;

    private String streetAddress;

    private String streetNum;

    private String address;

    private String longitude;

    private String latitude;

    private Integer availableRoom;

    private Integer minprice;

    private Integer maxprice;

    private String title;

    private String name;

    private String cover;

    private String structure;

    private Double area;

    private String towards;

    private String tag;

    private String video;

    private Integer status;

    private String source;

    private Date createTime;

    private Integer createUserId;

    private Date updateTime;

    private Integer updateUserId;

    private Date shelvesTime;

    private Date offShelvesTime;

    private Integer isDelete;

    private String contactIphone;

    private String isFreeDeposit;

    private Integer auditStatus58;

    private String resonId;

    private String housePocCode;

    private String housePocImg;

    private String tradingArea;

    private Integer isLift;

    private Integer floorCount;

    private Integer floorHouseCount;

    private Integer layoutRoom;

    private Integer layoutHall;

    private Integer layoutToilet;

    private Integer payNum;

    private Integer betNum;

    private String configuration;

    private String rentalDemand;

    private String houseNo;

    private Integer rentalType;

    private Integer floorNo;

    private String changeExplain;

    private Integer rentMoney;

    private String partnerName;

    private String partnerIdCard;

    private String contract;

    private Integer houseType;

    private String fireLicense;

    private String fireLicenseImg;

    private Integer houseRecumbent;

    private Date auditTime;

    private Integer registerId;

    private Integer sellerId;

    private Integer fpType;

    private String communityName;

    private String buildingName;

    private String houseName;

    private Integer isHousetypeValid;

    private String houseCode;

    private Integer qualificationStatus;

    private String images;

    private String extendinfo;

    private String facility;

    private String commonImgUrl;
    
    private String qualificationReason;

    private Date qualificationTime;
    
    private Integer signStatus;

    private Date signTime;

    private String ownerIdcardName;

    private String ownerIdcardNo;

    private Date backupsTime;

    private Integer isBackups;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getProjectnmae() {
        return projectnmae;
    }

    public void setProjectnmae(String projectnmae) {
        this.projectnmae = projectnmae == null ? null : projectnmae.trim();
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId == null ? null : roomTypeId.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress == null ? null : streetAddress.trim();
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum == null ? null : streetNum.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getExtendinfo() {
        return extendinfo;
    }

    public void setExtendinfo(String extendinfo) {
        this.extendinfo = extendinfo == null ? null : extendinfo.trim();
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility == null ? null : facility.trim();
    }

    public String getCommonImgUrl() {
        return commonImgUrl;
    }

    public void setCommonImgUrl(String commonImgUrl) {
        this.commonImgUrl = commonImgUrl == null ? null : commonImgUrl.trim();
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Integer getAvailableRoom() {
        return availableRoom;
    }

    public void setAvailableRoom(Integer availableRoom) {
        this.availableRoom = availableRoom;
    }

    public Integer getMinprice() {
        return minprice;
    }

    public void setMinprice(Integer minprice) {
        this.minprice = minprice;
    }

    public Integer getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(Integer maxprice) {
        this.maxprice = maxprice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure == null ? null : structure.trim();
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getTowards() {
        return towards;
    }

    public void setTowards(String towards) {
        this.towards = towards == null ? null : towards.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getShelvesTime() {
        return shelvesTime;
    }

    public void setShelvesTime(Date shelvesTime) {
        this.shelvesTime = shelvesTime;
    }

    public Date getOffShelvesTime() {
        return offShelvesTime;
    }

    public void setOffShelvesTime(Date offShelvesTime) {
        this.offShelvesTime = offShelvesTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getContactIphone() {
        return contactIphone;
    }

    public void setContactIphone(String contactIphone) {
        this.contactIphone = contactIphone == null ? null : contactIphone.trim();
    }

    public String getIsFreeDeposit() {
        return isFreeDeposit;
    }

    public void setIsFreeDeposit(String isFreeDeposit) {
        this.isFreeDeposit = isFreeDeposit == null ? null : isFreeDeposit.trim();
    }

    public Integer getAuditStatus58() {
        return auditStatus58;
    }

    public void setAuditStatus58(Integer auditStatus58) {
        this.auditStatus58 = auditStatus58;
    }

    public String getResonId() {
        return resonId;
    }

    public void setResonId(String resonId) {
        this.resonId = resonId == null ? null : resonId.trim();
    }

    public String getHousePocCode() {
        return housePocCode;
    }

    public void setHousePocCode(String housePocCode) {
        this.housePocCode = housePocCode == null ? null : housePocCode.trim();
    }

    public String getHousePocImg() {
        return housePocImg;
    }

    public void setHousePocImg(String housePocImg) {
        this.housePocImg = housePocImg == null ? null : housePocImg.trim();
    }

    public String getTradingArea() {
        return tradingArea;
    }

    public void setTradingArea(String tradingArea) {
        this.tradingArea = tradingArea == null ? null : tradingArea.trim();
    }

    public Integer getIsLift() {
        return isLift;
    }

    public void setIsLift(Integer isLift) {
        this.isLift = isLift;
    }

    public Integer getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(Integer floorCount) {
        this.floorCount = floorCount;
    }

    public Integer getFloorHouseCount() {
        return floorHouseCount;
    }

    public void setFloorHouseCount(Integer floorHouseCount) {
        this.floorHouseCount = floorHouseCount;
    }

    public Integer getLayoutRoom() {
        return layoutRoom;
    }

    public void setLayoutRoom(Integer layoutRoom) {
        this.layoutRoom = layoutRoom;
    }

    public Integer getLayoutHall() {
        return layoutHall;
    }

    public void setLayoutHall(Integer layoutHall) {
        this.layoutHall = layoutHall;
    }

    public Integer getLayoutToilet() {
        return layoutToilet;
    }

    public void setLayoutToilet(Integer layoutToilet) {
        this.layoutToilet = layoutToilet;
    }

    public Integer getPayNum() {
        return payNum;
    }

    public void setPayNum(Integer payNum) {
        this.payNum = payNum;
    }

    public Integer getBetNum() {
        return betNum;
    }

    public void setBetNum(Integer betNum) {
        this.betNum = betNum;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration == null ? null : configuration.trim();
    }

    public String getRentalDemand() {
        return rentalDemand;
    }

    public void setRentalDemand(String rentalDemand) {
        this.rentalDemand = rentalDemand == null ? null : rentalDemand.trim();
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo == null ? null : houseNo.trim();
    }

    public Integer getRentalType() {
        return rentalType;
    }

    public void setRentalType(Integer rentalType) {
        this.rentalType = rentalType;
    }

    public Integer getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(Integer floorNo) {
        this.floorNo = floorNo;
    }

    public String getChangeExplain() {
        return changeExplain;
    }

    public void setChangeExplain(String changeExplain) {
        this.changeExplain = changeExplain == null ? null : changeExplain.trim();
    }

    public Integer getRentMoney() {
        return rentMoney;
    }

    public void setRentMoney(Integer rentMoney) {
        this.rentMoney = rentMoney;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    public String getPartnerIdCard() {
        return partnerIdCard;
    }

    public void setPartnerIdCard(String partnerIdCard) {
        this.partnerIdCard = partnerIdCard == null ? null : partnerIdCard.trim();
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public String getFireLicense() {
        return fireLicense;
    }

    public void setFireLicense(String fireLicense) {
        this.fireLicense = fireLicense == null ? null : fireLicense.trim();
    }

    public String getFireLicenseImg() {
        return fireLicenseImg;
    }

    public void setFireLicenseImg(String fireLicenseImg) {
        this.fireLicenseImg = fireLicenseImg == null ? null : fireLicenseImg.trim();
    }

    public Integer getHouseRecumbent() {
        return houseRecumbent;
    }

    public void setHouseRecumbent(Integer houseRecumbent) {
        this.houseRecumbent = houseRecumbent;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getFpType() {
        return fpType;
    }

    public void setFpType(Integer fpType) {
        this.fpType = fpType;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName == null ? null : communityName.trim();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName == null ? null : houseName.trim();
    }

    public Integer getIsHousetypeValid() {
        return isHousetypeValid;
    }

    public void setIsHousetypeValid(Integer isHousetypeValid) {
        this.isHousetypeValid = isHousetypeValid;
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode == null ? null : houseCode.trim();
    }

    public Integer getQualificationStatus() {
        return qualificationStatus;
    }

    public void setQualificationStatus(Integer qualificationStatus) {
        this.qualificationStatus = qualificationStatus;
    }

    public String getQualificationReason() {
        return qualificationReason;
    }

    public void setQualificationReason(String qualificationReason) {
        this.qualificationReason = qualificationReason == null ? null : qualificationReason.trim();
    }

    public Date getQualificationTime() {
        return qualificationTime;
    }

    public void setQualificationTime(Date qualificationTime) {
        this.qualificationTime = qualificationTime;
    }

    public Integer getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(Integer signStatus) {
        this.signStatus = signStatus;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getOwnerIdcardName() {
        return ownerIdcardName;
    }

    public void setOwnerIdcardName(String ownerIdcardName) {
        this.ownerIdcardName = ownerIdcardName == null ? null : ownerIdcardName.trim();
    }

    public String getOwnerIdcardNo() {
        return ownerIdcardNo;
    }

    public void setOwnerIdcardNo(String ownerIdcardNo) {
        this.ownerIdcardNo = ownerIdcardNo == null ? null : ownerIdcardNo.trim();
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

	@Override
	public String toString() {
		return "HouseApartmentTemp [id=" + id + ", projectId=" + projectId + ", projectnmae=" + projectnmae
				+ ", roomTypeId=" + roomTypeId + ", city=" + city + ", district=" + district + ", streetAddress="
				+ streetAddress + ", streetNum=" + streetNum + ", address=" + address + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", availableRoom=" + availableRoom + ", minprice=" + minprice
				+ ", maxprice=" + maxprice + ", title=" + title + ", name=" + name + ", cover=" + cover + ", structure="
				+ structure + ", area=" + area + ", towards=" + towards + ", tag=" + tag + ", video=" + video
				+ ", status=" + status + ", source=" + source + ", createTime=" + createTime + ", createUserId="
				+ createUserId + ", updateTime=" + updateTime + ", updateUserId=" + updateUserId + ", shelvesTime="
				+ shelvesTime + ", offShelvesTime=" + offShelvesTime + ", isDelete=" + isDelete + ", contactIphone="
				+ contactIphone + ", isFreeDeposit=" + isFreeDeposit + ", auditStatus58=" + auditStatus58 + ", resonId="
				+ resonId + ", housePocCode=" + housePocCode + ", housePocImg=" + housePocImg + ", tradingArea="
				+ tradingArea + ", isLift=" + isLift + ", floorCount=" + floorCount + ", floorHouseCount="
				+ floorHouseCount + ", layoutRoom=" + layoutRoom + ", layoutHall=" + layoutHall + ", layoutToilet="
				+ layoutToilet + ", payNum=" + payNum + ", betNum=" + betNum + ", configuration=" + configuration
				+ ", rentalDemand=" + rentalDemand + ", houseNo=" + houseNo + ", rentalType=" + rentalType
				+ ", floorNo=" + floorNo + ", changeExplain=" + changeExplain + ", rentMoney=" + rentMoney
				+ ", partnerName=" + partnerName + ", partnerIdCard=" + partnerIdCard + ", contract=" + contract
				+ ", houseType=" + houseType + ", fireLicense=" + fireLicense + ", fireLicenseImg=" + fireLicenseImg
				+ ", houseRecumbent=" + houseRecumbent + ", auditTime=" + auditTime + ", registerId=" + registerId
				+ ", sellerId=" + sellerId + ", fpType=" + fpType + ", communityName=" + communityName
				+ ", buildingName=" + buildingName + ", houseName=" + houseName + ", isHousetypeValid="
				+ isHousetypeValid + ", houseCode=" + houseCode + ", qualificationStatus=" + qualificationStatus
				+ ", images=" + images + ", extendinfo=" + extendinfo + ", facility=" + facility + ", commonImgUrl="
				+ commonImgUrl + ", qualificationReason=" + qualificationReason + ", qualificationTime="
				+ qualificationTime + ", signStatus=" + signStatus + ", signTime=" + signTime + ", ownerIdcardName="
				+ ownerIdcardName + ", ownerIdcardNo=" + ownerIdcardNo + ", backupsTime=" + backupsTime + ", isBackups="
				+ isBackups + "]";
	}
    
    
}