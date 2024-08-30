#language: pt
#Author: Camila de Sousa Oliveira
# Version: 1.0
#Encoding: UTF-8

Funcionalidade: Incluir Produto
	# Fluxo de inclusão de produtos no carrinho do Site Advantage
	# Envolve as páginas Home, Resultado da Consulta e Carrinho de compras

  @TESTEINCLUSAO
  Cenario: Validar inclusão de produto
    Dado que acesso o site Advantage
    Quando busco por mice e pressiono Enter
    E exibe uma lista de produtos relacionados com mice
    E clico no produto mice escolhido
    E clico em ADD TO CART
    Entao exibe carrinho com o produto incluido
