package jdbc.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.connection.ConnectionFactory;

public class CreatePeopleTable {

    public static void main(String[] args) throws SQLException {
        Connection conexao = ConnectionFactory.getConexao();

        String sql = "CREATE TABLE PESSOAS ("
          + "CODIGO INT AUTO_INCREMENT PRIMARY KEY,"
          + "NOME VARCHAR (80) NOT NULL"
          + ")";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso");
        conexao.close();
    }
}
