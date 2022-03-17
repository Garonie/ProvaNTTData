package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id = "btLogar")
	private WebElement botaoEntrar;
	
	@FindBy(xpath = "")
	private WebElement campoCPF;

	@FindBy(name = "")
	private WebElement botaoProximo;

	@FindBy(name = "")
	private WebElement campoSenha;

	@FindBy(name = "")
	private WebElement botaoEntrarSistema;
	
	
	public void clicarbotaoEntrar() {
		botaoEntrar.click();
	}

	public void informarCampoCPF(String cpf) {
		campoCPF.sendKeys(cpf);
	}

	public void clicarBotaoProximo() {
		botaoProximo.click();
	}

	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	public void clicarbotaoEntrarSistema() {
		botaoEntrarSistema.click();
	}

	public void login() {
		clicarbotaoEntrar();
//		informarCampoCPF("55");
//		clicarBotaoProximo();
//		informarCampoSenha("55");
//		clicarbotaoEntrarSistema();
	}

}
