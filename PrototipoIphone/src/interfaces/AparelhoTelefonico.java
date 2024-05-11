package interfaces;

import model.Music;

import java.util.List;

public interface AparelhoTelefonico {
    public void tocar();
    public void pausar();
    public void selecionarMusica(List<Music> musicList);
}
