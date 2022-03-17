package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaHome.HomePage;

public class ValidarProdutosSetps extends HomePage {

	
	@Dado("que o usuario acesse o site")
	public void que_o_usuario_acesse_o_site() {
	}

	@Dado("o usuario acessa o menu Special Offer")
	public void o_usuario_acessa_o_menu_Special_Offer() throws InterruptedException {
		acessa_o_menu_Special_Offer();
	}

	@Quando("o usuario clica no botao See offer")
	public void o_usuario_clica_no_botao_See_offer() {
		clica_no_botao_See_offer();
	}

	@Entao("o sistema deve validar as informacoes de acordo com o banco da automacao")
	public void o_sistema_deve_validar_as_informacoes_de_acordo_com_o_banco_da_automacao() {
		
	}

}
