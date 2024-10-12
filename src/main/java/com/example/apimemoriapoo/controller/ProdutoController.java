package com.example.apimemoriapoo.controller;

import com.example.apimemoriapoo.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        produtos.put(2L, new Produto(
            3L,
            "Playstation 5",
            "Jogos impressionantes: Maravilhe-se com os gráficos incríveis e experimente os recursos do novo PS5.",
            2999.9
            )
        );
    }

    @GetMapping
    public Produto fetchRandom(){
        Random rand = new Random();

        Long n = rand.nextLong(1,3);
        return produtos.get(n);
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable Long id) {
        return produtos.get(id);
    }
}
