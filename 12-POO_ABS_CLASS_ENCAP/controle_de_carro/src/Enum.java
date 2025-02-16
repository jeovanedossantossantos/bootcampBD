public enum Enum {
    FRENTE("Frente"),
    TRAS("Trás"),
    ESQUERDA("Esquerda"),
    DIREITA("Direita"),
    PARADO("Parado");

    private String direcao;

    private Enum(String direcao) {
        this.direcao = direcao;

    }

    public String getDirecao() {
        return this.direcao;
    }

}
