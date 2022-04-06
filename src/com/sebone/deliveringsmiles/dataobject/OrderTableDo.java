package com.sebone.deliveringsmiles.dataobject;

import java.sql.Date;

public class OrderTableDo {
	private int orderId;
	private String companyId;
	private Date orderTime;
	private String orderSource;
	private String orderDestination;
	private String paymentMode;
	private String orderStatus;
	private Date estimatedTime;
	private float estimatedPrice;
	private int driverId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date date) {
		this.orderTime = date;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public String getOrderDestination() {
		return orderDestination;
	}
	public void setOrderDestination(String orderDestination) {
		this.orderDestination = orderDestination;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(Date date) {
		this.estimatedTime = date;
	}
	public float getEstimatedPrice() {
		return estimatedPrice;
	}
	public void setEstimatedPrice(float estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	
	
}
