package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String drive="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jebin";
		Class.forName(drive);
		Connection conn=DriverManager.getConnection(url,"root","root");
		Statement st=conn.createStatement();
		String s="update edulogin set uname='jebin_g' where uid=5";
		int i=st.executeUpdate(s);
		if(i>0) {
			System.out.println("The Value is Updated "+i+" row sucessfully");
			
		}else {
			System.out.println("The value is not updated");
		}
		

	}

}
