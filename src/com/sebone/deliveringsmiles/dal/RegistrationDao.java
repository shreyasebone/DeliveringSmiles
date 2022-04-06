package com.sebone.deliveringsmiles.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sebone.deliveringsmiles.dataobject.RegistrationTableDo;

public class RegistrationDao extends CommanDao{
	public boolean insertDriverDetails(RegistrationTableDo registrationTableDo) {
		boolean flag = false;
			
		try {
			String query="insert into registration_table values(?,?,?,?,?,?,?,?,?)";
			Connection connection = getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,registrationTableDo.getDriverId());
			preparedStatement.setString(2,registrationTableDo.getDriverName());
			preparedStatement.setString(3,registrationTableDo.getDriverContactNo());
			preparedStatement.setString(4,registrationTableDo.getDriverEmail());
			preparedStatement.setString(5,registrationTableDo.getDriverAddress());
			preparedStatement.setString(6,registrationTableDo.getDriverGovtId());
			preparedStatement.setString(7,registrationTableDo.getDriverUsername());
			preparedStatement.setString(8,registrationTableDo.getDriverPassword());
			preparedStatement.setString(9,registrationTableDo.getDriverStatus());
			int count=preparedStatement.executeUpdate();
			if(count == 1) {
				flag = true;
			}else {
				flag = false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		 	return flag;
	}
	
	
	public boolean deleteDriverDetails(int driverId) {
		boolean flag = false;
			
		try {
			String query="delete from registration_table where Driver_id = ?";
			Connection connection = getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,driverId);
			int count=preparedStatement.executeUpdate();
			if(count == 1) {
				flag = true;
			}else {
				flag = false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		 	return flag;
	}
	public RegistrationTableDo selectDriverDetailsById(int driverId) {
		RegistrationTableDo registrationTableDo=new RegistrationTableDo();
		try {
			String query="select driver_id,driver_name,driver_contact_no,driver_email,driver_address,driver_govtId,driver_username,driver_password,driver_status from registration_table where driver_id=?";
			Connection connection=getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, driverId);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				registrationTableDo.setDriverId(rs.getInt("driver_id"));
				registrationTableDo.setDriverName(rs.getString("driver_name"));
				registrationTableDo.setDriverContactNo(rs.getString("driver_contact_no"));
				registrationTableDo.setDriverEmail(rs.getString("driver_email"));
				registrationTableDo.setDriverAddress(rs.getString("driver_address"));
				registrationTableDo.setDriverGovtId(rs.getString("driver_govtId"));
				registrationTableDo.setDriverUsername(rs.getString("driver_username"));
				registrationTableDo.setDriverPassword(rs.getString("driver_password"));
				registrationTableDo.setDriverStatus(rs.getString("driver_status"));
			}
			
		}catch(SQLException e) {
			e.getStackTrace();
		}
		return registrationTableDo ;
	}
	public boolean updateDriverDetailsById(RegistrationTableDo registrationTableDo) {
		boolean flag = false;
		
		try {
			String query="update registration_table set driver_name=? where driver_id=?";
			Connection connection = getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, registrationTableDo.getDriverName());
			preparedStatement.setInt(2,registrationTableDo.getDriverId());
			
			int count=preparedStatement.executeUpdate();
			
			if(count == 1) {
				flag = true;
			}else {
				flag = false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		 	return flag;
		
	}
	
}
