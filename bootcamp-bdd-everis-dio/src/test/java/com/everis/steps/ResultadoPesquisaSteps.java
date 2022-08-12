package com.everis.steps;

import com.everis.pages.ResultadoPesquisaPage;

import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;

public class ResultadoPesquisaSteps {

	@Quando("^adiciona o produto \"(.*)\" ao carrinho$")
	public void adicionarProdutoAoCarrinho(String nomeProduto) {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.adicionarProdutoAoCarrinho(nomeProduto);
	}

	@E("^acessar o produto \"(.*)\"$")
	public void acessarProduto(String nomeProduto) {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.acessarProduto(nomeProduto);
	}

	
}