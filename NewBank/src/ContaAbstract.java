public abstract class ContaAbstract implements InterfaceConta {
    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;
    protected int agencia;
    protected int numeroConta;

    protected double saldo;

    protected Client cliente;



    public ContaAbstract(Client cliente) {
        this.agencia = ContaAbstract.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, ContaAbstract contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numeroConta));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
