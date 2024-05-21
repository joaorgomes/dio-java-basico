public class Main {
    public static void main(String[] args) {

        Client joao = new Client("Joao Gomes");
        Client joaoLucas = new Client("Joao Lucas");

        ContaAbstract cc = new ContaCorr(joao);
        ContaAbstract cp = new ContaPou(joaoLucas);

        cc.depositar(100);
        cc.transferir(20, cp);

        cc.imprimirExtrato();

        System.out.println("");
        System.out.println("");

        cp.imprimirExtrato();
    }
}
