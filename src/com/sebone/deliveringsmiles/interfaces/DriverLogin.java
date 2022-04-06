package com.sebone.deliveringsmiles.interfaces;

import java.util.List;

import com.sebone.deliveringsmiles.dataclass.LoginDetails;
import com.sebone.deliveringsmiles.dataclass.LoginStatus;
/**Interface name:- DriverLogin
 * Objective:-This interface contain 2 methods.Registered Driver can login into our application where he/she will be able to see the login page in which he would provide us email and password
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public interface DriverLogin {
	LoginStatus userAuthentication(String driverEmail , String driverPassword);
	List<LoginDetails> getLoginDetails( int driverId);
	
}
