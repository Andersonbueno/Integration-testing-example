package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import definition.Usuario;
import support.RESTSupport;

public class UsuarioSteps {
    @io.cucumber.java.pt.Dado("^que o usuário gostaria de salvar seu registro$")
    public void queOUsuarioGostariaDeSalvarSeuRegistro() {
        Usuario.limparCampos();
    }

    @io.cucumber.java.pt.E("^o usuário informar \"([^\"]*)\" com o valor igual a \"([^\"]*)\"$")
    public void oUsuarioInformarComOValorIgualA(String campo, String valor) throws Throwable {
        Usuario.preencherCampo(campo,valor);
    }

    @io.cucumber.java.pt.Quando("^o usuário clicar no botão salvar$")
    public void oUsuarioClicarNoBotãoSalvar() {
        RESTSupport.executePost(Usuario.obterEndPoint(), Usuario.obterCampos());

    }

}
