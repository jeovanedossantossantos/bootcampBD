public class SmartTV {
    private int canal = 1; // Variável de instância, escopo é a classe SmartTV
    private int volume = 10; // Variável de instância, escopo é a classe SmartTV
    private boolean ligada = false; // Variável de instância, escopo é a classe SmartTV

    public int getCanal() { // Método público, escopo é a classe SmartTV
        return canal;
    }

    public void setCanal(int canal) { // Método público, escopo é a classe SmartTV
        this.canal = canal;
    }

    public int getVolume() { // Método público, escopo é a classe SmartTV
        return volume;
    }

    public void aumentarVolume() { // Método público, escopo é a classe SmartTV
        this.volume++;
    }

    public void diminuirVolume() { // Método público, escopo é a classe SmartTV
        this.volume--;
    }

    public boolean getLigada() { // Método público, escopo é a classe SmartTV
        return ligada;
    }

    public void setLigada(boolean ligada) { // Método público, escopo é a classe SmartTV
        this.ligada = ligada;
    }
}

// public class Escopo {
// public static void main(String[] args) throws Exception {
// System.out.println("Hello, World!");
// }
// }
