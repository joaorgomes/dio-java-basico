import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        String jogador1, jogador2;
// TODO: complete os espaços em branco com sua solução para o problema
        for (int i = 0; i < N; i++) {
            jogador1 = leitor.next();
            jogador2 = leitor.next();

            //ataque vs pedra ataqque Vence
            //pedra vs papel pedra Vence
            //
            if(jogador1.equalsIgnoreCase(jogador2)){
                if(jogador2.equalsIgnoreCase("ataque")){
                    System.out.println("Aniquilacao mutua");
                }else if(jogador1.equalsIgnoreCase("papel")){
                    System.out.println("Ambos venceram");
                }else{
                    System.out.println("Sem ganhador");
                }
            }else{
                if(jogador1.equalsIgnoreCase("ataque")){
                    System.out.println("Jogador 1 venceu");
                }else if(jogador1.equalsIgnoreCase("pedra")){
                    if(jogador2.equalsIgnoreCase("ataque")){
                        System.out.println("Jogador 2 venceu");
                    }else{
                        System.out.println("Jogador 1 venceu");
                    }

                }else{
                    System.out.println("Jogador 2 venceu");
                }
            }
        }
    }
}