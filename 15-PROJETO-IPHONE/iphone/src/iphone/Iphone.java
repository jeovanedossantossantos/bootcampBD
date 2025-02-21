package iphone;

import musica.ReprodutorMusical;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private String siteAtual;

    public Iphone() {
    }

    @Override
    public void tocar() {

        System.out.println("Tocando música: " + this.musicaAtual);
    }

    @Override
    public void pausar() {

        System.out.println("Pausando música: " + this.musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {

        System.out.println("Selecionando música: " + musica);
        this.musicaAtual = musica;
    }

    @Override
    public String getMusicaAtual() {

        return this.musicaAtual;
    }

    @Override
    public void ligar(String numero) {

        System.out.println("Ligando para " + numero);
    }

    @Override
    public void iniciarCorreioVoz() {

        System.out.println("Correio de voz...");
    }

    @Override
    public void atender() {

        System.out.println("Atendendo...");
    }

    @Override
    public void desligar() {

        System.out.println("Desligando...");
    }

    @Override
    public void exibirPagina(String site) {

        System.out.println("Abrindo site: " + site);
        this.siteAtual = site;
    }

    @Override
    public void fecharAba() {

        System.out.println("Fechando site: " + this.siteAtual);
        this.siteAtual = null;
    }

    @Override
    public void adicionarNovaAba() {

        System.out.println("Navegando no site: " + this.siteAtual);
    }

    @Override
    public void atualizarPagina() {

        System.out.println("Atualizando site: " + this.siteAtual);
    }

}
