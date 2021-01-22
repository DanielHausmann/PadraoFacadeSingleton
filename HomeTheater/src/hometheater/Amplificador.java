package hometheater;

public class Amplificador {

    String description;
    Radio radio;
    DvdPlayer dvd;
    CdPlayer cd;

    public void ligado() {
        System.out.println("Liga o amplificador de áudio");
    }

    public void desligado() {
        System.out.println("Desliga o amplificador de  áudio;");
    }

    public void setCd() {
        System.out.println("Seleciona o amplificador para entrada de CD");
       
    }

    public void setDvd() {
        System.out.println("Seleciona o amplificador para entrada de DVD" );
        
    }

    public void setStereoSound() {
        System.out.println("Seleciona o amplificador para som Stereo");
    }

    public void setSurroundSound() {
        System.out.println("Seleciona o amplificador para som surround");
    }

    public void setRadio() {
        System.out.println("Seleciona o amplificador para entrada de Rádio");
       
    }

    public void setVolume(int volume) {
        System.out.println("Som ajustado para o volume "+ volume);
    }

}
