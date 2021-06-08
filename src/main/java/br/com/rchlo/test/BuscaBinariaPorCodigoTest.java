package br.com.rchlo.test;

import java.util.Collections;
import java.util.List;

import br.com.rchlo.domain.ListaDeProdutos;
import br.com.rchlo.domain.Produto;
import br.com.rchlo.services.ProdutoService;

public class BuscaBinariaPorCodigoTest {

	public static void main(String[] args) {
		
		ProdutoService ps = new ProdutoService();

		// c�digo v�lido de um produto existente
		Produto resultado = ps.buscarPorCodigo(7L);
		if (resultado != null) {
			System.out.println(resultado);
		} else {
			System.out.println("Produto n�o encontrado");
		}

		// c�digo v�lido de um produto inexistente
		resultado = ps.buscarPorCodigo(122L);
		if (resultado != null) {
			System.out.println(resultado);
		} else {
			System.out.println("Produto n�o encontrado");
		}

		// c�digo inv�lido
		resultado = ps.buscarPorCodigo(0L);
		if (resultado != null) {
			System.out.println(resultado);
		} else {
			System.out.println("Produto n�o encontrado");
		}

	}

}
