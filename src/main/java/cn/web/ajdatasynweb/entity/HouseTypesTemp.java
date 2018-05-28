package cn.web.ajdatasynweb.entity;

import java.io.Serializable;
import java.util.Date;

public class HouseTypesTemp implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8941910760671724215L;

	private Integer id;

    private String roomTypeId;

    private Integer houseid;

    private String projectId;

    private Integer rentType;

    private Integer minPrice;

    private Integer maxPrice;

    private String title;

    private String name;

    private String coverImage;

    private String detailImages;

    private String structure;

    private String towards;

    private String tag;

    private String facility;

    private Date createTime;

    private Date updateTime;

    private Integer layoutRoom;

    private Integer layoutHall;

    private Integer layoutToilet;

    private String payPeriod;

    private String depositMode;

    private Integer isLift;

    private Integer riskControlStatus;

    private String riskControlReason;

    private Date riskControlTime;

    private Date backupsTime;

    private Integer isBackups;

    private String extendInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId == null ? null : roomTypeId.trim();
    }

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public Integer getRentType() {
        return rentType;
    }

    public void setRentType(Integer rentType) {
        this.rentType = rentType;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
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

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure == null ? null : structure.trim();
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

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility == null ? null : facility.trim();
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

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod == null ? null : payPeriod.trim();
    }

    public String getDepositMode() {
        return depositMode;
    }

    public void setDepositMode(String depositMode) {
        this.depositMode = depositMode == null ? null : depositMode.trim();
    }

    public Integer getIsLift() {
        return isLift;
    }

    public void setIsLift(Integer isLift) {
        this.isLift = isLift;
    }

    public Integer getRiskControlStatus() {
        return riskControlStatus;
    }

    public void setRiskControlStatus(Integer riskControlStatus) {
        this.riskControlStatus = riskControlStatus;
    }

    public String getRiskControlReason() {
        return riskControlReason;
    }

    public void setRiskControlReason(String riskControlReason) {
        this.riskControlReason = riskControlReason == null ? null : riskControlReason.trim();
    }

    public Date getRiskControlTime() {
        return riskControlTime;
    }

    public void setRiskControlTime(Date riskControlTime) {
        this.riskControlTime = riskControlTime;
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
		return "HouseTypesTemp [id=" + id + ", roomTypeId=" + roomTypeId + ", houseid=" + houseid + ", projectId="
				+ projectId + ", rentType=" + rentType + ", minPrice=" + minPrice + ", maxPrice=" + maxPrice
				+ ", title=" + title + ", name=" + name + ", coverImage=" + coverImage + ", detailImages="
				+ detailImages + ", structure=" + structure + ", towards=" + towards + ", tag=" + tag + ", facility="
				+ facility + ", createTime=" + createTime + ", updateTime=" + updateTime + ", layoutRoom=" + layoutRoom
				+ ", layoutHall=" + layoutHall + ", layoutToilet=" + layoutToilet + ", payPeriod=" + payPeriod
				+ ", depositMode=" + depositMode + ", isLift=" + isLift + ", riskControlStatus=" + riskControlStatus
				+ ", riskControlReason=" + riskControlReason + ", riskControlTime=" + riskControlTime + ", backupsTime="
				+ backupsTime + ", isBackups=" + isBackups + ", extendInfo=" + extendInfo + "]";
	}
    
    
}