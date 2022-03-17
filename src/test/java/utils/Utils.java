package utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.api.Scenario;
import io.qameta.allure.Allure;

public class Utils {

	public static WebDriver driver;

	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://advantageonlineshopping.com");
	}

	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}

	public static void anexar(String path) {
		driver.findElement(By.xpath("//*[@id=\"uploadFile\"]"));
		String diretorio = System.getProperty("user.dir");
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		fileInput.sendKeys(path);
	}

	public static void capturarTela(Scenario scenario) {
		File screenshot = gerarScreenShot(scenario);
		embedScreenshot(screenshot, scenario.getName());
	}

	public static File gerarScreenShot(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
		File imagem = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem, (new File("./target/surefire-reports",
					scenario.getName() + " - " + scenario.getStatus() + ".png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return imagem;
	}

	public static void embedScreenshot(File file, String description) {
		Path content = Paths.get(file.getPath());
		try (InputStream is = Files.newInputStream(content)) {
			Allure.addAttachment(description, is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void evidencia(Scenario scenario) {
//      if (scenario.isFailed()) {
		scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
//      }
	}

}
