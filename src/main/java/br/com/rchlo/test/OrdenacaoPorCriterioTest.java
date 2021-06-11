package br.com.rchlo.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.rchlo.domain.ListaDeProdutos;
import br.com.rchlo.domain.Produto;
import br.com.rchlo.services.ProdutoService;

public class OrdenacaoPorCriterioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Produto> produtos = ListaDeProdutos.lista();
		ProdutoService ps = new ProdutoService();
		
		// Ordena por código
		System.out.println("Produtos por código"); 
		ps.ordenaProdutoPorCodigo(produtos).forEach(p -> System.out.println(p.getCodigo()));
		System.out.println(" ");

		// Ordena pelo nome
		System.out.println("Produtos por nome");
		ps.ordenaProdutoPorNome(produtos).forEach(p -> System.out.println(p.getNome()));
		System.out.println(" ");

		// ordena pelo peso
		System.out.println("Produtos por peso");
		ps.ordenaProdutoPorPeso(produtos).forEach(p -> System.out.println(p.getPesoEmGramas()));
		System.out.println(" ");

		// Ordena ple preço
		System.out.println("Produtos por preço");
		ps.ordenaProdutoPorPreco(produtos).forEach(p -> System.out.println(p.getPrecoEfetivo()));
		System.out.println(" ");

	}

}
