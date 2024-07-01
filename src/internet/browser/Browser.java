package internet.browser;

import internet.exibirPagina.ExibirPagina;
import internet.adicionarPagina.AdicionarPagina;
import internet.atualizarPagina.AtualizarPagina;

public class Browser implements ExibirPagina, AdicionarPagina, AtualizarPagina {

    @Override
    public void exibirPagina(){
        System.out.println("EXIBINDO PAGINA VIA BROWSER");
    }

    @Override
    public void adicionarPagina(){
        System.out.println("ADICIONANDO PAGINA VIA BROWSER");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("ATUALIZAR PAGINA VIA BROWSER");
    }
}
