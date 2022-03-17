package pageObjects.TelaHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//a[@translate='SPACIAL_OFFER']")
	public WebElement SpecialOfferLink;

	@FindBy(id = "see_offer_btn")
	public WebElement SeeOfferLink;

	public void acessa_o_menu_Special_Offer() throws InterruptedException {
		Thread.sleep(3500);
				//SpecialOfferLink.click();
	}

	public void clica_no_botao_See_offer() {
		SeeOfferLink.click();
	}
}
