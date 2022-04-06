package com.sebone.deliveringsmiles.dataclass;
/**class name:-OrderStatus
 * Objective:-This class store order status and description related to the order.
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public class OrderStatus {
	private int orderId;
	private boolean orderStatus;
	private String orderStatusDescription;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public boolean isOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}
	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}
	
}
