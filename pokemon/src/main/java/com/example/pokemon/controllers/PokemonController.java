package com.example.pokemon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@CrossOrigin(origins = http://localhost:3000)
@RestController
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    private WebClient webClint = WebClient.create();

    @GetMapping("/collection")
    public List<Pokemon> getCollection() {
        return (List<Pokemon> pokemonRepository.findAll());
    }

    @GetMapping("/server-pokemon")
    public Mono<Pokemon>  getServerPokemon() {
        return WebClient.get()
        .uri("https://pokeapi.co/api/vs/pokemon-species")
        .retrieve()

    }
    }
    

