package br.com.rchlo.test;

import java.util.ArrayList;
import java.util.List;

import br.com.rchlo.domain.Cor;
import br.com.rchlo.domain.ListaDeProdutos;
import br.com.rchlo.domain.Produto;

public class FiltrarProdutoPorCor {

	public static void main(String[] args) {

		List<Produto> meusProdutos = ListaDeProdutos.lista();

		for (Cor cor : Cor.values()) {
			System.out.println("Roupas da cor: " + cor);
			filtrarProdutosPorCor(meusProdutos, cor.toString()).forEach(p -> System.out.println(p));
			System.out.println("\n");
		}

	}

	private static List<Produto> filtrarProdutosPorCor(List<Produto> produtos, String cor) {

		if (produtos == null || cor == null) {
			throw new IllegalArgumentException("Lista ou cor inválida!");
		} else {

			List<Produto> produtosPorCor = new ArrayList<>();

			for (Produto produto : produtos) {

				if ((produto.getCor().toString().equalsIgnoreCase(cor))) {
					produtosPorCor.add(produto);

				}

			}

			return produtosPorCor;

		}

	}

}
