package contatodao;

import java.sql.Connection;
import java.sql.SQLException;




public class TestaConeccao {

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		// TODO Auto-generated method stub
		
			Connection connection = new ConnectorFactory().getConnection();
			Connection con = new ConnectorFactory().getConnection();
		      System.out.println("Conexão aberta!");
		      connection.close();
		      
		
	}

}
