package com.sebone.deliveringsmiles.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**class name:- CommanDao
 * Objective:-to get Data base connection .
 * @author:-Shreya paliwal
 * Date-17/03/2022
*/
public class CommanDao {
	static String DB_url="jdbc:mysql://127.0.0.1:3306/driver";
	static String user="root";
	static String password="Paliwal@123";
	Connection con;
		public Connection getDataBaseConnection() throws SQLException {
			try {
				Connection con=DriverManager.getConnection(DB_url, user, password);
				return con;
			}catch(SQLException e){
				e.getStackTrace();	
			}
			return con;
		}	
}
