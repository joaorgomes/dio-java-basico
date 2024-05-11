package model;

import interfaces.NavegadorInternet;

import java.util.List;

public class Internet implements NavegadorInternet {

    private List<String> sitesFavoritos;

    @Override
    public void exibirPagina() {
        //Implementar codigo
    }

    @Override
    public void adicionarNovaAba() {
        //Implementar codigo
    }

    @Override
    public void atualizarPagina() {
        //Implementar codigo
    }

    @Override
    public boolean adicionarFavorito(String urlSite) {
        //Implementar codigo
        return false;
    }
}
