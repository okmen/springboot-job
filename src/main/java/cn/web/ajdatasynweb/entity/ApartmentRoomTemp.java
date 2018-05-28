package cn.web.ajdatasynweb.entity;

import java.io.Serializable;
import java.util.Date;

public class ApartmentRoomTemp implements  Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5643281256102903597L;

	private Integer id;

    private String areaid;

    private String roomName;

    private String roomTypeId;

    private Double area;

    private String buildingName;

    private String floor;

    private Double rent;

    private Integer status;

    private String payMethod;

    private String source;

    private String houseCode;

    private Integer roomType;

    private Integer signStatus;

    private Date signTime;

    private Date createTime;

    private Date updateTime;

    private Date shelvesTime;

    private Date offShelvesTime;

    private Date backupsTime;

    private Integer isBackups;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId == null ? null : roomTypeId.trim();
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode == null ? null : houseCode.trim();
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
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
		return "ApartmentRoomTemp [id=" + id + ", areaid=" + areaid + ", roomName=" + roomName + ", roomTypeId="
				+ roomTypeId + ", area=" + area + ", buildingName=" + buildingName + ", floor=" + floor + ", rent="
				+ rent + ", status=" + status + ", payMethod=" + payMethod + ", source=" + source + ", houseCode="
				+ houseCode + ", roomType=" + roomType + ", signStatus=" + signStatus + ", signTime=" + signTime
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", shelvesTime=" + shelvesTime
				+ ", offShelvesTime=" + offShelvesTime + ", backupsTime=" + backupsTime + ", isBackups=" + isBackups
				+ "]";
	}
    
    
}