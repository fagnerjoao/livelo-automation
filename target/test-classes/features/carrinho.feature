@login
Feature: Carrinho

 
@adicionar_item_carrinho @carrinho
Scenario: Efetuar Login     
Given estou na página inicial
And faço login com o e-mail "fagnerjoao@gmail.com" e a senha 102468
When informo o produto "Smartphone Samsung Galaxy S20 128GB Cosmic Gray - Octa-Core" na barra de busca
And clico na lupa
And clico no produto
And clico no botão ADICIONAR AO CARRINHO
Then verifico a mensagem "Pontos Insuficientes"