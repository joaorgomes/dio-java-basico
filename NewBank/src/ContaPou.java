public class ContaPou extends ContaAbstract{
    public ContaPou(Client cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***Extrato Conta Poupança***");
        super.imprimirInfosComuns();
    }
}
