package application.one_to_many;

import config.DAO;
import entity.one_to_many.ItemPedido;
import entity.one_to_many.Pedido;

public class PedidoConsulta {

	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorID(1L);
		
		for(ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
		
		dao.fechar();
	}
}
