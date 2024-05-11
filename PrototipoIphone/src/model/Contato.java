package model;

public class Contato {
    private String nome;
    private String endereco;

    public Contato(String nome, String endereco, long numeroTelefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroTelefone = numeroTelefone;
    }

    private long numeroTelefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
