package br.com.rchlo.test;

import java.util.Collections;
import java.util.List;

import br.com.rchlo.domain.ListaDeProdutos;
import br.com.rchlo.domain.Produto;

public class OrdenacaoPorCodigoTest {

	public static void main(String[] args) {
		
		List<Produto> meusProdutos = ListaDeProdutos.lista();
		
		Collections.sort(meusProdutos);
		
		for (Produto produto : meusProdutos) {
			System.out.println(produto);
		}

	}

}
