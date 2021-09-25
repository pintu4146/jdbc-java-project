package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/*there are three types of 
 * */




public class StudentData {
	
	public static boolean insertStudentToDb(Student student) {
		boolean flag=false;
		//create connection
		Connection connection= ConnectionProvider.creatConnection();
		String query="insert into students(sname,sphone,scity) values(?,?,?)";//we are using dynamic 
		//query
		//use PreparedStatement to fire this Query by saying connection to do this 
	try {
		PreparedStatement psmt = connection.prepareStatement(query);
		//set the value of parameter ? ? ?
		psmt.setString(1,student.getStudentName());
		psmt.setString(2,student.getPhoneNumber());
		psmt.setString(3,student.getCityName());
		//execute
		psmt.executeUpdate();
		flag=true;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	return flag;	
		
		// TODO Auto-generated method stub

	}

	public static boolean deletStudent(int id) {
		boolean flag=false;
		 
	try {
		//create connection
				Connection connection= ConnectionProvider.creatConnection();
				String query="delete from students where sid=?";//we are using dynamic query
				//use PreparedStatement to fire this Query by saying connection to do this
		PreparedStatement psmt = connection.prepareStatement(query);
		//set the value of parameter ? ? ?
		psmt.setInt(1,id);
		
		//execute
		psmt.executeUpdate();
		flag=true;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	return flag;	
		
		// TODO Auto-generated method stub
		
	}

	public static void showStudents() {
		
		 
		try {
			//create connection
					Connection connection= ConnectionProvider.creatConnection();
					String query="select * from students";//we are using dynamic query
					//use PreparedStatement to fire this Query by saying connection to do this
//			PreparedStatement psmt = connection.prepareStatement(query);
//			//set the value of parameter ? ? ?
//			psmt.setInt(1,id);
					Statement stmt=connection.createStatement();
				ResultSet set	=stmt.executeQuery(query);
				while (set.next()) {
					int id=set.getInt(1);
					String nameString=set.getString(2);
					String phoneString=set.getString(3);
					String cityString=set.getString(4);
					System.out.println("sid: "+id+" sname "+nameString+" sphone: "+phoneString
							+" scity: "+cityString);
					System.out.println();
					System.err.println();
				}
					
			
			//execute
//			psmt.executeUpdate();
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
			
		// TODO Auto-generated method stub
		
	}
	

}
