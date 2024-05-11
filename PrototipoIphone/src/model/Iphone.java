package model;

import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
import interfaces.AparelhoTelefonico;

import java.util.List;

public class Iphone {

    private Ipod meuIpod;

    private Telefone meuTelefone;

    private Internet meuNavegador;

    private List<MensagemDeVoz> mensagemDeVozList;

    public Iphone() {
    }

    public Iphone(Ipod meuIpod, Telefone meuTelefone, Internet meuNavegador) {
        this.meuIpod = meuIpod;
        this.meuTelefone = meuTelefone;
        this.meuNavegador = meuNavegador;
    }

    public void usarIpod(Ipod meuIpod){
        //Implementar codigo
    }
    public void usarTelefone(Telefone meuTelefone){
        //Implementar codigo
    }

    public void usarNavegador(Internet meuNavegador){
        //Implementar codigo
    }

    public List<MensagemDeVoz> getMensagemDeVozList() {
        return mensagemDeVozList;
    }

    public void setMensagemDeVozList(List<MensagemDeVoz> mensagemDeVozList) {
        this.mensagemDeVozList = mensagemDeVozList;
    }

    public void ligarIphone() {
        System.out.println("Ligando Iphone");
    }

    public void desligarIphone() {
        System.out.println("Desigando Iphone");
    }

    public void modoAviao() {
        System.out.println("Modo Avião Ativado Todos os serviços do seu Iphone foram desligados.");
    }

    public MensagemDeVoz lerMensagensDeVoz(List<MensagemDeVoz> mensagemDeVozList) {

        return null;

    }


}
