public class ContaCorr extends ContaAbstract{
    public ContaCorr(Client cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("***Extrato Conta Corrente***");
        super.imprimirInfosComuns();
    }
}
