package cn.web.ajdatasynweb.entity;

import java.io.Serializable;
import java.util.Date;

public class HouseCentralizationTemp implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8627988324981450800L;

	private Integer id;

    private String projectId;

    private String source;

    private String projectName;

    private String communityId;

    private String communityName;

    private String buildId;

    private String buildName;

    private String city;

    private String district;

    private String streetAddress;

    private String streetNum;

    private String address;

    private String video;

    private String coverImage;

    private String detailImages;

    private String longitude;

    private String latitude;

    private Integer totalRoom;

    private Integer availableRoom;

    private String facility;

    private Double totalArea;

    private Double innerArea;

    private Integer totalBuilding;

    private Byte isLift;

    private Integer maxFloor;

    private String contactIphone;

    private Date createTime;

    private Date updateTime;

    private String contract;

    private String ownerIdcardName;

    private String ownerIdcardNo;

    private String ownerIdcardFront;

    private String ownerIdcardBack;

    private String housePocCode;

    private String housePocImg;

    private String fireLicenseCode;

    private String fireLicenseImg;

    private Integer registerId;

    private Integer sellerId;

    private Integer auditStatus;

    private Integer qualificationStatus;

    private String qualificationReason;

    private Date qualificationTime;

    private Date backupsTime;

    private Integer isBackups;

    private String extendInfo;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId == null ? null : communityId.trim();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName == null ? null : communityName.trim();
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId == null ? null : buildId.trim();
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName == null ? null : buildName.trim();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    public String getDetailImages() {
        return detailImages;
    }

    public void setDetailImages(String detailImages) {
        this.detailImages = detailImages == null ? null : detailImages.trim();
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

    public Integer getTotalRoom() {
        return totalRoom;
    }

    public void setTotalRoom(Integer totalRoom) {
        this.totalRoom = totalRoom;
    }

    public Integer getAvailableRoom() {
        return availableRoom;
    }

    public void setAvailableRoom(Integer availableRoom) {
        this.availableRoom = availableRoom;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility == null ? null : facility.trim();
    }

    public Double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Double totalArea) {
        this.totalArea = totalArea;
    }

    public Double getInnerArea() {
        return innerArea;
    }

    public void setInnerArea(Double innerArea) {
        this.innerArea = innerArea;
    }

    public Integer getTotalBuilding() {
        return totalBuilding;
    }

    public void setTotalBuilding(Integer totalBuilding) {
        this.totalBuilding = totalBuilding;
    }

    public Byte getIsLift() {
        return isLift;
    }

    public void setIsLift(Byte isLift) {
        this.isLift = isLift;
    }

    public Integer getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor(Integer maxFloor) {
        this.maxFloor = maxFloor;
    }

    public String getContactIphone() {
        return contactIphone;
    }

    public void setContactIphone(String contactIphone) {
        this.contactIphone = contactIphone == null ? null : contactIphone.trim();
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

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
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

    public String getOwnerIdcardFront() {
        return ownerIdcardFront;
    }

    public void setOwnerIdcardFront(String ownerIdcardFront) {
        this.ownerIdcardFront = ownerIdcardFront == null ? null : ownerIdcardFront.trim();
    }

    public String getOwnerIdcardBack() {
        return ownerIdcardBack;
    }

    public void setOwnerIdcardBack(String ownerIdcardBack) {
        this.ownerIdcardBack = ownerIdcardBack == null ? null : ownerIdcardBack.trim();
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

    public String getFireLicenseCode() {
        return fireLicenseCode;
    }

    public void setFireLicenseCode(String fireLicenseCode) {
        this.fireLicenseCode = fireLicenseCode == null ? null : fireLicenseCode.trim();
    }

    public String getFireLicenseImg() {
        return fireLicenseImg;
    }

    public void setFireLicenseImg(String fireLicenseImg) {
        this.fireLicenseImg = fireLicenseImg == null ? null : fireLicenseImg.trim();
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

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
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

    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo == null ? null : extendInfo.trim();
    }

	@Override
	public String toString() {
		return "HouseCentralizationTemp [id=" + id + ", projectId=" + projectId + ", source=" + source
				+ ", projectName=" + projectName + ", communityId=" + communityId + ", communityName=" + communityName
				+ ", buildId=" + buildId + ", buildName=" + buildName + ", city=" + city + ", district=" + district
				+ ", streetAddress=" + streetAddress + ", streetNum=" + streetNum + ", address=" + address + ", video="
				+ video + ", coverImage=" + coverImage + ", detailImages=" + detailImages + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", totalRoom=" + totalRoom + ", availableRoom=" + availableRoom
				+ ", facility=" + facility + ", totalArea=" + totalArea + ", innerArea=" + innerArea
				+ ", totalBuilding=" + totalBuilding + ", isLift=" + isLift + ", maxFloor=" + maxFloor
				+ ", contactIphone=" + contactIphone + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", contract=" + contract + ", ownerIdcardName=" + ownerIdcardName + ", ownerIdcardNo=" + ownerIdcardNo
				+ ", ownerIdcardFront=" + ownerIdcardFront + ", ownerIdcardBack=" + ownerIdcardBack + ", housePocCode="
				+ housePocCode + ", housePocImg=" + housePocImg + ", fireLicenseCode=" + fireLicenseCode
				+ ", fireLicenseImg=" + fireLicenseImg + ", registerId=" + registerId + ", sellerId=" + sellerId
				+ ", auditStatus=" + auditStatus + ", qualificationStatus=" + qualificationStatus
				+ ", qualificationReason=" + qualificationReason + ", qualificationTime=" + qualificationTime
				+ ", backupsTime=" + backupsTime + ", isBackups=" + isBackups + ", extendInfo=" + extendInfo + "]";
	}
    
}