package Dicionario.Libras.controller;

import Dicionario.Libras.model.PostLibras;
import Dicionario.Libras.service.PostLibrasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class PostLibrasController {

    @Autowired
    PostLibrasServiceImpl postLibrasService;

    @GetMapping("/palavras")
    public List<PostLibras> SearchAll(){
        return postLibrasService.findAll();
    }

    @GetMapping("/palavras/{nome}")
    public Optional<List<PostLibras>> SearchByName(@PathVariable String nome){
        return postLibrasService.findByNameObject(nome);
    }

    @GetMapping("/palavras/categoria/{categoria}")
    public Optional<List<PostLibras>> SearchByCategoria(@PathVariable String categoria){
        return postLibrasService.findByCategoria(categoria);
    }
}
