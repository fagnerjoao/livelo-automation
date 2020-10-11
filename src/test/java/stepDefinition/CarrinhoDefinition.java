package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import webPages.CarrinhoPage;
import webPages.HomePage;

public class CarrinhoDefinition {
	HomePage homePage = new HomePage();
	CarrinhoPage carrinhoPage = new CarrinhoPage();

	@And("busco pelo produto {string} na barra de busca")
	public void busco_pelo_produto_na_barra_de_busca(String item) throws Throwable {

		homePage.clickBtnAuthorizeCoookies();
		homePage.buscarItem(item);

	}

	@When("clico no produto")
	public void selecionarProduto() {

		carrinhoPage.clickProduto();

	}

	@And("clico no botão ADICIONAR AO CARRINHO")
	public void clicarAddCerrinho() {
		carrinhoPage.clickBtnAddCarrinho();
	}

	@And("verifico que o item possui {int} unidade\\(s)")
	public void verifico_que_o_item_possui_unidade_s(Integer qtdeItem) {
		Assert.assertTrue(carrinhoPage.getQtdeItem().equals(qtdeItem));

	}

	@Then("clico em FECHAR PEDIDO")
	public void fechar_pedido() {

		carrinhoPage.clickBtnFecharPedido();

	}

}
