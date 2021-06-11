package br.com.rchlo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.rchlo.domain.Cor;
import br.com.rchlo.domain.ListaDeProdutos;
import br.com.rchlo.domain.Produto;
import br.com.rchlo.services.ProdutoService;

public class BuscaBinariaPorCriterioTest {

	public static void main(String[] args) {

		List<Produto> produtos = ListaDeProdutos.lista();
		ProdutoService ps = new ProdutoService();

		// busca bin�ria por c�digo
		System.out.println("Busca por um c�digo");
		System.out.println(ps.buscarPorCodigo(11L) + "\n");

		// busca bin�ria por cor
		System.out.println("Busca por uma cor");
		for (Cor cor : Cor.values()) {
			System.out.println(ps.buscarPorCor(cor) + "\n");
		}
		
		System.out.println(ps.buscarPorCor(null) + "\n");		

	}

}
