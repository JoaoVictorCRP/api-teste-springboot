package com.example.apimemoriapoo.controller;

import com.example.apimemoriapoo.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/produto") // Quem responde em /produto é o ProdutoController
public class ProdutoController {
    //Simulando banco de dados
    private static final Map<Long, Produto> produtos = new HashMap<Long, Produto>();
    static {
        produtos.put(1L, new Produto(
            1L,
            "Macbook Air",
            "Processador M1 concebido pela Apple para um enorme avanço no desempenho da CPU, GPU e aprendizagem automática",
            4999.9
            )
        );
        produtos.put(2L, new Produto(
            2L,
            "Xbox Series X",
            "Descubra o Xbox mais rápido e potente de todos os tempos com o Xbox Series X. Aproveite os jogos em 4K em até 120 quadros por segundo nesse console de última geração.",
            2599.9
            )
        );
        produtos.put(3L, new Produto(
            3L,
            "Playstation 5",
            "Jogos impressionantes: Maravilhe-se com os gráficos incríveis e experimente os recursos do novo PS5.",
            2999.9
            )
        );
        produtos.put(4L, new Produto(
            4L,
            "Steam Deck",
            "Com seu console Steam Deck você terá entretenimento garantido todos os dias. Sua tecnologia foi criada para colocar novos desafios para jogadores novatos e especialistas. Adaptado às suas necessidades Salve as suas aplicações, fotos, vídeos e muito mais no disco rígido, que tem uma capacidade de 512 GB.",
            4999.9
            )
        );
        produtos.put(5L, new Produto(
            5L,
            "Teclado Gamer Redragon",
            "Seu design arrojado e cores vibrantes adicionam estilo à configuração. A resposta tátil e a iluminação ajustável são perfeitas para jogos intensos.",
            2999.9
            )
        );
    }

    @GetMapping
    public Map<Long, Produto> fetch(){
        return produtos;
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable Long id) {
        return produtos.get(id);
    }

    @PostMapping
    public Produto addProduto(@RequestBody Produto produto) {
        produtos.put(produto.getId(), produto);
        return produto;
    }

    @DeleteMapping("/{id}")
    public Produto deleteProduto(@PathVariable Long id) {
        return produtos.remove(id);
    }

    @PatchMapping("/{id}")
    public Produto updateProduto(@RequestBody Produto produto, @PathVariable Long id) {
        produto.setId(id);
        return produtos.put(id, produto);
    }
}
