package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelasPessoas2 {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao2.getConexao2();

        String sql = "  CREATE TABLE IF NOT EXISTS pessoas2 ("
                + "codigo INT AUTO_INCREMENT PRIMARY KEY,"
                + "nome VARCHAR(80) NOT NULL"
                + ")";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso");

        conexao.close();
    }
}
