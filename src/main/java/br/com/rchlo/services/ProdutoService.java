package br.com.rchlo.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.rchlo.domain.ListaDeProdutos;
import br.com.rchlo.domain.Produto;

public class ProdutoService {

	List<Produto> meusProdutos = ListaDeProdutos.lista();

	public List<Produto> ordenaProdutoPorPeso(List<Produto> produtos) {

		if(produtos != null) {			
			return produtos.stream()
					.sorted(Comparator.comparing(Produto::getPesoEmGramas))
					.collect(Collectors
							.toUnmodifiableList());
		}else {
			throw new IllegalArgumentException("Lista inválida");
		}

	}

	public List<Produto> ordenaProdutoPorNome(List<Produto> produtos) {

		if(produtos != null) {
			return produtos.stream()
					.sorted(Comparator.comparing(Produto::getNome))
					.collect(Collectors.toUnmodifiableList());			
		}else {
			throw new IllegalArgumentException("Lista inválida");
		}

	}

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

	public List<Produto> ordenaProdutoPorCodigo(List<Produto> produtos) {
		
		if(produtos != null) {			
			return produtos.stream()
					.sorted(Comparator.comparing(Produto::getCodigo))
					.collect(Collectors
							.toUnmodifiableList());
		}else {
			throw new IllegalArgumentException("Lista inválida");
		}
	}

	public List<Produto> ordenaProdutoPorPreco(List<Produto> produtos) {

		ordena(produtos, 0, produtos.size() - 1);
		return Collections.unmodifiableList(produtos);

	}

	private static void ordena(List<Produto> array, int indiceInicio, int indiceFim) {

		if (array != null && indiceInicio < indiceFim && indiceInicio >= 0 && indiceFim < array.size()
				&& array.size() != 0) {

			int meio = ((indiceFim + indiceInicio) / 2);

			ordena(array, indiceInicio, meio);
			ordena(array, meio + 1, indiceFim);

			merge(array, indiceInicio, meio, indiceFim);

		}
	}

	private static void merge(List<Produto> array, int indiceInicio, int meio, int indiceFim) {

		List<Produto> aux = new ArrayList<>(array);

		// Índice auxiliares
		int i = indiceInicio;
		int j = meio + 1;
		int k = indiceInicio;

		// merge da lista ordenadas
		while (i <= meio && j <= indiceFim) {
			if (aux.get(i).getPrecoEfetivo().compareTo(aux.get(j).getPrecoEfetivo()) < 0) {
				array.remove(k);
				array.add(k, aux.get(i));
				i++;
			} else {
				array.remove(k);
				array.add(k, aux.get(j));
				j++;
			}
			k++;
		}

		while (i <= meio) {
			array.remove(k);
			array.add(k, aux.get(i));
			i++;
			k++;
		}

		while (j <= meio) {
			array.remove(k);
			array.add(k, aux.get(j));
			i++;
			k++;
		}

	}

}
