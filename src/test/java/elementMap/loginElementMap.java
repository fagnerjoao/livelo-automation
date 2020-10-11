package elementMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginElementMap {

	@FindBy(id = "username")
	protected WebElement inputUserName;

	@FindBy(id = "btn-submit")
	protected WebElement btnContinuar;

	@FindBy(id = "password")
	protected WebElement inputPassword;

	@FindBy(id = "a-resetPassword")
	protected WebElement linkResetPassword;

	@FindBy(id = "a-backToSite")
	protected WebElement linkBackToSite;

}
