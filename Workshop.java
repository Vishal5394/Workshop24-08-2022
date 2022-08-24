package com.bridgeLabz.workshop;
import java.sql.*;

public class Workshop {
	public static void main(String[] args) {
		String jdbcURL= "jdbc:mysql://localhost:3306/persondb?useSSL=false";
		String userName = "root";
		String password = "Vishal5394#";
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded!");
			con = DriverManager.getConnection(jdbcURL,userName,password);
			Statement stmt = con.createStatement();
		
		String q = "create table personinfo(ID int(20) primary key auto_increment, Name varchar(200), PhoneNumber varchar(225) )";
		String q1= "Insert into personinfo Values('1','Vishal','9876543210')";
		stmt.executeUpdate(q1);
		System.out.println("Inserted Successfully.......");
		con.close();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	
	}

}
