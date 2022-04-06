package com.sebone.deliveringsmiles.dataclass;
/**class name:- DriverAddress
 * Objective:-This class contain all the details of Address
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public class DriverAddress {
	private String street;
	private String city;
	private String state;
	private int pincode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	String country;
	
}
