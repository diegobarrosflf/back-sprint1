package br.com.rchlo.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.rchlo.domain.ListaDeProdutos;
import br.com.rchlo.domain.Produto;

public class ProdutoService {

	List<Produto> meusProdutos = ListaDeProdutos.lista();

	public Produto buscarPorCodigo(Long codigo) {

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

	public List<Produto> listarProdutosPorCor(String cor) {

		if (cor == null) {
			throw new IllegalArgumentException("Cor inválida!");
		} else {
			List<Produto> produtosPorCor = new ArrayList<>();
			for (Produto produto : meusProdutos) {
				if ((produto.getCor().toString().equalsIgnoreCase(cor))) {
					produtosPorCor.add(produto);
				}
			}
			return Collections.unmodifiableList(produtosPorCor);
		}
	}

	public List<Produto> ordenaProdutoPorCodigo() {
		Collections.sort(meusProdutos);
		return Collections.unmodifiableList(meusProdutos);
	}

}
