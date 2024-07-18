package com.slokam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestJdbc
{
	public static void main(String[] args) throws Exception
	{	
		// 1)Loading the driver class in the JVM
		
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2) Establishing the connection between the Java and MySql
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestJdbc", "root", "root");
		
		// 3) Creating Statement Object to use Sql Queries
		
		
		
	}
}
