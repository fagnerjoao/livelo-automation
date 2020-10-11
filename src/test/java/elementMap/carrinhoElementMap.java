package elementMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class carrinhoElementMap {

	@FindBy(id = "CC-product-list-name-LVL11375381-00")
	protected WebElement lblProduto;

	@FindBy(id = "CC-prodDetails-addToCart")
	protected WebElement btnAddCarrinho;

	@FindBy(id = "qtd-ci14595984234561")
	protected WebElement lblQtdeItem;

	@FindBy(id = "plus-ci14595984234561")
	protected WebElement btnAddQuantidade;

	@FindBy(id = "minus-ci14595984234561")
	protected WebElement btnReduQuantidade;

	@FindBy(id = "remove-ci14595984234561")
	protected WebElement btnRemovItem;

	@FindBy(id = "total-ci11550321626061")
	protected WebElement lblValorTotalItem;

	@FindBy(xpath = "//*[@id=\"custom-cart-summary_v1-wi2000039\"]/section/div[2]/form/div/div/label/span")
	protected WebElement lblTotal;

	@FindBy(id = "ctaCheckout")
	protected WebElement btnFecharPedido;

}
