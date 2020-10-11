package runner;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestRule {

	public static WebDriver driver;

	@Before
	public void beforeCenario() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/fagner.joao.f.silva/eclipse-workspace/livelo-automation/src/test/resources/chromedriver/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars", "--disable-gpu", "--window-size=1920,1200",
				"--ignore-certificate-errors", "--disable-notifications", "--disable-popup-blocking");

		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.livelo.com.br");
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@After
	public void cleanCookies() {
		driver.manage().deleteAllCookies();
		driver.close();
	}

}
