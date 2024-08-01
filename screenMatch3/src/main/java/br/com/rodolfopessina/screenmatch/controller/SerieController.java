package br.com.rodolfopessina.screenmatch.controller;

import br.com.rodolfopessina.screenmatch.model.Serie;
import br.com.rodolfopessina.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieRepository repository;

    @GetMapping("/series")
    public List<Serie> obterSerie(){
        return repository.findAll();
    }
    
}
