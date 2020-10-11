package elementMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homeElementMap {

	@FindBy(id = "btn-authorizeCoookies")
	protected WebElement btnAuthorizeCoookies;

	@FindBy(id = "span-loginInvitationText")
	protected WebElement spanLogin;

	@FindBy(id = "a-buttonLogin")
	protected WebElement btnLogin;

	@FindBy(id = "input-search")
	protected WebElement btnBuscar;

	@FindBy(xpath = "//*[@id=\"wi7700001-search-typeahead-id\"][last()]")
	protected WebElement btnBuscarX;

	@FindBy(id = "btClose")
	// @FindBy(className = "btn")
	// @FindBy(xpath = "//*[@id=\"pushOptIn\"]/body/div[1]")
	protected WebElement btnFechar;

	@FindBy(id = "btGo")
	protected WebElement popUp;

}
