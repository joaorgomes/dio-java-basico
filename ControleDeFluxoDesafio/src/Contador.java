public class Contador {
    private int parametroUm;
    private int parametroDois;


    public Contador(int num1, int num2){
        this.parametroUm = num1;
        this.parametroDois = num2;
    }

    public void setParametroUm(int novoParametroUm){
        this.parametroUm = novoParametroUm;
    }
    public void setParametroDois(int novoParametroDois){
        this.parametroDois = novoParametroDois;
    }

    public int getParametroUm(){
        return parametroUm;
    }
    public int getParametroDois(){
        return parametroDois;
    }

    public void contar(int numero1, int numero2) throws ParametrosInvalidoException{

        if(numero1  >  numero2){
            throw  new ParametrosInvalidoException();
        }

        int contagem = numero2 - numero1;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }

}
