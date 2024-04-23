public class ContaTerminal {

    private int numeroConta;
    private String numeroAgencia;
    private String nomeCLiente;
    private float saldo;

    public ContaTerminal() {
    }

    @Override
    public String toString() {
        return "Olá "+ getNomeCLiente()+", obrigado por criar uma conta em nosso banco, sua agencia é "+ getNumeroAgencia() +
                ", conta "+ getNumeroConta() + " e seu saldo de "+ getSaldo() + " ja esta disponível para saque.";
    }

    public ContaTerminal(int numeroConta, String numeroAgencia, String nomeCLiente, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeCLiente = nomeCLiente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeCLiente() {
        return nomeCLiente;
    }

    public void setNomeCLiente(String nomeCLiente) {
        nomeCLiente = nomeCLiente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }




}
