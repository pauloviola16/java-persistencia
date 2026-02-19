package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Conectado: " + !conexao.isClosed());
        System.out.println("Banco: " + conexao.getCatalog());

    }

}
