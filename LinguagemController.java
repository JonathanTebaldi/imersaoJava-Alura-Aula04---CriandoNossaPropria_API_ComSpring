package br.com.alura.linguagens.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repositorio;

    @GetMapping ("/linguagens")
    public List<Linguagem> obterLinguagens(){
        List<Linguagem> linguagens = repositorio.findAll(); //do BD
        return linguagens;
    }

    @PostMapping("/linguagens")
    public Linguagem cadastrarlinguagem(@RequestBody Linguagem linguagen){
            Linguagem linguagemSalva = repositorio.save(linguagem);
            return linguagemSalva;
    }
}
