package com.sebone.deliveringsmiles.dataclass;
/**class name:- OrderData
 * Objective:-This class contain all the details related to the order.
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public class OrderData {
	private int orderId;
	private int companyId;
	private String orderTime;
	private String orderSource;
	private String orderDestination;
	private String paymentMode;
	private float payoutEstimation;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
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
	public float getPayoutEstimation() {
		return payoutEstimation;
	}
	public void setPayoutEstimation(float payoutEstimation) {
		this.payoutEstimation = payoutEstimation;
	}
}
