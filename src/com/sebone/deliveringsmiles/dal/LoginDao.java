package com.sebone.deliveringsmiles.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sebone.deliveringsmiles.dataobject.LoginTableDo;

public class LoginDao extends CommanDao {
	public boolean insertDriverLoginDetails(LoginTableDo loginTableDo) {
		boolean flag=false;
		try {
			String query="insert into login_table values(?,?,?,?,?)";
			Connection connection=getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, loginTableDo.getDriverLoginId());
			preparedStatement.setDate(2, new Date(System.currentTimeMillis()));
			preparedStatement.setDate(3, new Date(System.currentTimeMillis()));
			preparedStatement.setString(4,loginTableDo.getDriverStatus());
			preparedStatement.setInt(5,loginTableDo.getDriverId());
			int count=preparedStatement.executeUpdate();
			if(count==1) {
				flag=true;
			}else {
				flag=false;
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;	
	}
	public LoginTableDo selectDriverLoginDetailsById(int loginId) {
		LoginTableDo loginTableDo=new LoginTableDo();
		try {
			String Query="select driver_login_id,driver_login_time,driver_logout_time,driver_status,driver_id from login_table where driver_login_id= ?";
			Connection connection=getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(Query);
			preparedStatement.setInt(1, loginId);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				loginTableDo.setDriverLoginId(resultSet.getInt("driver_login_id"));
				loginTableDo.setDriverLoginTime(resultSet.getDate("driver_login_time"));
				loginTableDo.setDriverLogoutTime(resultSet.getDate("driver_logout_time"));
				loginTableDo.setDriverStatus(resultSet.getString("driver_status"));
				loginTableDo.setDriverId(resultSet.getInt("driver_id"));	
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return loginTableDo;
	}
	public boolean updateDriverLoginDetails(LoginTableDo loginTableDo) {
		boolean flag=false;
		
		try {
			String Query="update login_table set driver_status=? where driver_login_id=?";
			Connection connection=getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(Query);
			
			preparedStatement.setString(1,loginTableDo.getDriverStatus());
			preparedStatement.setInt(2, loginTableDo.getDriverLoginId());
			
			
			int count=preparedStatement.executeUpdate();
			
			if(count==1) {
				flag=true;			
			}else {
				flag=false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;	
	}

	public boolean deleteDriverLoginDetails(int loginId) {
		boolean flag=false;
		try {
			String Query="delete from login_table where driver_login_id= ?";
			Connection connection=getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(Query);
			preparedStatement.setInt(1, loginId);
			int count=preparedStatement.executeUpdate();
			if(count==1) {
				flag=true;			
			}else {
				flag=false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;	
	}
	

}
