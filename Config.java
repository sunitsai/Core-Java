package PraticeProgram;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Config {

	public static Connection getConnection()
	{
		Connection conn=null;
		try {
			Class.forName("com.jdbc.mysql.Driver");
			String url="mysql:jdbc://localhost:3306/tops";
			String name="root";
			String pass="";
			conn=DriverManager.getConnection(url,name,pass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
