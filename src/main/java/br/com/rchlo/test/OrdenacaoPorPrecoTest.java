package br.com.rchlo.test;

import java.util.ArrayList;
import java.util.List;

import br.com.rchlo.domain.ListaDeProdutos;
import br.com.rchlo.domain.Produto;
import br.com.rchlo.services.ProdutoService;

public class OrdenacaoPorPrecoTest {

	public static void main(String[] args) {
		
		ProdutoService ps = new ProdutoService();
		List<Produto> meusProdutos = ListaDeProdutos.lista();
		
		ps.ordenaProdutoPorPreco(meusProdutos);
		
		meusProdutos.forEach(p -> System.out.println(p.getPrecoEfetivo() + " " + p.getNome()));
		
		
		
	}

}
