package com.sebone.deliveringsmiles.dataobject;

import java.sql.Date;
import java.time.format.DateTimeFormatter;

public class LoginTableDo {
	private int driverLoginId;
	private Date driverLoginTime;
	private Date driverLogoutTime;
	private String driverStatus;
	private int driverId;
	public int getDriverLoginId() {
		return driverLoginId;
	}
	public void setDriverLoginId(int driverLoginId) {
		this.driverLoginId = driverLoginId;
	}
	public Date getDriverLoginTime() {
		return driverLoginTime;
	}
	public void setDriverLoginTime(Date date) {
		this.driverLoginTime = date;
	}
	public Date getDriverLogoutTime() {
		return driverLogoutTime;
	}
	public void setDriverLogoutTime(Date date) {
		this.driverLogoutTime = date;
	}
	public String getDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(String driverStatus) {
		this.driverStatus = driverStatus;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	
	
}
