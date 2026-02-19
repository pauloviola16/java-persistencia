package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao2 {
    public static Connection getConexao2(){
        try {
            final String url = "jdbc:mysql://localhost/curso_java2";
            final String user = "root";
            final String passoword = "PauloCesar123$";

            return DriverManager.getConnection(url, user, passoword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
