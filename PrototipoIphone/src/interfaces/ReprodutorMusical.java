package interfaces;

import model.Music;

import java.util.List;

public interface ReprodutorMusical {
    public void tocar(List<Music> musicList);
    public void pausar(Music music);

    public void selecionarMusica(Music music);
}
