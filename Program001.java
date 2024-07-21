//001. Write a program which inserts a record of an employee.

import java.sql.*;
public class Program001
	{
		public static void main(String[] args)
		{
		Connection conn;
		Statement stmt;

		String url = "jdbc:mysql://localhost:3306/employee";

		try
		{
			conn = DriverManager.getConnection(url, "ROOT", "tnrao");
			stmt = conn.createStatement();
			String sql = "INSERT INTO `emp` VALUES (5, 'lopa', 'sharma', 'cleark')";
			int val = stmt.executeUpdate(sql);

			System.out.println(val + "Inserted Succesfully");


			stmt.close();
			conn.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

//output >>>
// 1 Recored Inserted Successfully 