package application.one_to_one;

import config.DAO;
import entity.one_to_one.Assento;
import entity.one_to_one.Cliente;

public class ClienteAssentoCascade {

	public static void main(String[] args) {
		
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Maria", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
	}
}
