package webPages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elementMap.carrinhoElementMap;
import runner.TestRule;

public class CarrinhoPage extends carrinhoElementMap {

	public CarrinhoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void clickProduto() {

		lblProduto.click();
	}

	public void clickBtnAddCarrinho() {

		btnAddCarrinho.click();
	}

	public void clickBtnAddQuantidadeItem() {

		lblQtdeItem.click();
	}

	public void clickBtnReduQuantidadeItem() {

		btnReduQuantidade.click();
	}

	public void clickBtnRemovItem() {

		btnRemovItem.click();
	}

	public String getQtdeItem() {
		return lblQtdeItem.getText();
	}

	public String getValorTotalItem() {

		return lblValorTotalItem.getText();
	}

	public String getValorTotalPedido() {

		return lblQtdeItem.getText();
	}

	public void clickBtnFecharPedido() {

		btnAddCarrinho.click();
	}

}
