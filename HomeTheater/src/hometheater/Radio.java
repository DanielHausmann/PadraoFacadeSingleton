package hometheater;

public class Radio {

    Amplificador amplificador;

    public Radio() {

    }

    public void ligado() {
        System.out.println("Liga o Rádio");
    }

    public void desligado() {
        System.out.println("Desliga o Rádio");
    }

    public void setAm() {
        System.out.println("Configura o rádio para o modo AM");
    }

    public void setFm() {
        System.out.println("Configura o rádio para o modo FM");
    }

    public void setFrequencia(double frequencia) {
        System.out.println("Frequencia ajustada para " + frequencia);
    }
}
