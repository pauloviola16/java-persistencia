package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa2 {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome a ser adicionado:");
        String nome = scanner.nextLine();

        Connection conexao = FabricaConexao2.getConexao2();

        String sql = "INSERT INTO pessoas2 (nome) VALUES (?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.execute();

        System.out.println("Nome adicionado na tabela com sucesso!");

        stmt.close();
        conexao.close();
        scanner.close();
    }
}
