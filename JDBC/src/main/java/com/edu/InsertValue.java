package com.edu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValue {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String drive="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/jebin";
		
		Class.forName(drive);
		Connection con=DriverManager.getConnection(url,"root","root");
		Statement st=con.createStatement();
		String s="insert into edulogin values(5,'Jebi')";
		int i=st.executeUpdate(s);
		if(i>0) {
			System.out.println("The Value is inserted sucessfully");
			
		}else {
			System.out.println("The value is not inserted");
		}
		
		
		
		
		

	}

}