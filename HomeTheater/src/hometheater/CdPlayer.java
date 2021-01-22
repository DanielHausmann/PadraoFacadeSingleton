package hometheater;

public class CdPlayer {

    Amplificador amplificador;
    String cd;

    public CdPlayer(String cd) {
        this.cd = cd;
    }

    public void ligado() {
        System.out.println("Liga o CD player");
    }

    public void desligado() {
        System.out.println("Desliga o CD player");
    }

    public void ejetar() {
        System.out.println("Ejetando o disco (CD)");
    }

    public void pausar() {
        System.out.println("CD "+ cd+ " pausado");
    }

    public void play() {
        System.out.println("Inicia a reprodução do CD " + cd);
    }

    public void parar() {
        System.out.println("Para a reprodução do CD " + cd);
    }
}
