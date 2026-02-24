package jdbc.select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.connection.ConnectionFactory;
import jdbc.model.Person;

public class SelectAllPeople {
    public static void main(String[] args) throws SQLException {
        Connection conexao = ConnectionFactory.getConexao();
        String sql = "SELECT * FROM pessoas";

        Statement stmt =  conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        List<Person> pessoas = new ArrayList<>();
        while (resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Person(nome, codigo));
        }

        for (Person p: pessoas){
            System.out.println(p.getCodigo() + "-->" + p.getNome());
        }

        stmt.close();
        conexao.close();
    }
}
