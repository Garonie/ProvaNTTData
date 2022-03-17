package utils;

import static utils.Utils.driver;
import static utils.Utils.gerarScreenShot;
import static utils.Utils.*;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	 @Before
	    public void beforeScenario() throws InterruptedException{
	       acessarSistema();
	    } 
	 
	 @After(order = 1)
	    public void afterScenario(Scenario scenario){
		 gerarScreenShot(scenario);
		driver.quit();
	    }
	 
	 @After(order = 0, value = "@")
		public void support(Scenario scenario) throws InterruptedException {
			evidencia(scenario);
			Utils.capturarTela(scenario);
		}
	}
