package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao2 {

    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost/curso_java2";
        final String user = "root";
         final String password = "PauloCesar123$";

        Connection conexao = DriverManager.getConnection(url,user,password);

        System.out.println("Conexão gerada com sucesso");

        conexao.close();
    }
}
