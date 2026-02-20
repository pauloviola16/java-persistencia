package teste.umpraum;

import com.mysql.cj.xdevapi.Client;
import infra.DAO;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {

        DAO<Cliente> dao = new DAO<>(Cliente.class);

        Cliente cliente = dao.obterPorID(1L);
        System.out.println(cliente.getAssento().getNome());

        dao.fechar();

    }
}
