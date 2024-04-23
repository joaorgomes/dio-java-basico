import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nomeCliente,agencia;
        int numeroConta;
        float saldo;

        System.out.println("Por favor digite seu nome: ");
        nomeCliente = leitor.nextLine();
        System.out.println("Por favor digite o número da agência: ");
        agencia = leitor.nextLine();
        System.out.println("Agora digite o numero de sua conta: ");
        numeroConta = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite agora o valor que será credito como saldo de abertura da conta: ");
        saldo = Float.parseFloat(leitor.nextLine());

        ContaTerminal contaTerminal = new ContaTerminal(numeroConta,agencia,nomeCliente,saldo);

        System.out.println(contaTerminal.toString());


    }
}