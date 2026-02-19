package jdbc;

public class Pessoa2 {
    private int codigo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pessoa2 (String nome, int codigo){
        this.codigo = codigo;
        this.nome = nome;
    }
}
