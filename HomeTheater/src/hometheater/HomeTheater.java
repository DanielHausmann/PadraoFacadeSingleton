package hometheater;

public class HomeTheater {

    public static void main(String[] args) {
        Amplificador amplificador = new Amplificador();
        DvdPlayer dvdPlayer = new DvdPlayer("Vingadores");
        CdPlayer cdPlayer = new CdPlayer("Barões da Pisadinha");
        Radio radio = new Radio();
        Projetor projetor = new Projetor();
        Luz luz = new Luz();
        Tela tela = new Tela();
        Pipoca pipoca = new Pipoca();

        HomeTheaterFacade homeTheater = HomeTheaterFacade.getInstance(amplificador, dvdPlayer, cdPlayer, radio, projetor, luz, tela, pipoca);
        
        
        System.out.println("Assistir Filme");
        System.out.println("");
        homeTheater.watchMovie();
        System.out.println("");
        System.out.println("Encerrar Filme");
        System.out.println("");
        homeTheater.endMovie();
        System.out.println("");
         System.out.println("Ouvir Cd");
        System.out.println("");
        homeTheater.listenToCd();
        System.out.println("");
         System.out.println("Desligar Cd");
        System.out.println("");
        homeTheater.endCd();
        System.out.println("");
         System.out.println("Ligar Radio");
        System.out.println("");
        homeTheater.listenToRadio();
        System.out.println("");
         System.out.println("Desligar Radio");
        System.out.println("");
        homeTheater.endRadio();
    }

}
