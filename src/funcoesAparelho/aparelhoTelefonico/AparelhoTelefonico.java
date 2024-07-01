package funcoesAparelho.aparelhoTelefonico;

import funcoesAparelho.ligar.Ligar;
import funcoesAparelho.atender.Atender;
import funcoesAparelho.iniciarCorreioVoz.CorreioVoz;

public class AparelhoTelefonico implements Ligar, Atender, CorreioVoz {

    @Override
    public void ligar(){
        System.out.println("LIGANDO VIA APARELHO TELEFONICO");
    }

    @Override
    public void atender(){
        System.out.println("ANTENDENDO VIA APARELHO TELEFONICO");
    }

    @Override
    public void correioVoz(){
        System.out.println("CORREIO DE VOZ VIA APARELHO TELEFONICO");
    }



}
