package BeanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WorldDto {

	private String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/world";
	private String userName ="root";
	private String password = "root";


	public void selectAllRows() throws ClassNotFoundException, SQLException {

		System.out.println(" retriving all students data");

		//load drivers
		Class.forName(driver);

		//get connection
		Connection connection = DriverManager.getConnection(url,userName,password);

		//create a query
		Statement statement = connection.createStatement();
		System.out.println(" Connection Succusfull");


		ResultSet executeQuery = statement.executeQuery("SELECT \r\n"
				+ "	`city`.`ID`,\r\n"
				+ "    `city`.`Name`,\r\n"
				+ "    `city`.`CountryCode`,\r\n"
				+ "    `city`.`District`,\r\n"
				+ "    `city`.`Population`\r\n"
				+ "FROM `world`.`city`\r\n"
				+ "limit 100;");

		System.out.println("+----------+-----------+");
		System.out.println("|   id     |     name  |");
		System.out.println("+----------+-----------+");
		while (executeQuery.next()) {
			int id = executeQuery.getInt(1);
			String name = executeQuery.getString(2);
			
			System.out.println("|         "+ id  +"|"+name+"    ");
		}
	}
	
	public void deleteRecord(int id) throws ClassNotFoundException, SQLException {
		System.out.println(" Deleting the data of id :"+id);

		//load drivers
		Class.forName(driver);

		//get connection
		Connection connection = DriverManager.getConnection(url,userName,password);

		//create a query
		Statement statement = connection.createStatement();
		System.out.println(" Connection Succusfull for delete");
		
		statement.executeUpdate("delete from  `world`.`city` where id = "+id);
		System.out.println(" Deletation Completed");
		
		selectAllRows();
		
	}
	
	
}
