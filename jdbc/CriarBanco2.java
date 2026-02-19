package jdbc;

import java.sql.*;

public class  CriarBanco2 {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost/curso_java2";
        final String user = "root";
        final String password = "PauloCesar123$";

        Connection conexao = DriverManager.getConnection(url,user,password);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java2");

        System.out.println("Banco criado com sucesso");

        conexao.close();
    }
}
