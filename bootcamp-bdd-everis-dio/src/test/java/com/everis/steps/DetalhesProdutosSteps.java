package com.everis.steps;

import com.everis.pages.DetalhesProdutosPages;


import io.cucumber.java.pt.E;

public class DetalhesProdutosSteps {

    @E("^aumenta a quantidade produto \"(.*)\"$")
	public void aumentarQuantidadeProduto() {
	    DetalhesProdutosPages detalhesProdutosPages = new DetalhesProdutosPages();
		detalhesProdutosPages.aumentarQuantidadeProduto();
	}


    
}
