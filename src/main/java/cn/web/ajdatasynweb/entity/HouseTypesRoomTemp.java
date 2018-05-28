package cn.web.ajdatasynweb.entity;

import java.io.Serializable;
import java.util.Date;

public class HouseTypesRoomTemp implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -437724123174531773L;

	private Integer id;

    private String roomId;

    private Integer typesId;

    private String roomTypeId;

    private String roomName;

    private String houseId;

    private String houseName;

    private Double roomArea;

    private String buildingName;

    private Integer floor;

    private Double rentPrice;

    private Integer roomStatus;

    private String isFreeDeposit;

    private String payDeposit;

    private Date createTime;

    private Date updateTime;

    private String payPeriod;

    private String depositMode;

    private String rentalDemand;

    private Integer signStatus;

    private Date signTime;

    private Date backupsTime;

    private Integer isBackups;

    private String towards;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public Integer getTypesId() {
        return typesId;
    }

    public void setTypesId(Integer typesId) {
        this.typesId = typesId;
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId == null ? null : roomTypeId.trim();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName == null ? null : houseName.trim();
    }

    public Double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(Double roomArea) {
        this.roomArea = roomArea;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getIsFreeDeposit() {
        return isFreeDeposit;
    }

    public void setIsFreeDeposit(String isFreeDeposit) {
        this.isFreeDeposit = isFreeDeposit == null ? null : isFreeDeposit.trim();
    }

    public String getPayDeposit() {
        return payDeposit;
    }

    public void setPayDeposit(String payDeposit) {
        this.payDeposit = payDeposit == null ? null : payDeposit.trim();
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

    public String getRentalDemand() {
        return rentalDemand;
    }

    public void setRentalDemand(String rentalDemand) {
        this.rentalDemand = rentalDemand == null ? null : rentalDemand.trim();
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

    public String getTowards() {
        return towards;
    }

    public void setTowards(String towards) {
        this.towards = towards == null ? null : towards.trim();
    }

	@Override
	public String toString() {
		return "HouseTypesRoomTemp [id=" + id + ", roomId=" + roomId + ", typesId=" + typesId + ", roomTypeId="
				+ roomTypeId + ", roomName=" + roomName + ", houseId=" + houseId + ", houseName=" + houseName
				+ ", roomArea=" + roomArea + ", buildingName=" + buildingName + ", floor=" + floor + ", rentPrice="
				+ rentPrice + ", roomStatus=" + roomStatus + ", isFreeDeposit=" + isFreeDeposit + ", payDeposit="
				+ payDeposit + ", createTime=" + createTime + ", updateTime=" + updateTime + ", payPeriod=" + payPeriod
				+ ", depositMode=" + depositMode + ", rentalDemand=" + rentalDemand + ", signStatus=" + signStatus
				+ ", signTime=" + signTime + ", backupsTime=" + backupsTime + ", isBackups=" + isBackups + ", towards="
				+ towards + "]";
	}
    
    
}