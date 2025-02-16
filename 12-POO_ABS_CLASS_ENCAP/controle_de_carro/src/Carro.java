public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int qunt_marcha;
    private int atual_marcha;
    private boolean ligado;
    private float velocidade;
    private float velocidade_max;
    private Enum direcao;

    public Carro() {

    }

    public Carro(String marca, String modelo, int ano, String cor, int qunt_marcha, float velocidade_max) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;

        setQuntMarcha(qunt_marcha);
        this.velocidade_max = velocidade_max;
        this.atual_marcha = 0;// 0 é ponto morto e a ultima marcha é a re
        this.ligado = false;
        this.velocidade = 0;
        this.direcao = Enum.PARADO;

    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {

        if (this.ligado && this.atual_marcha != 0) {

            if (velocidade > this.velocidade_max) {
                System.out.println("Velocidade máxima atingida");
                this.velocidade = this.velocidade_max;

            } else if (velocidade < 0) {
                System.out.println("Dando ré:" + velocidade);

                this.velocidade = velocidade;
            } else if (this.velocidade > velocidade) {
                this.velocidade = velocidade;
                System.out.println("Velocidade reduzida para " + this.velocidade);
            } else if (this.velocidade < velocidade) {
                this.velocidade = velocidade;
                System.out.println("Velocidade aumentada para " + this.velocidade);
            } else {
                this.velocidade = velocidade;
            }
        } else {
            System.out.println("Carro desligado ou em ponto morto");
        }
    }

    public Enum getDirecao() {
        return direcao;
    }

    public void setDirecao(Enum direcao) {
        this.direcao = direcao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuntMarcha() {
        return qunt_marcha;
    }

    public void setQuntMarcha(int qunt_marcha) {
        if (qunt_marcha < 0) {
            System.out.println("Quantidade de marchas inválida");
            return;
        }
        this.qunt_marcha = qunt_marcha;
    }

    public int getAtualMarcha() {
        return atual_marcha;
    }

    public void aumentarMarcha() {
        if (this.atual_marcha < this.qunt_marcha) {
            this.atual_marcha += 1;
        }

    }

    public void diminuirMarcha() {
        if (this.atual_marcha > 0) {
            this.atual_marcha -= 1;
        }

    }

    public void re() {
        this.atual_marcha = this.qunt_marcha;
    }

}
