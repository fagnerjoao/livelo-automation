@carrinho
Feature: Carrinho

 
@adicionar_item_carrinho 
Scenario: Adiconar item ao carrinho     
Given busco pelo produto "Smartphone Samsung Galaxy S20 128GB Cosmic Gray - Octa-Core" na barra de busca
When clico no produto
And clico no botão ADICIONAR AO CARRINHO   
And verifico que o item possui 1 unidade(s)
Then clico em FECHAR PEDIDO 



