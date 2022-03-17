package pageObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CriarContaPage {
	

	public CriarContaPage() {
		PageFactory.initElements(driver, this);
	}

	// Elementos
	@FindBy(id = "email_create")
	public WebElement campoCriarEmail;

	@FindBy(xpath = "//a[@class='login']")
	public WebElement botaoSignIn;

	@FindBy(id = "SubmitCreate")
	public WebElement botaoCriarConta;

	// YOUR PERSONAL INFORMATION
	@FindBy(id = "id_gender1")
	private WebElement campoTitleMr;

	@FindBy(id = "id_gender2")
	private WebElement campoTitleMrs;

	@FindBy(id = "customer_firstname")
	private WebElement campoFirstidPersonal;

	@FindBy(id = "customer_lastname")
	private WebElement campoLastidPersonal;

	@FindBy(id = "email")
	private WebElement campoEmail;

	@FindBy(id = "passwd")
	private WebElement campoPassword;

	@FindBy(id = "days")
	private WebElement campoDia;

	@FindBy(id = "months")
	private WebElement campoMes;

	@FindBy(id = "years")
	private WebElement campoAno;

	@FindBy(id = "newsletter")
	private WebElement checkSign;

	@FindBy(id = "optin")
	private WebElement checkReceive;

	// YOUR ADDRESS
	@FindBy(id = "firstname")
	private WebElement campoFirstidAddres;

	@FindBy(id = "lastname")
	private WebElement campoLastidAddres;

	@FindBy(id = "company")
	private WebElement campoCompany;

	@FindBy(id = "address1")
	private WebElement campoAddres;

	@FindBy(id = "address2")
	private WebElement campoAddres2;

	@FindBy(id = "city")
	private WebElement campoCity;

	@FindBy(id = "id_state")
	private WebElement campoState;

	@FindBy(id = "postcode")
	private WebElement campoZipPostal;

	@FindBy(id = "id_country")
	private WebElement campoContry;

	@FindBy(id = "other")
	private WebElement campoAdditional;

	@FindBy(id = "phone_mobile")
	private WebElement campoHomePhone;

	@FindBy(id = "phone_mobile")
	private WebElement campoMobilePhone;

	@FindBy(id = "alias")
	private WebElement campoAssign;

	@FindBy(id = "submitAccount")
	private WebElement botaoRegister;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p")
	private WebElement mensagemCadastroSUcesso;

	// Metodos

	public void clicarNoBotaoSignin() {
		botaoSignIn.click();

	}

	public void preencherCampoEmail(String string) {
		campoCriarEmail.sendKeys(string);
	}

	public void clicarNoBotaoCriarConta() {
		botaoCriarConta.click();
	}

	public void informarTitle(String sexo) {
		if (sexo.equals("Mr")) {
			campoTitleMr.click();
		} else {
			campoTitleMrs.click();
		}

	}

	public void informarPrimeiroNome(String string) {
		campoFirstidPersonal.sendKeys(string);
	}

	public void informarSegundoNome(String string) {
		campoLastidPersonal.sendKeys(string);
	}

	public void informarEmail(String string) {
		campoEmail.sendKeys(string);
	}

	public void informarSenha(String string) {
		campoPassword.sendKeys(string);
	}

	public void informarDia(String string) {
		Select selecao = new Select(campoDia);
		selecao.selectByValue(string);
	}

	public void informarMes(String string) {
		Select selecao = new Select(campoMes);
		selecao.selectByValue(string);
	}

	public void informarAno(String string) {
		Select selecao = new Select(campoAno);
		selecao.selectByValue(string);
	}

	public void checkSign() {
		checkSign.click();
	}

	public void checkReceber() {
		checkReceive.click();
	}

	public void informarPrimeiroNomeEndereco(String string) {
		campoFirstidAddres.sendKeys(string);
	}

	public void informarUltimoNomeEndereco(String string) {
		campoLastidAddres.sendKeys(string);
	}

	public void informarCompanhia(String string) {
		campoCompany.sendKeys(string);
	}

	public void informarEnderco(String string) {
		campoAddres.sendKeys(string);
	}

	public void informarEndercoLinha(String string) {
		campoAddres2.sendKeys(string);
	}

	public void informarCidade(String string) {
		campoCity.sendKeys(string);
	}

	public void informarEstado(String string) {
		campoState.sendKeys(string);
	}

	public void informarZipCode(String string) {
		campoZipPostal.sendKeys(string);
	}

	public void informarCountry(String string) {
		campoContry.sendKeys(string);
	}

	public void informarTelefone(String string) {
		campoHomePhone.sendKeys(string);
	}

	public void informacoesAdicionais(String string) {
		campoAdditional.sendKeys(string);
	}

	public void informarEnderecoReferencia(String string) {
		campoAssign.sendKeys(string);
	}

	public void clicarNoBotaoRegister() {
		botaoRegister.click();
	}

	public void validaTelaCadastroSucesso() {
		assertTrue(mensagemCadastroSUcesso.isEnabled());
	}
	

}
