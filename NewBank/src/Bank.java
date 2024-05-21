import java.util.List;

public class Bank {
    private String nome;
    private List<ContaAbstract> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ContaAbstract> getContas() {
        return contas;
    }

    public void setContas(List<ContaAbstract> contas) {
        this.contas = contas;
    }
}
