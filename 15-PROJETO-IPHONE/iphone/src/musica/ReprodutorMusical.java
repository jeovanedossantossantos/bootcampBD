package musica;

public interface ReprodutorMusical {

    public void tocar();

    public void pausar();

    public void selecionarMusica(String musica);

    public String getMusicaAtual();

}
