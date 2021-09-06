package steps;

import java.util.List;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import phoneObjects.PhonePage;
import static utils.PhoneMetodos.driver;

public class PhoneSteps {
	
	PhonePage ph = new PhonePage(driver);

		
	@Dado("acionar a opacap contato")
	public void acionarAOpacapContato()  throws Exception{
		ph.acessarMenuContato();
		
	}

	@Quando("o usuario acionar o botao Criar Contato")
	public void oUsuarioAcionarOBotaoCriarContato()  throws Exception{
		ph.acionarBotaoAddContato();
	 
	}

	@Quando("adicionar o contato")
	public void adicionarOContato() throws Exception {
		ph.adicionarNome("Chefao");
		ph.adicionarPhone("9877-5636");
	 
	}

	@Entao("o app adiciona um novo contato e valida com essas imformacoes")
	public void oAppAdicionaUmNovoContatoEValidaComEssasImformacoes(List<String> dados) throws Exception {
	    ph.botaoSave();
	    ph.validarInformacoes(dados);
	}




}
