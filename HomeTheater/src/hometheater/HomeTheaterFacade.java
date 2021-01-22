package hometheater;

public class HomeTheaterFacade {

    private static HomeTheaterFacade uniqueInstance;

    Amplificador amplificador;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Radio radio;
    Projetor projetor;
    Luz luz;
    Tela tela;
    Pipoca pipoca;

    private HomeTheaterFacade(Amplificador amplificador, DvdPlayer dvdPlayer,
            CdPlayer cdPlayer, Radio radio, Projetor projetor, Luz luz, Tela tela, Pipoca pipoca) {
        this.amplificador = amplificador;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.radio = radio;
        this.projetor = projetor;
        this.luz = luz;
        this.tela = tela;
        this.pipoca = pipoca;
    }

    public void watchMovie() {
        pipoca.ligado();
        pipoca.pop();
        luz.desligado();
        tela.descer();
        projetor.ligado();
        projetor.setDvd();
        projetor.wideScreen();
        amplificador.ligado();
        amplificador.setDvd();
        amplificador.setSurroundSound();
        amplificador.setVolume(5);
        dvdPlayer.ligado();
        dvdPlayer.play();

    }

    public void endMovie() {
        pipoca.desligado();
        luz.ligado();
        tela.subir();
        projetor.desligado();
        amplificador.desligado();
        dvdPlayer.parar();
        dvdPlayer.ejetar();
        dvdPlayer.desligado();
    }

    public void listenToCd() {
        luz.ligado();
        amplificador.ligado();
        amplificador.setStereoSound();
        amplificador.setVolume(8);
        amplificador.setCd();
        cdPlayer.ligado();
        cdPlayer.play();
    }

    public void endCd() {
        luz.desligado();
        cdPlayer.pausar();
        cdPlayer.ejetar();
        amplificador.desligado();
        cdPlayer.desligado();

    }

    public void listenToRadio() {
        luz.ligado();
        amplificador.ligado();
        amplificador.setStereoSound();
        amplificador.setRadio();
        amplificador.setVolume(20);
        radio.setFm();
        radio.ligado();
        radio.setFrequencia(90.5);
    }

    public void endRadio() {
      luz.desligado();
      radio.desligado();
      amplificador.desligado();
    }

    public static HomeTheaterFacade getInstance(Amplificador amplificador, DvdPlayer dvdPlayer, CdPlayer cdPlayer,
            Radio radio, Projetor projetor, Luz luz, Tela tela, Pipoca pipoca) {
        if (uniqueInstance == null) {
            uniqueInstance = new HomeTheaterFacade(amplificador, dvdPlayer, cdPlayer, radio, projetor, luz, tela, pipoca);
        }
        return uniqueInstance;

    }
}
