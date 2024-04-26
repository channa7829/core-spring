package BeanLifeCycle;

import java.sql.SQLException;

public class ManualJDBCExmpl {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		WorldDto worldDto = new WorldDto();
		worldDto.selectAllRows();
		worldDto.deleteRecord(1);

	}

}
