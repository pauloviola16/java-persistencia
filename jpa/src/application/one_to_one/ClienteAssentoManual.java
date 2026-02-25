package application.one_to_one;

import config.DAO;
import entity.one_to_one.Assento;
import entity.one_to_one.Cliente;

public class ClienteAssentoManual {

	public static void main(String[] args) {
		
		Assento assento = new Assento("16A");
		Cliente cliente = new Cliente("Carlos", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(assento)
			.incluir(cliente)
			.fecharT()
			.fechar();
	}
}
