package com.sebone.deliveringsmiles.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sebone.deliveringsmiles.dataobject.LoginTableDo;
import com.sebone.deliveringsmiles.dataobject.OrderTableDo;
import com.sebone.deliveringsmiles.dataobject.RegistrationTableDo;

public class OrderDao extends CommanDao{
	public boolean insertOrderDetails(OrderTableDo OrderTableDo) {
		boolean flag = false;
			
		try {
			String query="insert into order_table values(?,?,?,?,?,?,?,?,?,?)";
			Connection connection = getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,OrderTableDo.getOrderId());
			preparedStatement.setString(2,OrderTableDo.getCompanyId());
			preparedStatement.setDate(3,OrderTableDo.getOrderTime());
			preparedStatement.setString(4,OrderTableDo.getOrderSource());
			preparedStatement.setString(5,OrderTableDo.getOrderDestination());
			preparedStatement.setString(6,OrderTableDo.getPaymentMode());
			preparedStatement.setString(7,OrderTableDo.getOrderStatus());
			preparedStatement.setDate(8,OrderTableDo.getEstimatedTime());
			preparedStatement.setFloat(9,OrderTableDo.getEstimatedPrice());
			preparedStatement.setInt(10,OrderTableDo.getDriverId());
			
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
	public OrderTableDo selectOrderDetailsById(int order_id) {
		OrderTableDo orderTableDo=new OrderTableDo();
		try {
			String query="select order_id,company_id,order_time,order_source,order_destination,payment_mode,order_Status,estimated_time,estimated_price,driver_id from order_table where order_id=?";
			Connection connection=getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,order_id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				orderTableDo.setOrderId(rs.getInt("order_id"));
				orderTableDo.setCompanyId(rs.getString("company_id"));
				orderTableDo.setOrderTime(rs.getDate("order_time"));
				orderTableDo.setOrderSource(rs.getString("order_source"));
				orderTableDo.setOrderDestination(rs.getString("order_destination"));
				orderTableDo.setPaymentMode(rs.getString("payment_mode"));
				orderTableDo.setOrderStatus(rs.getString("order_Status"));
				orderTableDo.setEstimatedTime(rs.getDate("estimated_time"));
				orderTableDo.setEstimatedPrice(rs.getFloat("estimated_price"));
				orderTableDo.setOrderId(rs.getInt("driver_id"));
			}
			
		}catch(SQLException e) {
			e.getStackTrace();
		}
		return orderTableDo ;
	}
	
	public boolean updateOrderDetails(OrderTableDo orderTableDo) {
		boolean flag=false;
		
		try {
			String Query="update order_table set company_id=? where order_id=?";
			Connection connection=getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(Query);
			
			preparedStatement.setString(1,orderTableDo.getCompanyId());
			preparedStatement.setInt(2, orderTableDo.getOrderId());
			
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
	public boolean deleteOrderDetails(int orderId) {
		boolean flag = false;
			
		try {
			String query="delete from order_table where order_id= ?";
			Connection connection = getDataBaseConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, orderId);
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
