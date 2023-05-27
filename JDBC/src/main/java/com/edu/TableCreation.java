package com.edu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TableCreation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jebin","root","root");
		Statement st=con.createStatement();
		String tableName;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter table name:");
		tableName=scan.nextLine();
		
		
		String tb="create table "+tableName+"(uid int primary key,uname varchar(40) not null)";
		int check=st.executeUpdate(tb);
		System.out.println(check);
		if(check>0)
			System.out.println("Database "+tableName+" hasbeen created");
		}

	}
