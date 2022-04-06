package com.sebone.deliveringsmiles.dataclass;
/**class name:- LoginStatus
 * Objective:-This class store login status and description of login status.
 * @author:-Shreya paliwal
 * Date-24/03/2022
*/
public class LoginStatus {
	private int loginStatusId;
	private boolean loginStatus;
	private String loginStatusDescription;
	public int getLoginStatusId() {
		return loginStatusId;
	}
	public void setLoginStatusId(int loginStatusId) {
		this.loginStatusId = loginStatusId;
	}
	public boolean isLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getLoginStatusDescription() {
		return loginStatusDescription;
	}
	public void setLoginStatusDescription(String loginStatusDescription) {
		this.loginStatusDescription = loginStatusDescription;
	}
	
}
