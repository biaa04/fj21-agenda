package contatodao;

import java.sql.SQLException;
import java.util.Calendar;

import contatoexc.Contato;

public class TestaInsere {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R.Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado!");
	}

}
