package br.com.rchlo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaDeProdutos {

    public static Produto[] todos() {

        return new Produto[]{
                new Produto(7L,
                        "Jaqueta Puffer Juvenil Com Capuz Super Mario Branco Tam 10 a 18",
                        "A Jaqueta Puffer Juvenil Com Capuz Super Mario Branco Tam 10 a 18 é confeccionada em material sintético. Possui estrutura ampla e modelo puffer, com capuz em pelúcia e bolsos frontais. Ideal para compor looks de inverno, mas sem perder o estilo. Combine com uma camiseta, calça jeans e tênis colorido.",
                        "jaqueta-puffer-juvenil-com-capuz-super-mario-branco-tam-10-a-18-13834193_sku",
                        "Nintendo",
                        new BigDecimal("199.90"),
                        null,
                        Cor.BRANCA,
                        Arrays.asList(Tamanho.GRANDE, Tamanho.EXTRA_GRANDE),
                        147,
                        "https://static.riachuelo.com.br/RCHLO/13834193003/portrait/3107b7473df334c6ff206cd78d16dec86d7dfe9a.jpg"),
                new Produto(11L,
                        "Camiseta Infantil Manga Curta Super Mario Azul Tam 4 a 10",
                        "A Camiseta Infantil Manga Curta Super Mario Azul Tam 4 a 10 é confeccionada em malha macia e possui decote careca, mangas curtas e padronagem do Super Mario. Aposte na peça na hora de compor visuais geek divertidos.",
                        "camiseta-infantil-manga-curta-super-mario-azul-tam-4-a-10-14124998_sku",
                        "Nintendo",
                        new BigDecimal("39.90"),
                        new BigDecimal("34.90"),
                        Cor.AZUL,
                        Arrays.asList(Tamanho.PEQUENO, Tamanho.MEDIO),
                        116,
                        "https://static.riachuelo.com.br/RCHLO/14124998004/portrait/cd948d80fe8a1fdc873f8dca1f3c4c468253bf1d.jpg"),
                new Produto(2L,
                        "Blusa de Moletom Infantil Mario Bros Vermelho Tam 4 a 10",
                        "A Blusa de Moletom Infantil Mario Bros Vermelho Tam 4 a 10 é quentinha e divertida! Com mangas longas e estampa frontal e posterior do Mario Bros, a blusa é ideal para compor visuais de inverno com um toque geek!",
                        "blusa-infantil-moletom-mario-bros-vermelho-tam-4-a-10-14125129_sku",
                        "Nintendo",
                        new BigDecimal("79.90"),
                        null,
                        Cor.VERMELHA,
                        Arrays.asList(Tamanho.PEQUENO, Tamanho.MEDIO, Tamanho.GRANDE),
                        126,
                        "https://static.riachuelo.com.br/RCHLO/14125129001/portrait/1fca71fe5a74a74b9e7bc38f5ef0cf1dae49d167.jpg"),
                new Produto(9L,
                        "Camiseta Infantil Manga Curta Super Mario Branco Tam 4 a 10",
                        "A Camiseta Infantil Manga Curta Super Mario Branco Tam 4 a 10 é confeccionada em malha macia de algodão e possui decote careca, mangas curtas e detalhe de estampa frontal e padronagem do Super Mario. Aposte na peça na hora de compor visuais geek divertidos.",
                        "camiseta-infantil-manga-curta-super-mario-branco-tam-4-a-10-14125021_sku",
                        "Nintendo",
                        new BigDecimal("49.90"),
                        new BigDecimal("44.90"),
                        Cor.BRANCA,
                        Arrays.asList(Tamanho.PEQUENO, Tamanho.MEDIO),
                        106,
                        "https://static.riachuelo.com.br/RCHLO/14125021001/portrait/a53fcda4f1ea1e04f5d67f4d4fe98248f25bcd73.jpg"),
                new Produto(1L,
                        "Regata Infantil Mario Bros Branco Tam 4 a 10",
                        "A Regata Infantil Mario Bros Branco Tam 4 a 10 é confeccionada em fibra natural, possui decote redondo e modelagem regular. As peças temáticas com os personagens preferidos da criançada são indispensáveis no guarda-roupa. Divertidas e cheias de personalidade, os modelos são uma forma dos pequenos se expressarem em relação aos seus gostos pessoais, que já começam desde cedo. Aposte!",
                        "regata-infantil-mario-bros-branco-14040174_sku",
                        "Nintendo",
                        new BigDecimal("29.90"),
                        null,
                        Cor.BRANCA,
                        Arrays.asList(Tamanho.PEQUENO, Tamanho.MEDIO, Tamanho.GRANDE),
                        98,
                        "https://static.riachuelo.com.br/RCHLO/14040174004/portrait/f10a3e016dd974dbdc7dfaefa41a47599557a58a.jpg")};
    }

    public static List<Produto> lista() {
        List<Produto> produtos = new ArrayList<>();
        for (Produto produto : todos()) {
            produtos.add(produto);
        }
        return produtos;
    }

}
