package funcoesMusicais.reprodutorMusical;

import funcoesMusicais.pausar.Pausar;
import funcoesMusicais.selecionarMusica.SelecionarMusica;
import funcoesMusicais.tocar.Tocar;

public class ReprodutorMusical implements Pausar, Tocar, SelecionarMusica {

    @Override
    public void pausar (){
        System.out.println("PAUSANDO MUSICA VIA REPRODUTOR MUSICAL");
    }

    @Override
    public void tocar(){
        System.out.println("TOCANDO VIA REPRODUTOR MUSICAL");
    }

    @Override
    public void selecionarMusica(){
        System.out.println("SELECIONANDO MUSICA VIA REPRODUTOR MUSICAL");
    }


}
