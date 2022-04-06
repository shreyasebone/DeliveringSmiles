package com.sebone.deliveringsmiles.dataobject;

public class PayoutTableDo {
	private int payoutId;
	private int orderId;
	private float payout;
	private String orderDeliveryTime;
	private float fmDistance;
	private String waitTime;
	private float lmDistance;
	private float incentive;
	private boolean payoutStatus;
	private int driverId;
	public int getPayoutId() {
		return payoutId;
	}
	public void setPayoutId(int payoutId) {
		this.payoutId = payoutId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getPayout() {
		return payout;
	}
	public void setPayout(float payout) {
		this.payout = payout;
	}
	public String getOrderDeliveryTime() {
		return orderDeliveryTime;
	}
	public void setOrderDeliveryTime(String orderDeliveryTime) {
		this.orderDeliveryTime = orderDeliveryTime;
	}
	public float getFmDistance() {
		return fmDistance;
	}
	public void setFmDistance(float fmDistance) {
		this.fmDistance = fmDistance;
	}
	public String getWaitTime() {
		return waitTime;
	}
	public void setWaitTime(String waitTime) {
		this.waitTime = waitTime;
	}
	public float getLmDistance() {
		return lmDistance;
	}
	public void setLmDistance(float lmDistance) {
		this.lmDistance = lmDistance;
	}
	public float getIncentive() {
		return incentive;
	}
	public void setIncentive(float incentive) {
		this.incentive = incentive;
	}
	public boolean isPayoutStatus() {
		return payoutStatus;
	}
	public void setPayoutStatus(boolean payoutStatus) {
		this.payoutStatus = payoutStatus;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	
}
