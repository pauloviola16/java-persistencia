package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao2.getConexao2();

        String sql = "SELECT * FROM pessoas2";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Pessoa2> pessoas = new ArrayList<>();

        while(resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
           pessoas.add(new Pessoa2(nome,codigo));
        }

        for (Pessoa2 p: pessoas ){
            System.out.println(p.getCodigo() + " -> " + p.getNome());
        }

        stmt.close();
        conexao.close();
    }
}
