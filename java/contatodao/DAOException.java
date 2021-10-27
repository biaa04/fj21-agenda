package contatodao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConnectorFactory.ConnectorFactory;

import java.sql.Connection;
import java.sql.Date;


import contatoexc.Contato;

public class DAOException {
	
	public void altera(Contato contato) throws ClassNotFoundException {
		
		String sql = "update contatos set nome=?, email=?,endereco=?,"+"dataNascimento=? where id=?";
		
		try {
			Connection connection = new ConnectorFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento()
	                .getTimeInMillis()));
			stmt.setLong(5,contato.getId());
			stmt.execute();
			stmt.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
