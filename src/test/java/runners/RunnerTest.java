package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
				plugin = {"pretty","html:target/cucumber-report", "json:target/cucumber-report/cucumber.json" },
				features = "src/test/resources/features/", 
				glue = "stepsDefinitions", 
				//tags = {"@CE001CadastrarStartup"}, 
				snippets = SnippetType.CAMELCASE, 
				monochrome = true, 
				dryRun = false)

public class RunnerTest {

}
