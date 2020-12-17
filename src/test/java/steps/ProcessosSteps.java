package steps;

import definition.Processos;
import support.RESTSupport;

public class ProcessosSteps {
    @io.cucumber.java.pt.Dado("^O usuario esta na pagina de processos$")
    public void oUsuarioEstaNaPaginaDeProcessos() {
    }

    @io.cucumber.java.pt.E("^o usuário informar \"([^\"]*)\" com o valor igual a \"([^\"]*)\"$")
    public void oUsuárioInformarComOValorIgualA(String arg0, String arg1) throws Throwable {

    }

    @io.cucumber.java.pt.E("^o usuário informar \"([^\"]*)\" com o valor igual a \"([^\"]*)\"$")
    public void oUsuárioInformarComOValorIgualA(String arg0, String arg1) throws Throwable {

    }

    @io.cucumber.java.pt.E("^o usuário informar \"([^\"]*)\" com o valor igual a \"([^\"]*)\"$")
    public void oUsuárioInformarComOValorIgualA(String arg0, String arg1) throws Throwable {

    }

    @io.cucumber.java.pt.E("^o usuário informar \"([^\"]*)\" com o valor igual a \"([^\"]*)\"$")
    public void oUsuárioInformarComOValorIgualA(String arg0, String arg1) throws Throwable {

    }

    @io.cucumber.java.pt.Quando("^o usuário clicar no botão salvar$")
    public void oUsuárioClicarNoBotãoSalvar() {
        RESTSupport.executePost(Processos.obterEndPoint(), Processos.obterCampos());
        Processos.setId(RESTSupport.Key("id").toString());
    }

    @io.cucumber.java.pt.Então("^o usuário deveria ver a mensagem \"([^\"]*)\"$")
    public void oUsuárioDeveriaVerAMensagem(String arg0) throws Throwable {

    }

    @io.cucumber.java.pt.E("^o usuário gostaria de ver o processo <id>$")
    public void oUsuárioGostariaDeVerOProcessoId(String pId) {
        Processos.setId(pId);
    }

    @io.cucumber.java.pt.Quando("^o botao mostrar for clicado$")
    public void oBotaoMostrarForClicado() {
        RESTSupport.executeGet(Processos.obterEndPoint() + '/' + Processos.getId);
    }

    @io.cucumber.java.pt.Entao("^a <mensagem> deve ser mostrada$")
    public void aMensagemDeveSerMostrada() {
    }
}
