package cap_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
		try {
			
			
			Connection c ;
			
			String tipoBanco = System.getenv("tipoBanco");
			
			
			if("mysql".equals(tipoBanco)){
				c = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "123");
			}else {
				c =	DriverManager.getConnection("jdbc:postgres://localhost/banco", "root", "123");
			}
			
			return c;
		} catch (SQLException e) {
			throw new RuntimeException("e");
		}
	}
}
