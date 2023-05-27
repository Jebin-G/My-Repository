package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DeleteValue {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String drive="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jebin";
		Class.forName(drive);
		Connection conn=DriverManager.getConnection(url,"root","root");
		Statement st=conn.createStatement();
		String s="delete from edulogin where uid=4";
		int i=st.executeUpdate(s);
		if(i>0) {
			System.out.println("The Value is Deleted "+i+" row sucessfully");
			
		}else {
			System.out.println("The value is not deleted");
		}
		

	}

}
