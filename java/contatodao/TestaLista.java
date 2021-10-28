package contatodao;

import java.sql.SQLException;
import java.util.List;

import contatoexc.Contato;

public class TestaLista {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();
	  for(Contato contato : contatos) {
		  System.out.println("Nome: "+contato.getNome());
		  System.out.println("Email: "+contato.getEmail());
		  System.out.println("Endereço: "+contato.getEndereco());
		  System.out.println("Data de nascimento: "+contato.getDataNascimento().getTime()+"\n");
	  }
	}

}
