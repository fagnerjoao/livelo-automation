package webPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import elementMap.loginElementMap;
import runner.TestRule;

public class LoginPage extends loginElementMap {

	public LoginPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void clickUserName() {
		inputUserName.click();
	}

	public void setUserName(String email) {
		inputUserName.click();
		inputUserName.sendKeys(email);
		inputUserName.sendKeys(Keys.ENTER);
	}

	public void clickBtnContinuar() {
		btnContinuar.click();
	}

	public void setPassword(String senha) {
		inputPassword.click();
		inputPassword.sendKeys(senha);
	}

}
