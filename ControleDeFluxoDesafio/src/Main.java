import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int numeroUm = Integer.parseInt(terminal.nextLine());
        System.out.println("Digite o segundo parâmetro: ");
        int numeroDois = Integer.parseInt(terminal.nextLine());

        Contador contador = new Contador(numeroUm,numeroDois);

        try {
            contador.contar(contador.getParametroUm(), contador.getParametroDois());
        } catch (ParametrosInvalidoException e) {

            System.out.println("O primeiro parametro deve ser menor que o segundo parametro");
        }


    }
}