package com.sebone.deliveringsmiles.interfaces;

import com.sebone.deliveringsmiles.dataclass.DriverData;
import com.sebone.deliveringsmiles.dataclass.DriverStatus;
/**Interface name:- DriverRegistration
 * Objective:-This interface contain 3 methods.Driver can register in our application where he/she will be able to see the registration page in which he would provide us all the information,
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public interface DriverRegistration {
	DriverData submitDriverData(DriverData driverData);
	DriverData getDriverDetails(int driverId);
	DriverStatus updateDriverData(DriverData driverData); 
}
