package aparelho;

import funcoesAparelho.ligar.Ligar;
import funcoesAparelho.atender.Atender;
import funcoesAparelho.iniciarCorreioVoz.CorreioVoz;
import funcoesAparelho.aparelhoTelefonico.AparelhoTelefonico;

import funcoesMusicais.pausar.Pausar;
import funcoesMusicais.selecionarMusica.SelecionarMusica;
import funcoesMusicais.tocar.Tocar;
import funcoesMusicais.reprodutorMusical.ReprodutorMusical;

import internet.browser.Browser;
import internet.exibirPagina.ExibirPagina;
import internet.adicionarPagina.AdicionarPagina;
import internet.atualizarPagina.AtualizarPagina;



public class Celular {
    public static void main(String[] args) {
        ReprodutorMusical rm = new ReprodutorMusical();
        AparelhoTelefonico at = new AparelhoTelefonico();
        Browser b = new Browser();

        Pausar pausar = rm;
        Tocar tocar = rm;
        SelecionarMusica selecionarMusica = rm;

        Ligar ligar = at;
        Atender atender = at;
        CorreioVoz correioVoz = at;

        ExibirPagina exibirPagina = b;
        AdicionarPagina adicionarPagina = b;
        AtualizarPagina atualizarPagina = b;

        pausar.pausar();
        tocar.tocar();
        selecionarMusica.selecionarMusica();

        System.out.println("");

        ligar.ligar();
        atender.atender();
        correioVoz.correioVoz();

        System.out.println("");

        exibirPagina.exibirPagina();
        adicionarPagina.adicionarPagina();
        atualizarPagina.atualizarPagina();

    }
}
