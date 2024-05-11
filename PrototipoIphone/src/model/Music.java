package model;


public class Music {
    private String nome;
    private String cantor;

    public Music(String nome, String cantor) {
        this.nome = nome;
        this.cantor = cantor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
}
