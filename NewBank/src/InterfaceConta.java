public interface InterfaceConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, ContaAbstract contaDestino);

    void imprimirExtrato();
}
