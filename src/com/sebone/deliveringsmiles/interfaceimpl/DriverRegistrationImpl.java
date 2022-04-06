package com.sebone.deliveringsmiles.interfaceimpl;

import com.sebone.deliveringsmiles.dataclass.DriverData;
import com.sebone.deliveringsmiles.dataclass.DriverStatus;
import com.sebone.deliveringsmiles.interfaces.DriverRegistration;
/**class name:- DriverRegistrationImpl
 * Objective:-This class implements all the method of DriverRegistration interface.
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public class DriverRegistrationImpl implements DriverRegistration {
	/**
	* method name:-submitDriverData
	* objective:- This method will create or register a new user / Driver in application. 
	* @param  DriverData driverData
	* @return  DriverData
	*/
	@Override
	public DriverData submitDriverData(DriverData driverData) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	* method name:-getDriverDetails
	* objective:- In this method we will fetch all the driver details, if in case the user wants to perform any type of modifications. 
	* @param  int driverId
	* @return  DriverData
	*/
	@Override
	public DriverData getDriverDetails(int driverId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	* method name:-updateDriverData
	* objective:- With the help of this method will update all the changes performed by the user. 
	* @param  DriverData driverData
	* @return  DriverStatus
	*/
	@Override
	public DriverStatus updateDriverData(DriverData driverData) {
		// TODO Auto-generated method stub
		return null;
	}

}
