package com.example.apimemoriapoo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // Definição de rota (endpoint) -     OBS: Toda a classe está associada ao endpoint hello
public class HelloWorldController {

    @GetMapping // Método principal da classe (rota /hello)
    public String helloWorld() {
        return "Hello World!";
    }
    
    @GetMapping("/boanoite/{nome}") // Path Variable fica na URL, entre chaves.
    public String boaNoite(@PathVariable String nome) {
        return "Boa Noite, " + nome + "!";
    }
}
