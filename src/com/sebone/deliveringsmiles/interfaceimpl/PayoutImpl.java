package com.sebone.deliveringsmiles.interfaceimpl;

import java.time.LocalDate;
import java.util.List;

import com.sebone.deliveringsmiles.dataclass.OrderStatus;
import com.sebone.deliveringsmiles.dataclass.PayoutData;
import com.sebone.deliveringsmiles.interfaces.Payout;
/**class name:- PayoutImpl
 * Objective:-This class implements all the method of Payout interface.
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public class PayoutImpl implements Payout{
	/**
	* method name:-payoutByOrder
	* objective:-With the help of this method the user will get the total payout of a particular order. 
	* @param int orderId, int driverId
	* @return PayoutData
	*/
	@Override
	public PayoutData payoutByOrder(int orderId, int driverId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	* method name:-payoutOfTheDays
	* objective:-With the help of this method the user will get the payout data according to the user input date or time. 
	* @param OrderStatus orderStatus, int driverId, LocalDate startDate,LocalDate endDate
	* @return  List<PayoutData>
	*/
	@Override
	public List<PayoutData> payoutOfTheDays(OrderStatus orderStatus, int driverId, LocalDate startDate,LocalDate endDate) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	* method name:-totalPayout
	* objective:-With the help of this method the user will be able to generate total payout of his total successful deliverys. 
	* @param int driverId
	* @return  List<PayoutData>
	*/
	@Override
	public List<PayoutData>totalPayout(int driverId) {
		// TODO Auto-generated method stub
		return null;
	}
}
