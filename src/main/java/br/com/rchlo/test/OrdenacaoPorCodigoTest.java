package br.com.rchlo.test;

import java.util.Collections;
import java.util.List;

import br.com.rchlo.domain.ListaDeProdutos;
import br.com.rchlo.domain.Produto;
import br.com.rchlo.services.ProdutoService;

public class OrdenacaoPorCodigoTest {

	public static void main(String[] args) {
		
		ProdutoService ps = new ProdutoService();
		
		System.out.println("<**** Produtos ordenados por código ****>");
		ps.ordenaProdutoPorCodigo().forEach(p -> System.out.println(p));

	}

}
