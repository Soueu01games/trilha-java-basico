public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Métodos de controle de volume
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    // Métodos para ligar e desligar a TV
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    // Métodos de controle de canal
    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
