package dataReading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadingDataFromDataBase {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "Flink@54");
		Statement statement = con.createStatement();
		ResultSet query = statement.executeQuery("select EmpName from Emp where salary=25000");
		while(query.next()) {
			System.out.println(query.getString("EmpName"));
		}
	}

}
