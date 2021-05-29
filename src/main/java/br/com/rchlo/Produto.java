package br.com.rchlo;

import java.math.BigDecimal;
import java.util.List;

public class Produto {

    private Long codigo;
    private String nome;
    private String descricao;
    private String slug;
    private String marca;
    private BigDecimal preco;
    private BigDecimal precoDesconto;
    private Cor cor;
    private List<Tamanho> tamanhosDisponiveis;
    private Integer pesoEmGramas;
    private String urlImagem;

    public Produto(Long codigo) {
        this.codigo = codigo;
    }

    public Produto(Long codigo, String nome, String descricao, String slug, String marca, BigDecimal preco, BigDecimal precoDesconto, Cor cor, List<Tamanho> tamanhosDisponiveis, Integer pesoEmGramas, String urlImagem) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.slug = slug;
        this.marca = marca;
        this.preco = preco;
        this.precoDesconto = precoDesconto;
        this.cor = cor;
        this.tamanhosDisponiveis = tamanhosDisponiveis;
        this.pesoEmGramas = pesoEmGramas;
        this.urlImagem = urlImagem;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto(BigDecimal precoDesconto) {
        this.precoDesconto = precoDesconto;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public List<Tamanho> getTamanhosDisponiveis() {
        return tamanhosDisponiveis;
    }

    public void setTamanhosDisponiveis(List<Tamanho> tamanhosDisponiveis) {
        this.tamanhosDisponiveis = tamanhosDisponiveis;
    }

    public Integer getPesoEmGramas() {
        return pesoEmGramas;
    }

    public void setPesoEmGramas(Integer pesoEmGramas) {
        this.pesoEmGramas = pesoEmGramas;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", slug='" + slug + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                ", precoDesconto=" + precoDesconto +
                ", cor=" + cor +
                ", tamanhosDisponiveis=" + tamanhosDisponiveis +
                ", pesoEmGramas=" + pesoEmGramas +
                ", urlImagem='" + urlImagem + '\'' +
                '}';
    }
}
