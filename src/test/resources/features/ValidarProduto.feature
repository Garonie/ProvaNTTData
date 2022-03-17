#language:pt
#enconding: UTF-8
Funcionalidade: Validar Produto


Como usuario
Quero poder acessar a pagina dos produtos
Para poder validar as informacoes
  
  
  Contexto:
    Dado que o usuario acesse o site
    
  @CE001ValidarEspecificacoesProduto
 Cenario:  Validar especificacoes do produto
  E o usuario acessa o menu Special Offer
  Quando o usuario clica no botao See offer
  Entao o sistema deve validar as informacoes de acordo com o banco da automacao