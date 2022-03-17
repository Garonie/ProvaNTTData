package utils;

import static utils.Utils.driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static utils.Utils.acessarSistema;

public class Hooks {

	@Before
	public void beforeScenario() throws InterruptedException {
		acessarSistema();
	}

	@After(order = 0)
	public void afterScenario(Scenario scenario) {
		driver.quit();
	}

}
