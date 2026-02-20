package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectPeopleByName {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        Connection conexao = ConnectionFactory.getConexao();

        System.out.println("Informe o valor para pesquisa: ");
        String valor = entrada.nextLine();

        String sql = "SELECT * FROM pessoas2 WHERE nome like ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,"%" + valor + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa2> pessoas = new ArrayList<>();

        while(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa2(nome,codigo));
        }

        for (Pessoa2 p: pessoas ){
            System.out.println(p.getCodigo() + " -> " + p.getNome());
        }

        entrada.close();
        stmt.close();
        conexao.close();
    }
}