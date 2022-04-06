package com.sebone.deliveringsmiles.dataclass;
/**class name:- LoginDetails
 * Objective:-This class contain all the login details of driver.
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public class LoginDetails {
	private int loginId;
	private String loginTime;
	private String logoutTime;
	private String loginPassword;
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public String getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(String logoutTime) {
		this.logoutTime = logoutTime;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
}
