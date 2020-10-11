package webPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elementMap.homeElementMap;
import runner.TestRule;

public class HomePage extends homeElementMap {

	public HomePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void clickBtnAuthorizeCoookies() {
		btnAuthorizeCoookies.click();
	}

	public void clickFacaLogin() {
		spanLogin.click();
	}

	public void clickbtnLogin() {
		btnLogin.click();
	}

	public void buscarItem(String item) throws Throwable {

		btnBuscar.click();
		btnBuscar.sendKeys(item);
		btnBuscar.sendKeys(Keys.ENTER);

	}

	public void clickBtnFecharPopUp() {
		btnFechar.click();
	}

}
