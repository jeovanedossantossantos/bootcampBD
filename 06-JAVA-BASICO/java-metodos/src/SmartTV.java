public class SmartTV {
    private int canal = 1;
    private int volume = 10;
    private boolean ligada = false;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

}
