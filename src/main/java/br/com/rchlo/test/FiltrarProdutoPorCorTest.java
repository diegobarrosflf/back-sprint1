package br.com.rchlo.test;

import br.com.rchlo.domain.Cor;
import br.com.rchlo.services.ProdutoService;

public class FiltrarProdutoPorCorTest {

	public static void main(String[] args) {
		
		ProdutoService ps = new ProdutoService();
		
		for (Cor cor : Cor.values()) {
			System.out.println("Roupas da cor: " + cor);
			ps.listarProdutosPorCor(cor.toString()).forEach(p -> System.out.println(p));
			System.out.println("\n");
		}

	}


}
