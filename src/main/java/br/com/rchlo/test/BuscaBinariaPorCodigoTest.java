package br.com.rchlo.test;

import java.util.Collections;
import java.util.List;

import br.com.rchlo.domain.ListaDeProdutos;
import br.com.rchlo.domain.Produto;

public class BuscaBinariaPorCodigoTest {

	private static List<Produto> meusProdutos = ListaDeProdutos.lista();

	public static void main(String[] args) {

		// código válido de um produto existente
		Produto resultado = buscarPorCodigo(7L);
		if (resultado != null) {
			System.out.println(resultado);
		} else {
			System.out.println("Produto não encontrado");
		}

		// código válido de um produto inexistente
		resultado = buscarPorCodigo(122L);
		if (resultado != null) {
			System.out.println(resultado);
		} else {
			System.out.println("Produto não encontrado");
		}		

		// código inválido
		resultado = buscarPorCodigo(0L);
		if (resultado != null) {
			System.out.println(resultado);
		} else {
			System.out.println("Produto não encontrado");
		}


	}

	private static Produto buscarPorCodigo(Long codigo) {

		if (codigo <= 0) {
			throw new IllegalArgumentException("Código inválido");
		} else {

			Collections.sort(meusProdutos);
			Produto produtoProcurado = new Produto(codigo);
			int index = Collections.binarySearch(meusProdutos, produtoProcurado);
			if (index < 0) {
				return null;
			} else {
				return meusProdutos.get(index);
			}

		}

	}

}
