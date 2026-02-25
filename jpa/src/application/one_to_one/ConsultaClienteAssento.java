package application.one_to_one;

import config.DAO;
import entity.one_to_one.Assento;
import entity.one_to_one.Cliente;

public class ConsultaClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorID(1L);
		System.out.println(cliente.getAssento().getNome());

		daoCliente.fechar();
		
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		
		Assento assento = daoAssento.obterPorID(4L);
		System.out.println(assento.getCliente().getNome());
		
		daoAssento.fechar();
	}
}
