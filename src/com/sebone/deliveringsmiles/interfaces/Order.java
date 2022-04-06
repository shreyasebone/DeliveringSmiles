package com.sebone.deliveringsmiles.interfaces;

import java.util.List;

import com.sebone.deliveringsmiles.dataclass.OrderData;
import com.sebone.deliveringsmiles.dataclass.OrderStatus;
/**Interface name:-Order 
 * Objective:-This interface contain 4 methods.In this interface we declared all the methods related to Order, this interface will contain four methods which are described below. With the help of the following methods we can send notifications to the user, we can assign orders to Driver and so on.
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public interface Order {
	OrderData assignOrder(OrderData orderData,int driverId);
	OrderData getOrderDetails(int orderId);
	List<OrderData> sendOrderNotification(int driverId,String deliveryStatus);
	OrderStatus orderAcceptOrNot(OrderStatus orderStatus, int orderId);
}
