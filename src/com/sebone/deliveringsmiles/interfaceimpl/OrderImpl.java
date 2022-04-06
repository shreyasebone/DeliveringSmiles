package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;

import com.sebone.deliveringsmiles.dataclass.OrderData;
import com.sebone.deliveringsmiles.dataclass.OrderStatus;
import com.sebone.deliveringsmiles.interfaces.Order;
/**class name:- OrderImpl
 * Objective:-This class implements all the method of Order interface.
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public class OrderImpl implements Order {
	/**
	* method name:-assignOrder
	* objective:- In this method we get all the details of the order from the company and we will assign it to a driver whoever is available for the delivery.
	* @param  OrderData orderData, int driverId
	* @return  OrderData
	*/
	@Override
	public OrderData assignOrder(OrderData orderData, int driverId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	* method name:-getOrderDetails
	* objective:-In this method we will fetch all the details of order data.
	* @param int orderId
	* @return  OrderData
	*/
	@Override
	public OrderData getOrderDetails(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	* method name:-sendOrderNotification
	* objective:- In this method we will notify the user/Driver about the order.
	* @param int driverId, String deliveryStatus
	* @return  List<OrderData>
	*/
	@Override
	public List<OrderData> sendOrderNotification(int driverId, String deliveryStatus) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	* method name:-orderAcceptOrNot
	* objective:- with the help of this method we will fetch that the order is accepted or rejected by the driver .
	* @param OrderStatus orderStatus, int orderId
	* @return  OrderStatus
	*/
	@Override
	public OrderStatus orderAcceptOrNot(OrderStatus orderStatus, int orderId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
