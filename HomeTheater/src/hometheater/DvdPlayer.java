package hometheater;

public class DvdPlayer {
    
    Amplificador amplificador;
    String filme;
    
    public DvdPlayer(String filme) {
        this.filme = filme;
    }

    public void ligado() {
        System.out.println("Liga o DVD player");
    }

    public void desligado() {
        System.out.println("Desliga o DVD player");
    }

    public void ejetar() {
        System.out.println("Ejetando o disco (DVD)");
    }

    public void play(){
        System.out.println("Inicia a reprodução do DVD "+ filme);
    }

    public void pausar() {
        System.out.println("");
    }

    public void setTwoChannelAudio() {
        System.out.println("");
    }

    public void setSurroundAudio() {
        System.out.println("");
    }

    public void parar() {
        System.out.println("Para a reprodução do DVD "+ filme);
    }
}
