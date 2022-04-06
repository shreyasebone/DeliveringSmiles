package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;

import com.sebone.deliveringsmiles.dataclass.LoginDetails;
import com.sebone.deliveringsmiles.dataclass.LoginStatus;
import com.sebone.deliveringsmiles.interfaces.DriverLogin;
/**class name:- DriverLoginImpl
 * Objective:-This class implements all the method of DriverLogin interface.
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public class DriverLoginImpl implements DriverLogin{
	/**
	* method name:-userAuthentication
	* objective:-This method will authenticate the user/Driver that he/she is already registered or not, if he/she is already registered then he will be able to login otherwise he will be redirected to the registration page 
	* @param  String driverEmail, String driverPassword
	* @return  LoginStatus
	*/
	@Override
	public LoginStatus userAuthentication(String driverEmail, String driverPassword) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	* method name:-getLoginDetails
	* objective:-In this method we will fetch all the login details of the user/Driver like login time and date and logout date and time , driver Status.
	* @param  int driverId
	* @return  List<LoginDetails>
	*/
	@Override
	public List<LoginDetails> getLoginDetails(int driverId) {
		// TODO Auto-generated method stub
		return null;
	}
}
