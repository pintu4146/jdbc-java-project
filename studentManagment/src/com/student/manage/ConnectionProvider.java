package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
  static	Connection connection;
	public static Connection creatConnection()
	{
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection..
			String user="root";
			String password="4146";
			//                      //locale machine pe:port/data base jo create kiye the 
			String url="jdbc:mysql://localhost:3306/student_manage";
			try {
				connection=DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
